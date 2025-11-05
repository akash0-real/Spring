package com.akash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SweService {

    private final SweRepo repo;

    @Autowired
    SweService(SweRepo repo){
        this.repo = repo;
    }

    public List<Swe> getRepo(){
        return repo.findAll() ;
    }
}
