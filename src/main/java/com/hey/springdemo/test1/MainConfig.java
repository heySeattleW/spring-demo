package com.hey.springdemo.test1;

import com.hey.springdemo.test1.condition.WindowsCondition;
import com.hey.springdemo.test1.controller.UserController;
import com.hey.springdemo.test1.factory.MineFactoryBean;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @ClassName MainConfig
 * @Author hey
 * @Date 2019/4/8 15:46
 **/
@Configuration
@ComponentScan(value = "com.hey.springdemo.test1",excludeFilters = {@ComponentScan.Filter(classes = {Controller.class})},useDefaultFilters = true)
@Import(value = {MineFactoryBean.class})
public class MainConfig {
//    @Lazy
    @Bean
    public Person person(){
        System.out.println("创建person");
        return new Person("hey",18);
    }

    @Conditional(WindowsCondition.class)
    @Bean
    public Person hey(){
        System.out.println("heyhey");
        return new Person("heyhey",20);
    }

    @Lazy
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Bile bile(){
        return new Bile();
    }
}
