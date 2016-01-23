/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.models;

import com.softserve.siniaieva.bibliophile.entities.MappedBook;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ksu
 */
public class Book implements Serializable{
    
    private String title;
    private String author;
    private String category;
    private int rating;

    public Book() {
    }
    
    public Book(String title, String author, String category) {
        this.title = title;
        this.author = author;
        this.category = category;
    }
    
     public Book(MappedBook entity) {
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.category = entity.getCategory();
    }
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    /**
     * rating is increasing when Readers add this book in their libraries
     */
    public void increaseRating() {
        rating++;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.title);
        hash = 97 * hash + Objects.hashCode(this.author);
        hash = 97 * hash + Objects.hashCode(this.category);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.category, other.category)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("Book{ title = %s, author= %s, category=%s ", title, author, category);
    }
    
    
    
}
