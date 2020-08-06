package com.zibo;

import com.zibo.dao.StudentDao;
import com.zibo.dao.impl.StudentDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class Test01 {
    @Autowired
    static StudentDaoImpl studentDao;

    public static void main(String[] args) {
        //1、获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2、根据id获取bean对象
        StudentDao studentDao = ac.getBean("studentDaoImpl",StudentDao.class);
        studentDao.printName();
    }
}
