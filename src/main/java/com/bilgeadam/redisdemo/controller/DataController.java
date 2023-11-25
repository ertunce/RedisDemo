package com.bilgeadam.redisdemo.controller;

import com.bilgeadam.redisdemo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    DataService dataService;

    @GetMapping("/api/data/{id}")
    public ResponseEntity<String> getDataById(@PathVariable("id") String id){
        return ResponseEntity.ok().body(dataService.getDataById(id));
    }
}
