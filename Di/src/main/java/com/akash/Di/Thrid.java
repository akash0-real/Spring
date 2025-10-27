package com.akash.Di;

import org.springframework.stereotype.Component;

@Component
public class Thrid {
    private final Student student;
    public Thrid(Student student){
        this.student = student;
        System.out.println("Constructor DI");

    }

    public void stDisplay(){
        student.display();
    }


}

@Component
class Student{
    String name;
    int age;
    String course;

    public Student(){
        this.name = "akash";
        this.age = 19;
        this.course = "cs";
    }

    void display(){
        System.out.println("My name is: " + name + "," + age + " years old," + "doing " + course);
    }
}
