package io.nklkarthi.data;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepositoryImpl {
    
    public void doQuery() {
        System.out.println("Doing DB query! ");
    }
}
