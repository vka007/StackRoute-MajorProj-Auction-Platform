package com.stackroute.repository;



import com.stackroute.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface ProductRepository extends MongoRepository<Product,Integer> {
    @Query("{productName:'?0'}")
    List<Product> getProductByName(String name);
}
