package com.stackroute.auction.registrationform.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;

@Data
@Document(collection = "user")
public class User {

    @Id
    
    private String userEmail;
    private String userName;
    private String userPhoneNumber;
    private String userGender;
    private String userAadharNumber;
    private String userPassword;
    private ArrayList<RentItems> rentItems;
    private ArrayList<BiddedItems> biddedItems;
    public User() {
    }

    public User(String userEmail, String userName, String userPhoneNumber, String userGender, String userAadharNumber, String userPassword, ArrayList<RentItems> rentItems, ArrayList<BiddedItems> biddedItems) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.userGender = userGender;
        this.userAadharNumber = userAadharNumber;
        this.userPassword = userPassword;
        this.rentItems = rentItems;
        this.biddedItems = biddedItems;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserAadharNumber() {
        return userAadharNumber;
    }

    public void setUserAadharNumber(String userAadharNumber) {
        this.userAadharNumber = userAadharNumber;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public ArrayList<RentItems> getRentItems() {
        return rentItems;
    }

    public void setRentItems(ArrayList<RentItems> rentItems) {
        this.rentItems = rentItems;
    }

    public ArrayList<BiddedItems> getBiddedItems() {
        return biddedItems;
    }

    public void setBiddedItems(ArrayList<BiddedItems> biddedItems) {
        this.biddedItems = biddedItems;
    }

    @Override
    public String toString() {
        return "User{" +
                "userEmail='" + userEmail + '\'' +
                ", userName='" + userName + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userAadharNumber='" + userAadharNumber + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", rentItems=" + rentItems +
                ", biddedItems=" + biddedItems +
                '}';
    }
}
