package com.stackroute.springbootneo4jexample1.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Product {

    @GraphId
    private Long id;
    private String name;
    private String des;
    private String owner;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public String getName() { return name; }

    public String getDes() { return des; }

    public String getOwner() { return owner; }
}
