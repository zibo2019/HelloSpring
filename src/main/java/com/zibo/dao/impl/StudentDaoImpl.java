package com.zibo.dao.impl;

import com.zibo.dao.StudentDao;
import org.springframework.stereotype.Component;

@Component
public class StudentDaoImpl implements StudentDao {
    @Override
    public void printName() {
        System.out.println("我是訾博！");
    }
}
