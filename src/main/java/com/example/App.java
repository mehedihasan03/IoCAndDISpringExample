package com.example;

import com.example.service.ProductServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("=======Hello Show-Room=======");
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:xmlBean.xml");
        ProductServiceInterface productService = context.getBean(ProductServiceInterface.class);
        productService.print();
        System.out.println("");
        
        ApplicationContext stContext = new ClassPathXmlApplicationContext("classpath:studentConstructorBean.xml");
        Student constStudent = (Student) stContext.getBean("constStudent");
        System.out.println(constStudent);
        
        Student stStudent = (Student) stContext.getBean("stStudent");
        System.out.println(stStudent);
        
    }
}
