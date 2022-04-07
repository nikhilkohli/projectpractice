package com.vechileloanapplication.controller;

 

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vechileloanapplication.exceptions.RecordNotFoundException;
import com.vechileloanapplication.model.UserRegistrationEntity;
import com.vechileloanapplication.service.LogoutServiceImpl;

 

@RestController
@RequestMapping("/api/vehicleloans")
public class LogoutController {

    @Autowired
    private LogoutServiceImpl logo;
    public static Logger logs = Logger.getLogger(UserRegistrationEntity.class.getName());
    
    

    // USED TO LOGOUT
    @PostMapping("/logout")
    public ResponseEntity<String> logout(@RequestBody UserRegistrationEntity userbasic) throws RecordNotFoundException{
        UserRegistrationEntity userRegis = logo.logout(userbasic);
        logs.info("Logged out succesfully");
        return new ResponseEntity("Logout Successful", HttpStatus.OK);

 

    }
 
}