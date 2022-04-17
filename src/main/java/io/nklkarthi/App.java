package io.nklkarthi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.nklkarthi.business.MyService;
import io.nklkarthi.business.MyServiceImpl;
import io.nklkarthi.business.AnotherServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MyService myService2 = applicationContext.getBean(MyServiceImpl.class);
        myService2.doBusinessLogic();

        MyService myService1 = applicationContext.getBean(AnotherServiceImpl.class);
        myService1.doBusinessLogic();


    }
}
