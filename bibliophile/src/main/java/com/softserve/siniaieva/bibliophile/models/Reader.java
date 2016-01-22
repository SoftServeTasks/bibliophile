/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.models;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Collator;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;


/**
 *
 * @author ksu
 */
public class Reader implements Serializable {
    
  
    private String name;
    private String surname;
    private String phone;
    private String email;
    private Set <Book> readBooks= new HashSet<Book>();
   
    public Reader() {
    }
 
    public Reader(String name, String surname, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }
    

       public Reader(String name, String surname, String phone, String email, Set <Book> readBooks) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.readBooks=readBooks;
    } 
    
    @Override
    public String toString() {
        return "Contact {name=" + name + ", surname=" + surname + ", phone=" + phone + ", email=" + email + "}";
    }


    
    @Override
    public boolean equals(Object obj) {
        return (this.toString().equalsIgnoreCase(obj.toString()))? true : false;  
    }
    

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
    
}

