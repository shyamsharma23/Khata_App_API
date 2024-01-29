package com.waterplant.khata.controller;


import com.waterplant.khata.dto.GrahakDto;
import com.waterplant.khata.dto.KhataDto;
import com.waterplant.khata.entities.Grahak;
import com.waterplant.khata.services.GrahakService;
import com.waterplant.khata.services.KhataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class GrahakController {

    @Autowired
    private GrahakService grahakService;

    @Autowired
    private KhataService khataService;

    @PostMapping("/grahak")
    public String createGrahak(@RequestBody GrahakDto grahakDto){
        grahakService.createGrahak(grahakDto);
        return "Grahak has been registered";
    }

    @PostMapping("/khata/{accId}")
    public double addBalance(@PathVariable("accId") long accId,@RequestBody KhataDto khataDto){
        return khataService.addKhata(accId,khataDto);
    }

    @GetMapping("/grahak/search")
    public List<Grahak> searchGrahak(@RequestParam(value = "name") String name){
        return grahakService.searchPeople(name);
    }


    @GetMapping("/grahak")
    public List<Grahak> getGrahak() {
        return grahakService.getAllGrahak();
    }


}
