package com.example.mongo.Model_folder;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

@Document(collection = "cust")
public class customer_model 
{ 
    @Id 
    private int cust_id;
    private String name;
    private String city;
    private String state;
    private String Country;
    private long pincode;
    private String item_purchased;
    
    private int item_cost;
}
