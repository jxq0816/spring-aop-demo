package com.weeking.share.controller;

import com.weeking.share.service.aop02.annotion.Operate;
import com.weeking.share.service.aop02.ennum.OperateEnum;
import com.weeking.share.service.aop02.service.LoginService;
import com.weeking.share.service.aop03.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jiangxingqi on 2017/7/25.
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;
    @Autowired
    private MathService mathService;

    @RequestMapping(value = "/login")
    public String login(){
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-aop-02.xml");
        //LoginService loginService = (LoginService)ctx.getBean(LoginService.class);
        String username=loginService.login("jiangxingqi");
        return "login";
    }

    @RequestMapping(value = "/math")
    public String math(){
        mathService.add(1,2);
        return "login";
    }
}
 