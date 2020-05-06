package com.ljnan.zbxt.service.impl;

import com.ljnan.zbxt.model.MyUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author lijianan
 * @date 2020-05-02 14:38
 * @description MyUserDetailsService Class
 */
@Service
public class MyUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        MyUser myUser = new MyUser("ls", "123456");
        return myUser;
    }
}
