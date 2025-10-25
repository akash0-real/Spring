package com.akash;

import java.util.Objects;

public class Swe {
    private int id;
    private String name;
    private String skills;

    public Swe(int id,String name,String skills){
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    //getters!!
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSkills(){
        return skills;
    }

    //setters!!
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSkills(String skills){
        this.skills = skills;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Swe swe = (Swe) o;
        return id == swe.id && Objects.equals(name, swe.name) && Objects.equals(skills, swe.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, skills);
    }
}
