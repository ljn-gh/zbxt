package com.ljnan.zbxt.service.impl;

import com.ljnan.zbxt.model.MyUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author lijianan
 * @date 2020-05-02 14:56
 * @description MyAuthenticationUserDetailsService Class
 */
@Service
public class MyAuthenticationUserDetailsService implements AuthenticationUserDetailsService {
    @Override
    public UserDetails loadUserDetails(Authentication authentication) throws UsernameNotFoundException {
        MyUser myUser = new MyUser("ls", "123456");
        return myUser;
    }
}
