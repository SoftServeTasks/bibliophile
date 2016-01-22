/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.dao;


import com.softserve.siniaieva.bibliophile.models.Book;
import java.util.Collection;
import java.util.Set;

/**
 *
 * @author stoxa
 */
public interface BookDAO {
    public void createtBook(Book book);
    public void updateBook(Book book);
    public void deleteBook(Book book);
    public Book getBook(String title);
    public Collection<Book> getAllBooks();
    
}
