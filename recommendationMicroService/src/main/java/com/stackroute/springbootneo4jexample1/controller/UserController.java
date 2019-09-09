package com.stackroute.springbootneo4jexample1.controller;

import com.stackroute.springbootneo4jexample1.model.Category;
import com.stackroute.springbootneo4jexample1.model.Product;
import com.stackroute.springbootneo4jexample1.model.User;
import com.stackroute.springbootneo4jexample1.model.WishlistProduct;
import com.stackroute.springbootneo4jexample1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1")  //REST end-point
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserService userService;

    //Returns all the users
    @GetMapping("/users")
    public Collection<User> getAll() {
        return userService.getAll();
    }

//Returns all the Liked categories of a user
    @GetMapping("/userslikes")
    public Collection<Category> getAllLikes() {
        return userService.getAllLikes();
    }
//Returns all the recommended products of a user
    @GetMapping("/userrcm")
    public Collection<Product> getAllRec() {
        return userService.getAllRecm();
    }
//Get all the liked products of a user
    @GetMapping("/myproducts")
    public Collection<WishlistProduct> getMyFavProducts(){ return userService.getMyFavs(); }
//Post a product to wishlist
    @PostMapping("/savewishlist")
    public ResponseEntity<User> saveWishlist(@RequestBody WishlistProduct wish){

        ResponseEntity responseEntity;
        userService.saveMyFav(wish);
        responseEntity=new ResponseEntity("Succesfully Created", HttpStatus.CREATED);
        return responseEntity;
    }
    
    //Remove from wishlist
    @PostMapping("/removefav")
    public ResponseEntity<?> deleteTrackByname(@RequestBody WishlistProduct wish)  {
       Collection<WishlistProduct> wishlist;
        wishlist = userService.deleteWLProductByName(wish);
        return new ResponseEntity(wishlist, HttpStatus.OK);
    }
}
