package com.stackroute.controller;


import com.stackroute.domain.Product;
import com.stackroute.exception.ProductNotFoundException;
import com.stackroute.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ControllerAdvice
@RequestMapping(value="api/v1")
@CrossOrigin("*")
public class ProductController {
    private ProductService productService;
    private final Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
    public ProductController(ProductService productService){
        this.productService = productService;
    }
//Saving the Product
    @PostMapping("product")
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        ResponseEntity responseEntity;
        try{
            productService.saveProduct(product);
            responseEntity=new ResponseEntity<String>("Successfully created", HttpStatus.CREATED);
        } catch (Exception ex){
            responseEntity=new ResponseEntity<String>(ex.getMessage(),HttpStatus.CONFLICT);
        }
        return responseEntity;
    }
//In order to see all saved products
    @GetMapping("product")
    public ResponseEntity<?> getAllProducts(){
        ResponseEntity responseEntity;
        try{
            productService.getAllProducts();
            responseEntity= new ResponseEntity<List<Product>>(productService.getAllProducts(),HttpStatus.OK);
        } catch (Exception e){
            responseEntity=new ResponseEntity<String>(e.getMessage(),HttpStatus.CONFLICT);
        }
        return responseEntity;
    }
    //In order to search a product by its Id
    @GetMapping("product/{id}")
    public ResponseEntity<?> getProductById(@PathVariable("id") int id){
        ResponseEntity responseEntity;
        Product product;
        try {
            product = productService.getProductById(id);
            responseEntity=new ResponseEntity<Product>(product, HttpStatus.OK);
        } catch (Exception e){
            responseEntity=new ResponseEntity<String>(e.getMessage(),HttpStatus.CONFLICT);
        }
            return responseEntity;
    }



//In order to search a product by its name
    @GetMapping("productname/{name}")
    public ResponseEntity<?> getProductByName(@PathVariable String name) {
        ResponseEntity responseEntity;
        try {
            List<Product> product = productService.getProductByName(name);
            responseEntity = new ResponseEntity<List<Product>>(product, HttpStatus.OK);
        } catch (ProductNotFoundException ex) {
            responseEntity = new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }

}

