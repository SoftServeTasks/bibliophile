/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.dao.factory;

import com.softserve.siniaieva.bibliophile.dao.BookDAO;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author ksu
 */
public class DAOFactoryTest {
    
    
    private DAOFactory <BookDAO> instance;
    
    public DAOFactoryTest() {
    }
    
    
    @Before
    public void setUp() {   
    instance = new DAOFactory("BookDAO");
    }
    

    /**
     * Test of getInstance method, of class DAOFactory.
     */

    @Test
    public void verifyGetInstanceReturnsSingleton() {
        try {
            BookDAO firstResultInstance = instance.getInstance();
            BookDAO secondResultInstance = instance.getInstance();
            assertEquals(firstResultInstance, secondResultInstance);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOFactoryTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DAOFactoryTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DAOFactoryTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(DAOFactoryTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(DAOFactoryTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(DAOFactoryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
