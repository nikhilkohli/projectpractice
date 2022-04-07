package com.vechileloanapplication.controller;
import java.util.List;

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
import com.vechileloanapplication.model.AccountEntity;
import com.vechileloanapplication.service.AccountServiceImpl;

 

@RestController
@RequestMapping("/api/vehicleloans")
public class AccountController {
    @Autowired
    private AccountServiceImpl Service;    
    @GetMapping(value="/hi")
    public String sayHello() {
        System.out.println("heelo........");
        return "Hello Cg! from Spring Framework! thanku...";
    }
    @GetMapping("/accounts/{email}")
    public ResponseEntity<AccountEntity> findAccount( @PathVariable("email")String email) throws RecordNotFoundException{
        AccountEntity accounts= Service.getAccountByEmail(email);
        return new ResponseEntity<AccountEntity>(accounts, HttpStatus.OK);
        
    }
    @PostMapping("/accounts")
    public ResponseEntity<List<AccountEntity>> insertAccount( @RequestBody AccountEntity account) throws RecordNotFoundException{
        List<AccountEntity> accounts=Service.AddAccount(account);
        return new ResponseEntity<List<AccountEntity>>(accounts, HttpStatus.OK);
    }
    
    @PutMapping("/accounts/{accountNo}")
   public ResponseEntity<List<AccountEntity>> updateAccount(@PathVariable("accountNo")@RequestBody AccountEntity account) throws RecordNotFoundException{
        List<AccountEntity> accounts= Service.UpdateAccount(account);
        return new ResponseEntity<List<AccountEntity>>(accounts, HttpStatus.OK);
    }
    
}
 