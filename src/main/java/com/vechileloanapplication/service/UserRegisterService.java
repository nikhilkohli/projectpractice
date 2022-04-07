package com.vechileloanapplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vechileloanapplication.exceptions.DuplicateRecordException;
import com.vechileloanapplication.exceptions.RecordNotFoundException;
import com.vechileloanapplication.model.UserRegistrationEntity;
 
@Service
public interface UserRegisterService 
{
    
    // ADDING AN USER
    public UserRegistrationEntity userRegister(UserRegistrationEntity userbasic) throws DuplicateRecordException;
 
    //PASSWORD RESET
    public List<UserRegistrationEntity> passwordReset(UserRegistrationEntity userbasic)throws RecordNotFoundException;
 
    //GET USER BY EMAIL
    public UserRegistrationEntity showUserRegistrationInformationByEmail(String email)throws RecordNotFoundException;
 
    //GET ALL USERS
    public List<UserRegistrationEntity> getAllUsers()throws RecordNotFoundException;
}
