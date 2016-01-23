/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.dao.impl;

import com.softserve.siniaieva.bibliophile.dao.BookDAO;
import com.softserve.siniaieva.bibliophile.dao.factory.DAOFactory;
import com.softserve.siniaieva.bibliophile.entities.MappedBook;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
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
    private DAOFactory <BookDAO> factory;
    private MappedBook book1;
    private MappedBook book2;
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println ("Start BookDAO testing");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println ("Start BookDAO testing");
    }
    
    @Before
    public void setUp() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        factory = new DAOFactory<>("BookDAO");
        instance = factory.getInstance();
        book1 = new MappedBook("Красная шапочка", "Шарль Перро", "Сказки");
        book2 = new MappedBook("Философия Java", "Брюс Эккель", "Программирование");
    }
    


    /**
     * Test of add method, of class BookDAOImitation.
     */
    @Test
    public void verifyAddBook() {
        instance.add(book1);
        instance.add(book2);
        assertEquals(2, instance.getAll().size());
    }

    /**
     * Test of update method, of class BookDAOImitation.
     */
    @Test
    public void verifyUpdateBookCategory() {
        System.out.println("updateBook");
        MappedBook book = new MappedBook("Философия Java", "Брюс Эккель", "Java");
        instance.add(book2);
        instance.update(book);
        assertEquals(book, instance.get("Философия Java"));
    }
    
    @Test
    public void verifyUpdateBookAuthor() {
        System.out.println("updateBook");
        MappedBook book = new MappedBook("Философия Java", "Bruce Eckel", "Программирование");
        instance.update(book);
        assertEquals(book, instance.get("Философия Java"));
    }

    /**
     * Test of clearAll method, of class BookDAOImitation.
     */
    @Test
    public void verifyGetAllBooksList() {
        System.out.println("clearAll");
        Collection expResult = new ArrayList();
        expResult.add(book1);
        expResult.add(book2);
        instance.add(book1);
        instance.add(book2);
        Collection result = instance.getAll();
        assertEquals(expResult.size(), result.size());
    }
    
}
