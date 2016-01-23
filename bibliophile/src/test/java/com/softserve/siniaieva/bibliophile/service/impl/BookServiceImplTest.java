/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.service.impl;

import com.softserve.siniaieva.bibliophile.dao.BookDAO;
import com.softserve.siniaieva.bibliophile.models.Book;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 *
 * @author stoxa
 */
public class BookServiceImplTest {
    
    public BookServiceImplTest() {
    }
    
    private BookServiceImpl instance;
    private Book book1;
    private Book book2;
    private static BookDAO dao;
    
    
    @BeforeClass
    public static void setUpClass() {
        dao = mock(BookDAO.class);
    }
    
    
    @Before
    public void setUp() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        instance = new BookServiceImpl();
        instance.setDao(dao);
        book1 = new Book("Красная шапочка", "Шарль Перро", "Сказки");
        book2 = new Book("Философия Java", "Брюс Эккель", "Программирование");
    }
    
    /**
     * Test of addBook method, of class BookServiceImpl.
     */

    @Test
    public void verifyAddBook() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        instance.addBook(book1);
        verify(dao).add(book1);
    }

    /**
     * Test of updateBook method, of class BookServiceImpl.
     */
    @Test
    public void verifyUpdateBook() throws ClassNotFoundException, InstantiationException {
        instance.updateBook(book1);
        verify(dao).update(book1);
    }

    /**
     * Test of deleteBook method, of class BookServiceImpl.
     */

    @Test
    public void verifyDeleteBook() throws ClassNotFoundException {
        instance.deleteBook(book2);
        verify(dao).delete(book2);
    }

    /**
     * Test of getBookByTitle method, of class BookServiceImpl.
     */

    @Test
    public void verifyGetBookByTitle() {
        when(dao.get("Красная шапочка")).thenReturn(book1);
        String title = "Красная шапочка";
        Book result = instance.getBookByTitle(title);
        assertEquals(book1, result);
    }

    /**
     * Test of getAllBooks method, of class BookServiceImpl.
     */

    @Test
    public void testGetAllBooks() throws ClassNotFoundException {
        Collection<Book> expResult = new ArrayList();
        expResult.add(book1);
        expResult.add(book2);
        instance.addBook(book1);
        instance.addBook(book2);
        when(dao.getAll()).thenReturn(expResult);
        Collection<Book> result = instance.getAllBooks();
        assertEquals(expResult, result);
    }
    
}
