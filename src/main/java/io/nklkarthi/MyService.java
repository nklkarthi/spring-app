package io.nklkarthi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyRepository myRepository;

    @Autowired
    public MyService(MyRepository myRepository) {
        this.myRepository=myRepository;
    }

    public void doBusinessLogic() {
        System.out.println("Doing some business logic");
        myRepository.doQuery();
    }
    
}
