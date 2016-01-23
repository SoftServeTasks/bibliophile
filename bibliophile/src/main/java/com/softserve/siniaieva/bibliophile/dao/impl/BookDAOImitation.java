/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.dao.impl;

import com.softserve.siniaieva.bibliophile.dao.BibliophileDAO;
import com.softserve.siniaieva.bibliophile.dao.BookDAO;
import com.softserve.siniaieva.bibliophile.entities.MappedBook;
import com.softserve.siniaieva.bibliophile.models.Book;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ksu
 */
public class BookDAOImitation implements BookDAO{
    
    private Map <String,MappedBook> books=new HashMap<String,MappedBook>();
    private static BookDAOImitation instance;
    
    private BookDAOImitation () {}

    public static BookDAOImitation getInstance() {
        
    if (instance == null) {
      instance = new BookDAOImitation();
    }
    return instance;
   }

    @Override
    public void add(MappedBook book) {
        books.put(book.getTitle(),book);
    }

    @Override
    public void update(MappedBook book) {
        MappedBook oldBook = get(book.getTitle());
        if(oldBook != null) {
            oldBook.setCategory(book.getCategory());
            oldBook.setAuthor(book.getAuthor());
    }
    }

    @Override
    public void delete(MappedBook book) {
        books.remove(book.getTitle(), book);
    }

    @Override
    public MappedBook get(String title) {
        return books.get(title);
    }

    @Override
    public Collection<MappedBook> getAll() {
        return  books.values();
    }
    
    public void clearAll() {
    books.clear();
    }

    public Map<String, MappedBook> getBooks() {
        return books;
    }

    public void setBooks(Map<String, MappedBook> books) {
        this.books = books;
    }
    
    
    
}
