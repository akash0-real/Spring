package com.akash.di;

public class Set {
    public void msg(){
        System.out.println("Output using setters!!");
    }
}

class setTo{
    private Set set;
    
    public void setSetTo(Set set){
        this.set = set;
    }
    public void ok(){
        System.out.println("Everything went oK!!");
    }
}
