package com.hak.config.security;

import com.hak.mysite.model.TMenu;
import com.hak.mysite.model.TRoles;
import com.hak.mysite.model.vo.TMenuAndRoleVo;
import com.hak.mysite.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

/**
  * @author hak
  * @description Custom permission resource filter to realize dynamic permission verification
  * Its main responsibility is to return the access permissions required by the url when accessing a url
  * @date 2020/8/26
  */
@Component
public class MyFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MenuService menuService;

    /**
     * Return the permissions required for this visit, there can be multiple permissions
     *
     * @param object
     * @Return java.util.Collection<org.springframework.security.access.ConfigAttribute>
     * @Exception Exception
     * @author hak
     * @date 2020/8/26
     */
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) object).getRequestUrl();
        //Go to the database to query resources
        List<TMenuAndRoleVo> allMenu = menuService.getAllTMenuAndRoleList();
        for (TMenuAndRoleVo menu : allMenu) {
            if (requestUrl.contains(menu.getMenuUrl()) && menu.getRoleList().size() > 0) {
                List<TRoles> roles = menu.getRoleList();
                int size = roles.size();
                String[] values = new String[size];
                for (int i = 0; i < size; i++) {
                    values[i] = roles.get(i).getRoleName();
                }
                //logger.info("The current access path is {}, the access permission required for this url is {}", requestUrl, values);
                return SecurityConfig.createList(values);
            }
        }
        //logger.info("The current access path is {}, the access permission required for this url is {}", requestUrl, "ROLE_LOGIN");
        return SecurityConfig.createList("ROLE_LOGIN");
    }

   /**
      * If the method here is implemented, it returns a list of defined permissions resources,
      * Spring Security will verify whether each ConfigAttribute is configured correctly at startup,
      * If verification is not required, implement the method here, and the method body can return null directly.
      *
      * @param
      * @Return java.util.Collection<org.springframework.security.access.ConfigAttribute>
      * @Exception Exception
      * @author hak
      * @date 2020/8/26
      */
     @Override
     public Collection<ConfigAttribute> getAllConfigAttributes() {
         return null;
     }

     /**
      * Method returns whether the class object supports verification,
      * Web projects generally use FilterInvocation to judge, or return true directly
      *
      * @param clazz
      * @Return boolean
      * @Exception Exception
      * @author hak
      * @date 2020/8/26
      */
    @Override
    public boolean supports(Class<?> clazz) {

        return FilterInvocation.class.isAssignableFrom(clazz);
    }
}
