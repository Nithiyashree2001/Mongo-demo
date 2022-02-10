package com.example.mongo.Respository_folder;

import com.example.mongo.Model_folder.customer_model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface  repository extends MongoRepository<customer_model,Integer> {
    
}
