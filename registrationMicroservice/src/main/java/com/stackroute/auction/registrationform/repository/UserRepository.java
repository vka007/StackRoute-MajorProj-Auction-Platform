package com.stackroute.auction.registrationform.repository;

import com.stackroute.auction.registrationform.model.RentItems;
import com.stackroute.auction.registrationform.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Integer> {

}
