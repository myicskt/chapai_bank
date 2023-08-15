package com.bank.app.service;

import com.bank.app.model.BankDetail;
import com.bank.app.model.BankServiceList;
import com.bank.app.reposetory.BankDetailRepository;
import com.bank.app.reposetory.BankServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {

    @Autowired
    BankDetailRepository bankDetailRepository;

    @Autowired
    BankServiceRepository bankServiceRepository;



    public List<BankDetail> getAllBankList() {
        return bankDetailRepository.findAll();
    }

    public List<BankDetail> getBankListByState(String state) {
       // return bankDetailRepository.findByState(state);
        return null;
    }


    public List<BankServiceList> getAllService() {
        return bankServiceRepository.findAll();
    }


}
