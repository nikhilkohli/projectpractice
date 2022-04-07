package com.vechileloanapplication.service;
    import java.util.List;

import com.vechileloanapplication.exceptions.RecordNotFoundException;
import com.vechileloanapplication.model.AccountEntity;

 


    public interface AccountService {
        public AccountEntity getAccountByEmail(String email) throws RecordNotFoundException;
        public List<AccountEntity> AddAccount(AccountEntity account) throws RecordNotFoundException;
        public List<AccountEntity> UpdateAccount(AccountEntity account)throws RecordNotFoundException;
    
    }
 


