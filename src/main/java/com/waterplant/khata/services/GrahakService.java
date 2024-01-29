package com.waterplant.khata.services;


import com.waterplant.khata.dto.GrahakDto;
import com.waterplant.khata.entities.Account;
import com.waterplant.khata.entities.Grahak;
import com.waterplant.khata.repositories.AccountRepository;
import com.waterplant.khata.repositories.GrahakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrahakService {

    @Autowired
    private GrahakRepository grahakRepository;

    @Autowired
    private AccountRepository accountRepository;


    public String createGrahak(GrahakDto grahakDto){
        Account account= new Account();
        account.setSum(grahakDto.getSum());
        accountRepository.save(account);
        Grahak grahak = new Grahak();
        grahak.setAccount(account);
        grahak.setName(grahakDto.getName());
        grahak.setNumber(grahakDto.getNumber());
        grahakRepository.save(grahak);
        return "Grahak has been registered";
    }

    public List<Grahak> searchPeople(String query){
        return grahakRepository.searchGrahak(query);
    }

    public List<Grahak> getAllGrahak(){
        return grahakRepository.findByOrderByNameAsc();
    }
}
