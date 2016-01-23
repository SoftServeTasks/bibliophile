/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.entities;

import com.softserve.siniaieva.bibliophile.models.Reader;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ksu
 */
public class MappedReader {

    private long id;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private boolean banned;
    private Set<MappedBook> readBooks = new HashSet<>();

    public MappedReader() {
    }

    public MappedReader(String name, String surname, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }

    public MappedReader(String name, String surname, String phone, String email, Set<MappedBook> readBooks) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.readBooks = readBooks;
    }

    public MappedReader(Reader model) {
        this.name = model.getName();
        this.surname = model.getSurname();
        this.phone = model.getPhone();
        this.email = model.getEmail();
        this.banned = model.isBanned();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Set<MappedBook> getReadBooks() {
        return readBooks;
    }

    public void setReadBooks(Set<MappedBook> readBooks) {
        this.readBooks = readBooks;
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
