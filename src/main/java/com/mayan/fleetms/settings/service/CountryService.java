package com.mayan.fleetms.settings.service;


import com.mayan.fleetms.settings.dto.CountryRepo;
import com.mayan.fleetms.settings.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {


    @Autowired
    private CountryRepo countryRepo;

    public List<Country> getAll(){
        return countryRepo.findAll();
    }

    public void save(Country country){
        countryRepo.save(country);
    }

    public  void delete(Integer id){
        countryRepo.deleteById(id);
    }

    public Country getById(Integer id) {

        return countryRepo.findById(id).orElse(null);
    }
}
