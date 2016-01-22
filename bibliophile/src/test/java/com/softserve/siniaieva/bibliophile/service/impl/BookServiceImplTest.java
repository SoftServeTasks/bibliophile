/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.service.impl;

import com.softserve.siniaieva.bibliophile.models.Book;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

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
    
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println ("Start BookServiceImpl testing");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println ("Finish BookServiceImpl testing");
    }
    
    @Before
    public void setUp() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        instance = new BookServiceImpl();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addBook method, of class BookServiceImpl.
     */
    @Ignore
    @Test
    public void testAddBook() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println("addBook");
        Book book = null;
        
        instance.addBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBook method, of class BookServiceImpl.
     */
    @Ignore
    @Test
    public void testUpdateBook() throws ClassNotFoundException, InstantiationException {
        System.out.println("updateBook");
        instance.updateBook(book1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBook method, of class BookServiceImpl.
     */
    @Ignore
    @Test
    public void testDeleteBook() throws ClassNotFoundException {
        instance.deleteBook(book2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookByTitle method, of class BookServiceImpl.
     */
    @Ignore
    @Test
    public void testGetBookByTitle() {
        System.out.println("getBookByTitle");
        String title = "";
        instance.getBookByTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllBooks method, of class BookServiceImpl.
     */
    @Ignore
    @Test
    public void testGetAllBooks() throws ClassNotFoundException {
        System.out.println("getAllBooks");
        Collection<Book> expResult = null;
        Collection<Book> result = instance.getAllBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
