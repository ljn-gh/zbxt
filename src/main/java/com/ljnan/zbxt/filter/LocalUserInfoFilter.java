package com.example.demo.filter;

import com.example.demo.utils.CASUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
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
        HttpServletRequest request_ = (HttpServletRequest) request;
        String loginName = CASUtils.getAccountNameFromCas(request_);
        if (StringUtils.isNotEmpty(loginName)) {
            logger.info("访问者 ：" + loginName);
            request_.getSession().setAttribute("loginName", loginName);
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

}
