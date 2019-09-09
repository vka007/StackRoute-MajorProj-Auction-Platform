package com.stackroute.springbootneo4jexample1.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
@NodeEntity
// Entity for adding to Favourites
public class WishlistProduct {
    @GraphId
    private Long id;
    private String name;
    private String des;
    private String owner;

    public WishlistProduct() {
    }

    public Long getId() {
        return id;
    }

    public String getName() { return name; }

    public String getDes() { return des; }

    public String getOwner() { return owner; }
}
