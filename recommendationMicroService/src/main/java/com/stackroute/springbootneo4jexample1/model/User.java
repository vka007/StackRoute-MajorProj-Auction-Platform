package com.stackroute.springbootneo4jexample1.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
//Entity for User which has a LIKES relationship with Category Entity
public class User {

    @GraphId
    private Long id;
    private String name;
    private String emailid;
    private List<String> category;
    @Relationship(type = "LIKES", direction = Relationship.OUTGOING)
    private List<Category> categories;

   public List<Category> getCategories() {
        return categories;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmailid() {
        return emailid;
    }

    public List<String> getCategory() {
        return category;
    }
}
