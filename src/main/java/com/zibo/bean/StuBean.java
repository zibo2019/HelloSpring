package com.zibo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class StuBean implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
    //获取实例化该Bean的BeanFactory
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }
    //获取该bean在配置文件中对应的ID
    @Override
    public void setBeanName(String s) {
        System.out.println(s);
    }

    @Override
    public void destroy(){
        System.out.println("DisposableBean");
    }

    @Override
    public void afterPropertiesSet(){
        System.out.println("InitializingBean");
    }
}
