/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.service.impl;

import com.softserve.siniaieva.bibliophile.dao.BookDAO;
import com.softserve.siniaieva.bibliophile.dao.factory.DAOFactory;
import com.softserve.siniaieva.bibliophile.entities.MappedBook;
import com.softserve.siniaieva.bibliophile.models.Book;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import com.softserve.siniaieva.bibliophile.service.BookService;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ksu
 */
public class BookServiceImpl implements BookService {
    
    private BookDAO dao;
    private DAOFactory<BookDAO> daoFactory;

    public BookServiceImpl() {
        daoFactory = new DAOFactory("src/main/resources/dao_factory.properties","BookDAO");
        try {
            dao = daoFactory.getInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
    
    

    @Override
    public void add(Book book) {
       dao.add(new MappedBook(book));
    }

    @Override
    public void update(Book book) {
        dao.update(new MappedBook(book));
    }

    @Override
    public void delete(Book book) {
        dao.delete(new MappedBook(book));
    }

    @Override
    public Book getByTitle(String title) {
        return new Book(dao.get(title));
    }

    @Override
    public Collection<Book> getAll() {
        Collection<MappedBook> entities = dao.getAll();
        Collection<Book> models = new ArrayList<Book>(entities.size());
        Book book = null;
        for (MappedBook mappedBook : entities) {
            book = new Book(mappedBook);
            models.add(book);
        }
        return models;
    }

    public BookDAO getDao() {
        return dao;
    }

    public void setDao(BookDAO dao) {
        this.dao = dao;
    }

    public DAOFactory getDaoFactory() {
        return daoFactory;
    }

    public void setDaoFactory(DAOFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Collection<Book> getSortedList(Comparator compareParameter) {
        ArrayList <Book> sortedBooks = (ArrayList <Book>) this.getAll();
        sortedBooks.sort(compareParameter);
        return sortedBooks;
    }
 
}
