/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.service;

import com.softserve.siniaieva.bibliophile.models.Book;
import java.util.Collection;
/**
 *
 * @author stoxa
 */
public interface BookServise {
    public void addBook(Book book);
    public void updateBook(Book book);
    public void deleteBook(Book book);
    public Book getBookByTitle (String title);
    public Collection<Book> getAllBooks();
}
