package com.cemmah.commentary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * This class test MongoDB connection
 * Author：Emma
 * Date：11/6/2024
 * Version: 1.0
 */
@Component
public class MongoDBTest implements CommandLineRunner {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("MongoDB connection test: " + mongoTemplate.getDb().getName());
    }
}

