package com.hak.config.security;

import com.hak.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

/**
 * @author hak
 * @description
 * @date 2020/8/11
 */
@EnableWebSecurity
public class MyWebSecurityConfg extends WebSecurityConfigurerAdapter {

    @Autowired
    MyLoginFailureHandler myLoginFailureHandler;
    @Autowired
    MyLoginSuccessHandler myLoginSuccessHandler;
    @Autowired
    CustomExpiredSessionStrategy customExpiredSessionStrategy;
    //权限过滤器
    @Autowired
    private MyFilterInvocationSecurityMetadataSource myFilterInvocationSecurityMetadataSource;
    //权限决策器
    @Autowired
    private MyAccessDecisionManager myAccessDecisionManager;

    @Autowired
    private MyUserDetailsService myUserDetailsService;

    /**
     * 授权
     *
     * @param http
     * @Return void
     * @Exception Exception
     * @author hak
     * @date 2020/8/11
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //解决 X-Frame-Options' to 'DENY'
        http.headers().frameOptions().disable();
        //session 操作
        http.sessionManagement().invalidSessionUrl("/admin/login")
                //当达到最大值时，是否保留已经登录的用户
                .maximumSessions(1)
                //当达到最大值时，旧用户被踢出后的操作
                .maxSessionsPreventsLogin(false)
                //当达到最大值时，旧用户被踢出后的操作
                .expiredSessionStrategy(customExpiredSessionStrategy);

        // 配置拦截规则
        http.authorizeRequests()
                .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
                    @Override
                    public <O extends FilterSecurityInterceptor> O postProcess(O o) {
                        o.setAccessDecisionManager(myAccessDecisionManager);
                        o.setSecurityMetadataSource(myFilterInvocationSecurityMetadataSource);
                        return o;
                    }
                })
                .and()
                // 配置登录功能
                .formLogin()
                .loginPage("/admin/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .loginProcessingUrl("/admin/logon")
                .failureHandler(myLoginFailureHandler)
                .successHandler(myLoginSuccessHandler)
                .permitAll()
/*                .defaultSuccessUrl("/admin/index",true)
                .failureForwardUrl("/admin/login?error")*/
                .and()
                .csrf().disable();
        // 注销成功跳转首页
        http.logout().logoutSuccessUrl("/admin/login");
        //开启记住我功能
        http.rememberMe().rememberMeParameter("rememberMe");
    }

    /**
     * 认证
     *
     * @param auth
     * @Return void
     * @Exception Exception
     * @author hak
     * @date 2020/8/11
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

            auth.userDetailsService(myUserDetailsService).passwordEncoder(new PasswordEncoder() {

            @Override
            public String encode(CharSequence rawPassword) {
                return MD5Util.encode((String) rawPassword);
            }

            @Override
            public boolean matches(CharSequence rawPassword, String encodedPassword) {
                return encodedPassword.equals(MD5Util.encode((String) rawPassword));
            }
        });

    }

    /**
     * 配置放行的资源
     *
     * @param web
     * @Return void
     * @Exception Exception
     * @author hak
     * @date 2020/8/26
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/")
                .antMatchers("/home")
                .antMatchers("/blog")
                .antMatchers("/about")
                .antMatchers("/contact")
                .antMatchers("/single")
                .antMatchers("/admin/login")
                .antMatchers("/admin/js/**")
                .antMatchers("/admin/css/**")
                .antMatchers("/admin/layui/**")
                .antMatchers("/admin/editormd/**")
                .antMatchers("/site/js/**")
                .antMatchers("/site/images/**")
                .antMatchers("/site/fonts/**")
                .antMatchers("/site/font-awesome/**")
                .antMatchers("/site/css/**")
                .antMatchers("/site/layui/**")
                .antMatchers("/site/editormd/**")
                .antMatchers("/500")
                .antMatchers("/403")
                .antMatchers("/404")
                .antMatchers("/images/**");
    }

}
