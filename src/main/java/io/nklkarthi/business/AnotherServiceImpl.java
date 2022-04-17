package io.nklkarthi.business;

import org.springframework.stereotype.Service;

@Service
public class AnotherServiceImpl implements MyService{

    @Override
    public void doBusinessLogic() {
        System.out.println("Doing some other business logic slightly different");
        
    }
    
}
