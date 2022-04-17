package io.nklkarthi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("io.nklkarthi");

        MyService myService = applicationContext.getBean(MyService.class);
        myService.doBusinessLogic();
    }
}
