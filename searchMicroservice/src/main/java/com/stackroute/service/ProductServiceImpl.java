package com.stackroute.service;

import com.stackroute.domain.Product;
import com.stackroute.exception.ProductAlreadyExistsException;
import com.stackroute.exception.ProductNotFoundException;
import com.stackroute.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository){

        this.productRepository = productRepository;
    }
    @Override
    public Product saveProduct(Product product) throws ProductAlreadyExistsException {
        if(productRepository.existsById(product.getId())) {
            throw new ProductAlreadyExistsException("Crop already exists");
        }
        Product saveProduct = productRepository.save(product);
        if(saveProduct ==null)
            throw new ProductAlreadyExistsException(" Crop already exists");
        return saveProduct;
    }

    @Override
    public Product getProductById(int id) {
        Optional<Product> productOptional= productRepository.findById(id);
        if(productOptional.isPresent()){
            return productOptional.get();

        }
        else {
            return null;
        }
    }
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductByName(String name) throws ProductNotFoundException {
        List<Product> product = productRepository.getProductByName(name);
        if(product.isEmpty()) {
            throw new ProductNotFoundException("Product not found");
        }
        return product;
    }
}
