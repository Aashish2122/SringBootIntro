package com.aashish.IntroductionProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

//    @Autowired
      final DB db;//constructor injection must be preferred as it enables us to make dependencies immutable

    public DBService(DB db) {
        //example of constructor injection
        this.db = db;
    }

    String getData() {
        return db.getData();
    }
}
