package com.bank.app.controller;

import com.bank.app.model.BankDetail;
import com.bank.app.model.BankServiceList;
import com.bank.app.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BankController {

@Autowired
BankService bankService;

@GetMapping("/")
    public String getHomePage(){

  //return "Welcome to Chapai Bank";
  return "index";

}
    @GetMapping("/banks")
    public List<BankDetail> getBanks(){

        return bankService.getAllBankList();
    }

    @GetMapping("/banks/state/{stateName}")
    public List<BankDetail> getBanks(@PathVariable String stateName){

        return bankService.getBankListByState(stateName);
    }


    @GetMapping("/service")
    public List<BankServiceList> getService(){

        return bankService.getAllService();
    }


}
