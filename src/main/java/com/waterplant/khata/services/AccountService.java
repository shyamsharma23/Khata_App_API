package com.waterplant.khata.services;


import com.waterplant.khata.entities.Account;
import com.waterplant.khata.repositories.AccountRepository;
import com.waterplant.khata.repositories.GrahakRepository;
import com.waterplant.khata.repositories.KhataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private KhataRepository khataRepository;

    @Autowired
    private GrahakRepository grahakRepository;

    public String createAccount(double sum){

        return "Account created successfully";
    }

    public String deleteAccount(long accId){
        Account account = accountRepository.findById(accId).get();
        grahakRepository.deleteByaccountAccId(accId);
        khataRepository.deleteByaccountAccId(accId);
        accountRepository.deleteById(accId);


        return "Account has been deleted";

    }
}
