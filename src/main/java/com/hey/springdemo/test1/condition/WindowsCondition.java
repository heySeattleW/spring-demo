package com.hey.springdemo.test1.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassName WindowsCondition
 * @Author hey
 * @Date 2019/4/9 10:03
 **/
public class WindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment = conditionContext.getEnvironment();
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        String name = environment.getProperty("os.name");
        if ("Windows 10".equals(name)){
            return true;
        }
        return false;
    }
}
