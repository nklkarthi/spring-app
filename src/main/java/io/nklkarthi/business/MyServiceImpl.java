package io.nklkarthi.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.nklkarthi.data.MyRepositoryImpl;

@Service
public class MyServiceImpl implements MyService {

    private MyRepositoryImpl myRepository;

    @Autowired
    public MyServiceImpl(MyRepositoryImpl myRepository) {
        this.myRepository=myRepository;
    }

    public void doBusinessLogic() {
        System.out.println("Doing some business logic");
        myRepository.doQuery();
    }
    
}
