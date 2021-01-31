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
    //Permission filter
    @Autowired
    private MyFilterInvocationSecurityMetadataSource myFilterInvocationSecurityMetadataSource;
    //Permission Decider
    @Autowired
    private MyAccessDecisionManager myAccessDecisionManager;

    @Autowired
    private MyUserDetailsService myUserDetailsService;

    /**
     * Authorization
     *
     * @param http
     * @Return void
     * @Exception Exception
     * @author hak
     * @date 2020/8/11
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //Solve X-Frame-Options' to'DENY'
        http.headers().frameOptions().disable();
        //session operation
        http.sessionManagement().invalidSessionUrl("/admin/login")
                //When the maximum value is reached, whether to keep logged in users
                .maximumSessions(1)
                //Operation after the old user is kicked out when the maximum is reached
                .maxSessionsPreventsLogin(false)
                //Operation after the old user is kicked out when the maximum is reached
                .expiredSessionStrategy(customExpiredSessionStrategy);

        // Configure interception rules
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
                // Configure login function
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
        // Log out successfully and jump to the homepage
        http.logout().logoutSuccessUrl("/admin/login");
        //Turn on remember me function
        http.rememberMe().rememberMeParameter("rememberMe");
    }

    /**
     * Certification
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
     * Configure release resources
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
