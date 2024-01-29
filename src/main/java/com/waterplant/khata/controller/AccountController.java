package com.waterplant.khata.controller;


import com.waterplant.khata.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @DeleteMapping("/{accId}")
    public String deleteAccount(@PathVariable("accId") long accId){
       return accountService.deleteAccount(accId);

    }

}
