package com.week7i.share;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jiangxingqi on 2017/7/25.
 */
@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping(value = "login")
    public String login(){
        return "login";
    }
}
 