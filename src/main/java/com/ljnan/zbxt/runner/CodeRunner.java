package com.ljnan.zbxt.runner;

import com.ljnan.zbxt.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 单值代码加载
 * @author lijianan
 * @date 2020-04-21 18:12
 * 
 */
@Component
@Slf4j
@Order(value = 1)
public class CodeRunner implements CommandLineRunner {

    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TestService testService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("command");
        logger.error("hahaahah");
        testService.getCodeList();
    }
}
