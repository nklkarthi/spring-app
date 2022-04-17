package io.nklkarthi.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import io.nklkarthi.data.MyRepository;

@Service
public class MyServiceImpl implements MyService {

    private MyRepository myRepository;

    @Autowired
    public MyServiceImpl(@Qualifier("myRepositoryImpl") MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void doBusinessLogic() {
        System.out.println("Doing some business logic");
        myRepository.doQuery();
    }

}
