package com.hey.springdemo.test1;

import com.hey.springdemo.test1.factory.MineFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.PostConstruct;

/**
 * @ClassName MainTest
 * @Author hey
 * @Date 2019/4/8 14:28
 **/
public class MainTest {
    @PostConstruct
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("容器好了");
        Person person = (Person) applicationContext.getBean("person");
        String[] names = applicationContext.getBeanNamesForType(Person.class);
        System.out.println(applicationContext.getApplicationName());
        for(String name:names){
            System.out.println(name);
        }
        MineFactoryBean mineFactoryBean = applicationContext.getBean(MineFactoryBean.class);
        Pig pig = (Pig)mineFactoryBean.getObject();

        System.out.println(applicationContext.containsBean("Pig"));
        System.out.println(applicationContext.containsBeanDefinition("Pig"));
        pig.print();
        System.out.println(person.toString());
        applicationContext.getBean("bile");
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
