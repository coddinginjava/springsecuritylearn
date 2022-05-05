package com.sai.SpringSecurityLearn.securityConfig;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyAuthProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userName = authentication.getName();
        String password = authentication.getCredentials().toString();
        if("hi".equals(userName) && "hi".equals(password)){
            return new  UsernamePasswordAuthenticationToken(userName,password, Arrays.asList());
        }else{
            throw new BadCredentialsException("username or password incorrect");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        System.out.println("supports");
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
