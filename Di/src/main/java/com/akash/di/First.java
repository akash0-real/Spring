package com.akash.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class First {
    
    @Autowired//Field injection!
    @Qualifier("laptop")
    Job laptop;

    public void build(){
        laptop.complie();
        System.out.println("Working on awesome project!!");
    }
}

@Component
class Laptop implements Job{
    @Override
    public void complie(){
        System.out.println("compliing 404 errors!!");
    }
}

interface Job{
    void complie();
}



@Component
@Primary
class Science implements Job{
    @Override
    public void complie(){
        System.out.println("my name is bhat!!");
    }
}