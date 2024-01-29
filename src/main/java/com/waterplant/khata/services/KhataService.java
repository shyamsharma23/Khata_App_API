package com.waterplant.khata.services;


import com.waterplant.khata.dto.KhataDto;
import com.waterplant.khata.entities.Account;
import com.waterplant.khata.entities.Khata;
import com.waterplant.khata.repositories.AccountRepository;
import com.waterplant.khata.repositories.KhataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KhataService {

    @Autowired
    private KhataRepository khataRepository;

    @Autowired
    private AccountRepository accountRepository;


    public double addKhata(long accId, KhataDto khataDto){
        Account account = accountRepository.findById(accId).get();
//        List<Khata> khatalist = new ArrayList<>();
        Khata khata = new Khata();
        khata.setNumber(khataDto.getNumber());
        khata.setAccount(account);
//        khatalist.add(khata);
        khataRepository.save(khata);
//        account.setKhataList(khatalist);
        account.addNewSum(khataDto.getNumber());
        accountRepository.save(account);
        return account.getSum();
    }

    public List<Khata> getKhataDetail(long accId){
        return khataRepository.findByaccountAccId(accId);
    }

}
