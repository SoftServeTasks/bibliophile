/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.dao.factory;

import com.softserve.siniaieva.bibliophile.dao.BookDAO;
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
public class BookDAOFactoryTest {
    
    public BookDAOFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class BookDAOFactory.
     */
    @Test
    public void testGetInstance() throws Exception {
        System.out.println("getInstance");
        BookDAOFactory instance = new BookDAOFactory();
        BookDAO expResult = null;
        BookDAO result = instance.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
