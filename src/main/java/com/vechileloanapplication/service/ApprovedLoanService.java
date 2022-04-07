package com.vechileloanapplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vechileloanapplication.exceptions.DuplicateRecordException;
import com.vechileloanapplication.exceptions.InvalidDetailsException;
import com.vechileloanapplication.exceptions.LoanApplicationException;
import com.vechileloanapplication.exceptions.RecordNotFoundException;
import com.vechileloanapplication.model.ApprovedLoansEntity;

@Service
public interface ApprovedLoanService 
{
 
    //GET APPROVED BY EMAIL
    public List<ApprovedLoansEntity> showAllApprovedByEmail(String email) throws RecordNotFoundException;
    
    //GET APPROVED BY LOANID
    public ApprovedLoansEntity showApprovedByLoanId(int loanId) throws RecordNotFoundException;
    
    //Saranya
    public List<ApprovedLoansEntity> addApprovedLoan(ApprovedLoansEntity approved) throws RecordNotFoundException, DuplicateRecordException, InvalidDetailsException, LoanApplicationException;

	List<ApprovedLoansEntity> showall();
 
     
}