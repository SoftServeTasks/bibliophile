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
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

/**
 *
 * @author ksu
 */
public class BookServiceImpl implements BookServise {
    
    private BookDAO dao;
    private BookDAOFactory daoFactory;

    public BookServiceImpl() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        daoFactory = new BookDAOFactory();
        dao = daoFactory.getInstance();
    }
    
    

    @Override
    public void addBook(Book book) {
       dao.add(book);
    }

    @Override
    public void updateBook(Book book) {
        dao.update(book);
    }

    @Override
    public void deleteBook(Book book) {
        dao.delete(book);
    }

    @Override
    public Book getBookByTitle(String title) {
        return dao.get(title);
    }

    @Override
    public Collection<Book> getAllBooks() {
        return dao.getAll();
    }

    public BookDAO getDao() {
        return dao;
    }

    public void setDao(BookDAO dao) {
        this.dao = dao;
    }

    public BookDAOFactory getDaoFactory() {
        return daoFactory;
    }

    public void setDaoFactory(BookDAOFactory daoFactory) {
        this.daoFactory = daoFactory;
    }
    
    
    
}
