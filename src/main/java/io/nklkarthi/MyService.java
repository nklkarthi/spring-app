package io.nklkarthi;

public class MyService {

    private MyRepository myRepository;

    public void doBusinessLogic() {
        System.out.println("Doing some business logic");
        myRepository.doQuery();
    }

    public void setMyRepository(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public MyRepository getMyRepository() {
        return myRepository;
    }
    
}
