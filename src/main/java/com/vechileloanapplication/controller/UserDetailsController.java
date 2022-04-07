package com.vechileloanapplication.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vechileloanapplication.exceptions.RecordNotFoundException;
import com.vechileloanapplication.model.UserDetailsEntity;
import com.vechileloanapplication.service.UserDetailsServiceImpl;

//import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/api/vehicleloans")
public class UserDetailsController {

	@Autowired
	private UserDetailsServiceImpl Service;
	//public static Logger log = Logger.getLogger(UserDetailsController.class.getName());
	
	@PutMapping("/usersdetails/{user_id}")
    public ResponseEntity<List<UserDetailsEntity>> updateUser(@PathVariable("user_id") @RequestBody UserDetailsEntity user) throws RecordNotFoundException{
        List<UserDetailsEntity> users= Service.editUserDetails(user);
        return new ResponseEntity<List<UserDetailsEntity>>(users, HttpStatus.OK);
    }
	@GetMapping("/userdetails/{user_id}")
	public ResponseEntity<UserDetailsEntity> findUser(@PathVariable("user_id")Integer userId) throws RecordNotFoundException{
		UserDetailsEntity user= Service.showUserDetailsInformationByUserId(userId);
		return new ResponseEntity<UserDetailsEntity>(user, HttpStatus.OK);
	}
	@GetMapping("/userdetails")
    public ResponseEntity<List<UserDetailsEntity>> getAllUsers() throws RecordNotFoundException{
		List<UserDetailsEntity> users= Service.showAllUserDetails();
        return new ResponseEntity<List<UserDetailsEntity>>(users, HttpStatus.OK);
    }
	@PostMapping("/userdetails/{email}")
    public ResponseEntity<List<UserDetailsEntity>> addUserDetails(@PathVariable ("email")String email, @Valid @RequestBody UserDetailsEntity user) throws RecordNotFoundException{
       List<UserDetailsEntity> users=Service.addUserDetails(user, email);
        return new ResponseEntity<List<UserDetailsEntity>>(users, HttpStatus.OK);
	}
	
	}
