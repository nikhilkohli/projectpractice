package com.vechileloanapplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vechileloanapplication.exceptions.RecordNotFoundException;
import com.vechileloanapplication.exceptions.RegistrationException;
import com.vechileloanapplication.model.AdminEntity;
import com.vechileloanapplication.model.UserRegistrationEntity;


@Service
public interface LoginDtoService {
	public UserRegistrationEntity authenticateUser(String userEmail,String password) throws RegistrationException, RecordNotFoundException ;
   public List<UserRegistrationEntity> getAllUsersDetails();
   public AdminEntity authenticateAdmin(String adminEmail,String password) throws RegistrationException, RecordNotFoundException;
   public List<AdminEntity> getAllAdminDetails();
   

}