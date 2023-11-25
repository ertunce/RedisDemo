package com.bilgeadam.redisdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Cacheable(value = "data", key="#id")
    public String getDataById(String id){

        try{
            Thread.sleep(5000);

        }catch(InterruptedException intExp){
            Thread.currentThread().interrupt();
        }
        return "Data for id: " + id;
    }
}
