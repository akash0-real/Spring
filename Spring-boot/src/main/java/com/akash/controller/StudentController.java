package com.akash.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student("akash",2,"java"),
                new Student("max",1,"dbms"),
                new Student("lecrec",2,"computer networks")
        );

    }
}
