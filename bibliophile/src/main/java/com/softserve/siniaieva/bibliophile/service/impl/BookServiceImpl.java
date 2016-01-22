/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.service.impl;

import com.softserve.siniaieva.bibliophile.dao.BookDAO;
import com.softserve.siniaieva.bibliophile.dao.factory.BookDAOFactory;
import com.softserve.siniaieva.bibliophile.models.Book;
import com.softserve.siniaieva.bibliophile.service.BookServise;
import java.util.Collection;

/**
 *
 * @author ksu
 */
public class BookServiceImpl implements BookServise {
    
    private BookDAO dao;
    private BookDAOFactory daoFactory;

    public BookServiceImpl() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        daoFactory = new BookDAOFactory();
        dao = daoFactory.getInstance();
    }
    
    

    @Override
    public void addBook(Book book) {
       dao.createtBook(book);
    }

    @Override
    public void updateBook(Book book) {
        dao.updateBook(book);
    }

    @Override
    public void deleteBook(Book book) {
        dao.deleteBook(book);
    }

    @Override
    public Book getBookByTitle(String title) {
        return dao.getBook(title);
    }

    @Override
    public Collection<Book> getAllBooks() {
        return dao.getAllBooks();
    }
    
}
