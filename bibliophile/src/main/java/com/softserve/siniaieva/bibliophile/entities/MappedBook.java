/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.entities;


import com.softserve.siniaieva.bibliophile.models.Book;
import com.softserve.siniaieva.bibliophile.models.Reader;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/**
 *
 * @author ksu
 */
public class MappedBook implements Serializable {

    private long id;
    private String title;
    private String author;
    private String category;
    private Set<Reader> readers = new HashSet<Reader>();

    public MappedBook() {
    }
    
    public MappedBook(String title, String author, String category) {
        this.title = title;
        this.author = author;
        this.category = category;
    }
    
     public MappedBook(Book model) {
        this.title = model.getTitle();
        this.author = model.getAuthor();
        this.category = model.getCategory();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Set<Reader> getReaders() {
        return readers;
    }

    public void setReaders(Set<Reader> readers) {
        this.readers = readers;
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
        final MappedBook other = (MappedBook) obj;
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
        return "Book{" + "title=" + title + ", author=" + author + ", category=" + category + '}';
    }
    
}
