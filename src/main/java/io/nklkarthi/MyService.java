package io.nklkarthi;

public class MyService {

    private MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void doBusinessLogic() {
        System.out.println("Doing some business logic");
        myRepository.doQuery();
    }
    
}
