package com.akash.di;

public class Second {
    public void say(){
        System.out.println("this is constructor DI!!");
    }
}

class Third{
    private final Second second;

    public Third(Second second) {
        this.second = second;
    }
    public void said (){
        second.say();
        System.out.println("worked Fine!!");
    }

    
}
