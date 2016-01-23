/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.models;

import com.softserve.siniaieva.bibliophile.entities.MappedReader;
import java.io.Serializable;

/**
 *
 * @author ksu
 */
public class Reader implements Serializable {

    private String name;
    private String surname;
    private String phone;
    private String email;
    private boolean banned;

    public Reader() {
        banned = false;
    }

    public Reader(String name, String surname, String phone, String email) {
        this();
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }

    public Reader(MappedReader entity) {
        this.name = entity.getName();
        this.surname = entity.getSurname();
        this.phone = entity.getPhone();
        this.email = entity.getEmail();
        this.banned = entity.isBanned();
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }
    
    

    @Override
    public String toString() {
        return String.format("Reader { name = %s, surname= %s, phone= %s, email= %s ", name, surname, phone, email);
    }

    @Override
    public boolean equals(Object obj) {
        return (this.toString().equalsIgnoreCase(obj.toString())) ? true : false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
}
