package com.stackroute.springbootneo4jexample1.repository;

import com.stackroute.springbootneo4jexample1.model.Category;
import com.stackroute.springbootneo4jexample1.model.Product;
import com.stackroute.springbootneo4jexample1.model.User;
import com.stackroute.springbootneo4jexample1.model.WishlistProduct;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface UserRepository extends Neo4jRepository<User, Long> {

    @Query("MATCH (u:User) RETURN u")
    Collection<User> getAllUsers();

    @Query("MATCH (p:Product) RETURN p")
    Collection<Product> getAllProducts();

    @Query(" MATCH (u:User {name:'Nikhila'})-[:LIKES]->(c:Category) return c")
    Collection<Category> getAllLikes();


    @Query("MATCH (u:User {name:'Pranee'})-[:LIKES]->(:Category)<-[:BELONGS_TO]-(p:Product) RETURN p")
    Collection<Product> getAllRecommendProducts();

    @Query("MERGE (n:WishlistProduct { id: {id}, name: {name}, owner:{owner} , des:{des} })")
    WishlistProduct saveMyFav(@Param("id") Long id, @Param("name")String name, @Param("owner") String owner, @Param("des") String des);

    @Query("MATCH (p:WishlistProduct) RETURN p")
    Collection<WishlistProduct> getMyFavs();

    @Query("Match (p:WishlistProduct {name : {name}}) detach delete p")
    Collection<WishlistProduct> deleteWLProductByName(@Param("name") String name);







}