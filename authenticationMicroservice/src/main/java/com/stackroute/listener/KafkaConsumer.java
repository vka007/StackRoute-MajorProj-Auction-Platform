//package com.stackroute.listener;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.stackroute.dao.UserDao;
//import com.stackroute.model.DAOUser;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//
//@Service
//public class KafkaConsumer {
//    @Autowired
//    UserDao userDao;
//
//    @Autowired
//    private PasswordEncoder bcryptEncoder;
//
//    @KafkaListener(topics = "kafka-Example4", groupId = "group_id")
//    public void consume(String daoUser) throws IOException {
//        System.out.println(daoUser);
//        DAOUser obj = new ObjectMapper().readValue(daoUser, DAOUser.class);
//       System.out.println(bcryptEncoder.encode(obj.getPassword()));
//       obj.setPassword(bcryptEncoder.encode(obj.getPassword()));
//        userDao.save(obj);
//    }
//
//}
