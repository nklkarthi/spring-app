package io.nklkarthi;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    
    public void doQuery() {
        System.out.println("Doing DB query! ");
    }
}
