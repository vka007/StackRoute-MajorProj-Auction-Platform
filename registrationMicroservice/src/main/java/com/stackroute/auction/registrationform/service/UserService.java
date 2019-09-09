package com.stackroute.auction.registrationform.service;

import com.stackroute.auction.registrationform.exception.ItemAlreadyExistsException;
import com.stackroute.auction.registrationform.exception.UserAlreadyExistsException;
import com.stackroute.auction.registrationform.exception.UserNotFoundException;
import com.stackroute.auction.registrationform.model.RentItems;
import com.stackroute.auction.registrationform.model.User;


import java.util.ArrayList;
import java.util.List;


public interface  UserService {
     User saveUser(User user) throws UserAlreadyExistsException;
     List<User> getAllUsers();
     User updateUser(User user) throws UserNotFoundException;
     boolean deleteUser(String email) throws UserNotFoundException;
     User getUserByEmail(String email) ;
     User saveItems(RentItems rentItems, String email) throws UserNotFoundException;
     List<RentItems> getAllItems(String email);
     User updateRentItems(RentItems rentItems,String email,Long itemId);
     boolean deleteItems(String email,Long itemId);
}
