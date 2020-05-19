package com.javahelps.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "student")
public class Studente
{
    @Id
    private Integer id;
    private String name;
    private String surname;
    private String sidi_code;
    private String tax_code;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSidi_code() {
        return sidi_code;
    }

    public void setSidi_code(String sidi_code) {
        this.sidi_code = sidi_code;
    }

    public String getTax_code() {
        return tax_code;
    }

    public void setTax_code(String tax_code) {
        this.tax_code = tax_code;
    }
    
    

    @Override
    public String toString() {
        return "Studente{" + "id='" + id + '\'' + ", nome='" + name + '\'' + ", cognome=" + surname + '\'' + ", sidi=" + sidi_code + '\'' + ", fiscale=" + tax_code + '\'' +'}';
    }
    
    
}