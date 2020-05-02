package com.ljnan.zbxt.controller;

import com.ljnan.zbxt.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author lijianan
 * @date 2020-01-13 17:41
 */
@RestController
@Slf4j
@Api("TestController")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/index")
    @ApiOperation(value = "测试", httpMethod = "GET")
    public String index() {
        System.out.println(Arrays.toString(testService.getCodeList().toArray()));
        return null;
    }
}
