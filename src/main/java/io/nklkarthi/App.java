package io.nklkarthi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.nklkarthi.business.MyService;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MyService myService2 = applicationContext.getBean("myServiceImpl", MyService.class);
        myService2.doBusinessLogic();

        MyService myService1 = applicationContext.getBean("anotherServiceImpl", MyService.class);
        myService1.doBusinessLogic();

    }
}
