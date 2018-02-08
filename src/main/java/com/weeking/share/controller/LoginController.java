package com.weeking.share.controller;

import com.weeking.share.service.aop02.annotion.Operate;
import com.weeking.share.service.aop02.ennum.OperateEnum;
import com.weeking.share.service.aop02.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/login")
    public String login(){
        String username=loginService.login("jiangxingqi");
        return "login";
    }
}
 