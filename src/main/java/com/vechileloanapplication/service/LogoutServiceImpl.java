package com.vechileloanapplication.service;

 

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vechileloanapplication.dao.UserRegisterJPARepository;
import com.vechileloanapplication.exceptions.RecordNotFoundException;
import com.vechileloanapplication.model.UserRegistrationEntity;

 

//LOGOUT IMPLEMENTATION 
@Service
public class LogoutServiceImpl implements LogoutService {

 


    @Autowired
    private UserRegisterJPARepository userRegisterRepo;
    // USED TO LOGOUT
        @Override
        public UserRegistrationEntity logout(UserRegistrationEntity userbasic)throws RecordNotFoundException {
            // TODO Auto-generated method stub
            Optional<UserRegistrationEntity> userbasics = userRegisterRepo.findById(userbasic.getEmail());
            if (!userbasics.isPresent()) 
            {
                return null;
            } else
                return userbasics.get();
        }
}