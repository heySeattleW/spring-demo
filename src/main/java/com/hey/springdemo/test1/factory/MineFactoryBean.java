package com.hey.springdemo.test1.factory;

import com.hey.springdemo.test1.Pig;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName MineFactoryBean
 * @Author hey
 * @Date 2019/4/9 13:58
 **/
public class MineFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new Pig();
    }

    @Override
    public Class<?> getObjectType() {
        return Pig.class;
    }
}
