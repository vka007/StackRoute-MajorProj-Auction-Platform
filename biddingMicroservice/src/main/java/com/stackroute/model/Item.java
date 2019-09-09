package com.stackroute.model;

import java.io.Serializable;

public class Item implements Serializable {

    //item details
    private int itemId;
    private String itemName;
    private String itemDescription;
    private String itemCategory;
    private String itemQuality;
    private int numberOfDaysForRent;
    private double itemBaseRent;

    //item bidding details
    private double minimumBiddingAmount;
    private int timeLeft;
    private double latestBid;
    private double yourBid;
    private int numberOfDaysNeeded;

    //rented user details
    private String userEmailId;
    private String userName;
    private long userPhoneNumber;

    //bidding user details
    private String bidderEmailId;
    private String biddername;
    private long bidderPhoneNumber;

    public Item() {
    }

    public Item(int itemId, String itemName, String itemDescription, String itemCategory, String itemQuality, int numberOfDaysForRent, double itemBaseRent, double minimumBiddingAmount, int timeLeft, double latestBid, double yourBid, int numberOfDaysNeeded, String userEmailId, String userName, long userPhoneNumber, String bidderEmailId, String biddername, long bidderPhoneNumber) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.itemQuality = itemQuality;
        this.numberOfDaysForRent = numberOfDaysForRent;
        this.itemBaseRent = itemBaseRent;
        this.minimumBiddingAmount = minimumBiddingAmount;
        this.timeLeft = timeLeft;
        this.latestBid = latestBid;
        this.yourBid = yourBid;
        this.numberOfDaysNeeded = numberOfDaysNeeded;
        this.userEmailId = userEmailId;
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.bidderEmailId = bidderEmailId;
        this.biddername = biddername;
        this.bidderPhoneNumber = bidderPhoneNumber;
    }

    //item details getter and setter
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public void setItemQuality(String itemQuality) {
        this.itemQuality = itemQuality;
    }

    public int getNumberOfDaysForRent() {
        return numberOfDaysForRent;
    }

    public void setNumberOfDaysForRent(int numberOfDaysForRent) {
        this.numberOfDaysForRent = numberOfDaysForRent;
    }

    public double getItemBaseRent() {
        return itemBaseRent;
    }

    public void setItemBaseRent(double itemBaseRent) {
        this.itemBaseRent = itemBaseRent;
    }

    //item bidding details getter and setter
    public double getMinimumBiddingAmount() {
        return minimumBiddingAmount;
    }

    public void setMinimumBiddingAmount(double minimumBiddingAmount) {
        this.minimumBiddingAmount = minimumBiddingAmount;
    }

    public int getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(int timeLeft) {
        this.timeLeft = timeLeft;
    }

    public double getLatestBid() {
        return latestBid;
    }

    public void setLatestBid(double latestBid) {
        this.latestBid = latestBid;
    }

    public double getYourBid() {
        return yourBid;
    }

    public void setYourBid(double yourBid) {
        this.yourBid = yourBid;
    }

    public int getNumberOfDaysNeeded() {
        return numberOfDaysNeeded;
    }

    public void setNumberOfDaysNeeded(int numberOfDaysNeeded) {
        this.numberOfDaysNeeded = numberOfDaysNeeded;
    }

    //rented user details getter and setter
    public String getUserEmailId() {
        return userEmailId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(long userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    //bidding user details getter and setter
    public String getBidderEmailId() {
        return bidderEmailId;
    }

    public void setBidderEmailId(String bidderEmailId) {
        this.bidderEmailId = bidderEmailId;
    }

    public String getBiddername() {
        return biddername;
    }

    public void setBiddername(String biddername) {
        this.biddername = biddername;
    }

    public long getBidderPhoneNumber() {
        return bidderPhoneNumber;
    }

    public void setBidderPhoneNumber(long bidderPhoneNumber) {
        this.bidderPhoneNumber = bidderPhoneNumber;
    }
}
