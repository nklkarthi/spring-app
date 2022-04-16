package io.nklkarthi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("applicationContext.xml");
        MyService myService = applicationContext.getBean(MyService.class);
        myService.doSomething();
    }
}
