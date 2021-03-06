package com.weeking.share;

import com.weeking.share.service.aop01.MathUtils;
import com.weeking.share.service.aop02.service.LoginService;
import com.weeking.share.service.aop03.MathService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

    @Test
    public void testAop01() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:dispatcherServlet-aop-01.xml");
        MathUtils math = ctx.getBean("math", MathUtils.class);
        int n1 = 100, n2 = 5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }

    @Test
    public void testAop02() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:dispatcherServlet-aop-02.xml");
        LoginService service = (LoginService)ctx.getBean(LoginService.class);
        service.login("jiang");
    }

    @Test
    public void testAop03() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:dispatcherServlet-aop-03.xml");
        MathService math = ctx.getBean(MathService.class);
        int n1 = 100, n2 = 5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }
}
