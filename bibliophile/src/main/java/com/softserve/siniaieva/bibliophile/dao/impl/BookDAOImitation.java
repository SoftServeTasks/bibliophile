/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.dao.impl;

import com.softserve.siniaieva.bibliophile.dao.BibliophileDAO;
import com.softserve.siniaieva.bibliophile.dao.BookDAO;
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
    
    private Map <String,Book> books=new HashMap<String,Book>();
    private static BookDAOImitation instance;
    
    private BookDAOImitation () {}

    public static BookDAOImitation getInstance() {
        
    if (instance == null) {
      instance = new BookDAOImitation();
    }
    return instance;
   }

    @Override
    public void add(Book book) {
        books.put(book.getTitle(),book);
    }

    @Override
    public void update(Book book) {
        Book oldBook = get(book.getTitle());
        if(oldBook != null) {
            oldBook.setCategory(book.getCategory());
            oldBook.setAuthor(book.getAuthor());
    }
    }

    @Override
    public void delete(Book book) {
        books.remove(book.getTitle(), book);
    }

    @Override
    public Book get(String title) {
        return books.get(title);
    }

    @Override
    public Collection<Book> getAll() {
        return  books.values();
    }
    
    public void clearAll() {
    books.clear();
    }

    public Map<String, Book> getBooks() {
        return books;
    }

    public void setBooks(Map<String, Book> books) {
        this.books = books;
    }
    
    
    
}
