package com.stackroute.service;


import com.stackroute.domain.Product;
import com.stackroute.exception.ProductAlreadyExistsException;
import com.stackroute.exception.ProductNotFoundException;

import java.util.List;

public interface ProductService {

    public Product saveProduct(Product product) throws ProductAlreadyExistsException;

    public Product getProductById(int id);
    public List<Product> getAllProducts();
   public List<Product> getProductByName(String name) throws ProductNotFoundException;
}
