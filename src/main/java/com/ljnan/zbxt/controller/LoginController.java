package com.ljnan.zbxt.controller;

import com.ljnan.zbxt.model.LombokTest;
import com.ljnan.zbxt.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author lijianan
 * @date 2020-04-28 9:26
 * @description
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    //进入系统首页方法，如果没有登录，会跳转到CAS统一登录页面，登录成功后会回调该方法。
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    //登出
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        Student student = new Student();
        student.setSno("");
        student.setSname("");
        student.setCno(0);
        System.out.println(student.toString());
        LombokTest lombokTest = new LombokTest();
        lombokTest.setLom("sdf");
        return "redirect:http://localhost:9999/cas/logout?service=http://localhost:9999/cas";
        
    }
}
