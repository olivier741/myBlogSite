package com.hak.config.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.FilterInvocation;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author hak
 * @description  Custom permission decision manager
 * @date 2020/8/26
 */
@Component
public class MyAccessDecisionManager implements AccessDecisionManager {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes) throws AccessDeniedException, InsufficientAuthenticationException {
        Iterator<ConfigAttribute> iterator = configAttributes.iterator();
        while (iterator.hasNext()) {
            if (authentication == null) {
            throw new AccessDeniedException("The current access does not have permission");
            }
            ConfigAttribute ca = iterator.next();
            //The permissions required for the current request
            String needRole = ca.getAttribute();
            if ("ROLE_LOGIN".equals(needRole)) {
                if (authentication instanceof AnonymousAuthenticationToken) {
                    throw new BadCredentialsException("Not logged in");
                } else{
                    logger.info("ROLE_LOGIN——————Permission");
                    return;
                }
            }
            //The permissions of the current user
            Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
            for (GrantedAuthority authority: authorities) {
                if (authority.getAuthority().equals(needRole)) {
                    return;
                }
            }
        }
        String requestUrl = ((FilterInvocation) object).getRequestUrl();
        logger.warn("Current access path {}, insufficient permissions", requestUrl);
        throw new AccessDeniedException("Insufficient permissions!");
    }

    @Override
    public boolean supports(ConfigAttribute attribute) {
        return false;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }
}
