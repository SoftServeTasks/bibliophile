/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.dao.impl;

import com.softserve.siniaieva.bibliophile.dao.BookDAO;
import com.softserve.siniaieva.bibliophile.dao.factory.BookDAOFactory;
import com.softserve.siniaieva.bibliophile.models.Book;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stoxa
 */
public class BookDAOImitationTest {
    
    public BookDAOImitationTest() {
    }
    private BookDAO instance;
    private BookDAOFactory factory;
    private Book book1;
    private Book book2;
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println ("Start BookDAO testing");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println ("Start BookDAO testing");
    }
    
    @Before
    public void setUp() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        factory = new BookDAOFactory();
        instance = factory.getInstance();
        book1 = new Book("Красная шапочка", "Шарль Перро", "Сказки");
        book2 = new Book("Философия Java", "Брюс Эккель", "Программирование");
    }
    


    /**
     * Test of createtBook method, of class BookDAOImitation.
     */
    @Test
    public void testCreatetBook() {
        System.out.println("createtBook");
        instance.createtBook(book2);
        assertEquals(1, instance.getAllBooks().size());
    }

    /**
     * Test of updateBook method, of class BookDAOImitation.
     */
    @Test
    public void testUpdateBook() {
        System.out.println("updateBook");
        Book book = null;
        BookDAOImitation instance = null;
        instance.updateBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearAll method, of class BookDAOImitation.
     */
    @Test
    public void testClearAll() {
        System.out.println("clearAll");
        BookDAOImitation instance = null;
        instance.clearAll();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
