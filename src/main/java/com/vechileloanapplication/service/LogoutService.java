package com.vechileloanapplication.service;

 

import com.vechileloanapplication.exceptions.RecordNotFoundException;
import com.vechileloanapplication.model.UserRegistrationEntity;

 

public interface LogoutService {
    
    // USED TO LOGOUT FOR USER
    public UserRegistrationEntity logout(UserRegistrationEntity userbasic) throws RecordNotFoundException;
    
}