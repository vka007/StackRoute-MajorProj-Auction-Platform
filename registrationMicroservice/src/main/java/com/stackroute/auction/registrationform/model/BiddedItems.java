package com.stackroute.auction.registrationform.model;

import org.springframework.data.annotation.Id;

public class BiddedItems {
    @Id
    private String itemid;
    private String itemName;
    private String itemCategory;
    private int itemQuantity;
    private String itemDescription;
    private int itemDurationOfRent;
    private int baseRent;
    private String ownerName;
    private String ownerEmail;
    private int biddedRent;
}
