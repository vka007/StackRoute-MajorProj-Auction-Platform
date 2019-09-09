 package com.stackroute.auction.registrationform.service;

import com.stackroute.auction.registrationform.exception.ItemAlreadyExistsException;
import com.stackroute.auction.registrationform.exception.UserAlreadyExistsException;
import com.stackroute.auction.registrationform.exception.UserNotFoundException;
import com.stackroute.auction.registrationform.model.RentItems;
import com.stackroute.auction.registrationform.model.User;
import com.stackroute.auction.registrationform.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    private User user;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;
    @Override
    public User saveUser(User user)  throws UserAlreadyExistsException {
        User alreadySavedUser=getUserByEmail(user.getUserEmail());
        if(alreadySavedUser!=null)
        {
            throw new UserAlreadyExistsException("User already Exists");
        }
        else {
            user.setRentItems(new ArrayList<>());
            User savedUser = userRepository.save(user);
            if (savedUser == null) {
                savedUser = null;
            }
            return savedUser;
        }
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) throws UserNotFoundException  {
       User  result=getUserByEmail(user.getUserEmail());
       if(result==null)
       {
           throw new UserNotFoundException("User not found");
       }
       result.setUserName(user.getUserName());
        result.setUserEmail(user.getUserEmail());
        result.setUserPhoneNumber(user.getUserPhoneNumber());
        result=userRepository.save(user);
        return result;
    }

    @Override
    public boolean deleteUser(String email) throws UserNotFoundException{
        User  result=getUserByEmail(email);
        if(result==null)
        {
            throw new UserNotFoundException("User not found");
        }
       userRepository.delete(result);
       return true;
    }

    @Override
    public User getUserByEmail(String email) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userEmail").is(email));
        User savedUser = mongoTemplate.findOne(query, User.class);
        return savedUser;
    }
    @Override
    public User saveItems(RentItems rentItems, String email) throws UserNotFoundException{
        User user=getUserByEmail(email);
        if(user==null)
        {
            throw new UserNotFoundException("User Not Found");
        }
        rentItems.setItemid(sequenceGeneratorService.getNextSequence(RentItems.SEQUENCE_NAME));
        user.getRentItems().add(rentItems);
        userRepository.save(user);
        return user;

     
    }
    @Override
    public List<RentItems> getAllItems(String email ) {
        List<RentItems> rentItems=new ArrayList<>();
        User savedUser=getUserByEmail(email);
        rentItems= (List<RentItems>) savedUser.getRentItems();
        return  rentItems;

    }

    @Override
    public User updateRentItems(RentItems rentItems,String email,Long itemId) {
      User result=getUserByEmail(email);

    ArrayList<RentItems> rentItems1=result.getRentItems();
    for(int i=0;i<rentItems1.size();i++)
    {
        if(rentItems1.get(i).getItemid()==itemId)
        {
            result.getRentItems().get(i).setItemDurationOfRent(rentItems.getItemDurationOfRent());

        }
    }
    userRepository.save(result);
    return result;

    }
    @Override
    public boolean deleteItems(String email,Long itemId) {
        User result=getUserByEmail(email);
       
        ArrayList<RentItems> rentItems1=result.getRentItems();
        for(int i=0;i<rentItems1.size();i++)
        {
            if(rentItems1.get(i).getItemid()==itemId)
            {
                rentItems1.remove(i);
            }
        }
        result.setRentItems(rentItems1);
        userRepository.save(result);
        return true;
    }

}

