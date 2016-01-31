/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.service.impl;

import com.softserve.siniaieva.bibliophile.dao.BookDAO;
import com.softserve.siniaieva.bibliophile.entities.MappedBook;
import com.softserve.siniaieva.bibliophile.models.Book;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author ksu
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
     * Test of add method, of class BookServiceImpl.
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */

    @Test
    public void verifyAddBook() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        instance.add(book1);
        verify(dao).add(new MappedBook(book1));
    }

    /**
     * Test of update method, of class BookServiceImpl.
     */
    @Test
    public void verifyUpdateBook() throws ClassNotFoundException, InstantiationException {
        instance.update(book1);
        verify(dao).update(new MappedBook(book1));
    }

    /**
     * Test of delete method, of class BookServiceImpl.
     */

    @Test
    public void verifyDeleteBook() throws ClassNotFoundException {
        instance.delete(book2);
        verify(dao).delete(new MappedBook(book2));
    }

    /**
     * Test of getByTitle method, of class BookServiceImpl.
     */

    @Test
    public void verifyGetBookByTitle() {
        when(dao.get("Красная шапочка")).thenReturn(new MappedBook(book1));
        String title = "Красная шапочка";
        Book result = instance.getByTitle(title);
        assertEquals(book1, result);
    }

    /**
     * Test of getAll method, of class BookServiceImpl.
     */

    @Test
    public void verifyGetAllBooks() throws ClassNotFoundException {
        Collection<MappedBook> mappedBooks = new ArrayList();
        mappedBooks.add(new MappedBook(book1));
        mappedBooks.add(new MappedBook(book2));
        when(dao.getAll()).thenReturn(mappedBooks);
        
        Collection<Book> expResult = new ArrayList();
        expResult.add(book1);
        expResult.add(book2);
        
        instance.add(book1);
        instance.add(book2);
        
        Collection<Book> result = instance.getAll();
        
        assertEquals(expResult, result);
    }
    
}
