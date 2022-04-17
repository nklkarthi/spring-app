package io.nklkarthi;

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
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyService myService = applicationContext.getBean(MyService.class);
        myService.doBusinessLogic();

        MyRepository myRepository = applicationContext.getBean(MyRepository.class);
        myRepository.doQuery();
    }
}
