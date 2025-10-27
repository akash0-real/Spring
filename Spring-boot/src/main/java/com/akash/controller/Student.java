package com.akash.controller;

import java.util.Objects;

public class Student {
    private String name;
    private int year;
    private String course;

    public Student(String name,int year,String course){
        this.name = name;
        this.year = year;
        this.course = course;
    }

    //getters!!
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public String getCourse(){
        return course;
    }
    //setters!!
    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setCourse(String course){
        this.course = course;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && year == student.year && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, course);
    }
}


