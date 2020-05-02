package com.ljnan.zbxt.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author lijianan
 * @date 2020-04-28 9:21
 * @description
 */
public class LocalUserInfoFilter implements Filter {
    Logger logger = LoggerFactory.getLogger(LocalUserInfoFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    }

    @Override
    public void destroy() {

    }

}
