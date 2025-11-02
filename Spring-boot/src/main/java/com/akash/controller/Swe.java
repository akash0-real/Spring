package com.akash.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity
public class Swe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String skills;

    public Swe() {}

    public Swe(int id, String name, String skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public Swe(String name, String skills) {
        this.name = name;
        this.skills = skills;
    }


    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Swe swe = (Swe) o;
        return id == swe.id && Objects.equals(name, swe.name) && Objects.equals(skills, swe.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, skills);
    }
}
