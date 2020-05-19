package com.javahelps.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "class")
public class Classe
{
    @Id
    private Integer id;
    private Integer year;
    private String section;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Classe{" + "id='" + id + '\'' + ", year='" + year + '\'' + ", section=" + section + '\'' + '}';
    }
    
    
}