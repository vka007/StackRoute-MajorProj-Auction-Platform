package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
//Using lombok
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    @Id
    //Product Id
    int id;
    //Product name
    String productName;
    //List of details of product
    List<ProductDetails> details;

}

