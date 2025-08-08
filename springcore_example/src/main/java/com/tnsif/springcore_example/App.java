package com.tnsif.springcore_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext var = new ClassPathXmlApplicationContext("applicationcontext.xml");
        
        college c1 = var.getBean("smvec",college.class);
        c1.display();
        
        college c2 = var.getBean("mvit", college.class);
        c2.display();
    }
}