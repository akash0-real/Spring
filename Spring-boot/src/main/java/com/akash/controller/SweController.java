package com.akash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Software-engineers!")
public class SweController {
    private final SweService service;
    @Autowired
    public SweController(SweService service){
        this.service = service;
    }

    @GetMapping
    public List<Swe> getEngineer(){
        return service.getRepo();
    }

}
