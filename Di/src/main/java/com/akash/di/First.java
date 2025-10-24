package com.akash.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class First {
    
    @Autowired//Field injection!
    Laptop laptop;

    public void build(){
        laptop.complie();
        System.out.println("Working on awesome project!!");
    }
}

@Component
class Laptop{
    public void complie(){
        System.out.println("compliing 404 errors!!");
    }
}

interface Student{
    void name();
}

@Component
class Art implements Student{
    @Override
    public void name(){
        System.out.println("My name is akash!!");
    }
}