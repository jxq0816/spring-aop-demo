package com.weeking.share.service.aop02.service;

import com.weeking.share.service.aop02.annotion.Operate;
import com.weeking.share.service.aop02.ennum.OperateEnum;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Operate(status= OperateEnum.USERNAME)
    public String login(String username){
        System.out.println("username:"+username);
        return username;
    }
}
