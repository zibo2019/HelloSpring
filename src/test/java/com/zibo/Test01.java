package com.zibo;

import com.zibo.dao.StudentDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void go(){
        //1、获取核心容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //2、从容器获取类对象
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        //3、使用对象
        studentDao.printName();
    }
}
