package io.nklkarthi.data;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepositoryImpl implements MyRepository {

    public void doQuery() {
        System.out.println("Doing DB query! ");
    }
}
