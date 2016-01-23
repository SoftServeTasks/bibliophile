/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.service.impl;

import com.softserve.siniaieva.bibliophile.dao.ReaderDAO;
import com.softserve.siniaieva.bibliophile.entities.MappedReader;
import com.softserve.siniaieva.bibliophile.models.Reader;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author Ksu
 */
public class ReaderServiceImplTest {
    
    private ReaderServiceImpl instance;
    private Reader reader1;
    private Reader reader2;
    private static ReaderDAO dao;
    
    public ReaderServiceImplTest() {
        
    }
    @BeforeClass
    public static void setUpClass() {
        dao = mock(ReaderDAO.class);
    }
    
    @Before
    public void setUp() {
        instance.setDao(dao);
        reader1 = new Reader("Mikky", "Mouse", "789", "mikky@gmail.com");
        reader2 = new Reader("Garry", "Potter", "123456789", "garry@yandex.ru");
    }
    
    /**
     * Test of add method, of class ReaderServiceImpl.
     */
    @Test
    public void verifyAddReader() {
        instance.add(reader1);
        verify(dao).add(new MappedReader(reader1));
    }

    /**
     * Test of update method, of class ReaderServiceImpl.
     */
    @Test
    public void verifyUpdateReader() {
        Reader newReader = new Reader("Mikky", "Mouse", "+380967482512", "mikky@gmail.com");
        instance.update(newReader);
        verify(dao).update(new MappedReader(newReader));
    }

    /**
     * Test of delete method, of class ReaderServiceImpl.
     */
    @Test
    public void verifyDeleteReader() {
        instance.delete(reader2);
        verify(dao).delete(new MappedReader (reader2));
    }

    /**
     * Test of getAll method, of class ReaderServiceImpl.
     */
    @Test
    public void verifytGetAllReaders() {
        Collection<MappedReader> mappedReaders = new ArrayList();
        mappedReaders.add(new MappedReader(reader1));
        mappedReaders.add(new MappedReader(reader2));
        when(dao.getAll()).thenReturn(mappedReaders);
        
        Collection<Reader> expResult = new ArrayList();
        expResult.add(reader1);
        expResult.add(reader2);
        
        instance.add(reader1);
        instance.add(reader2);
        
        Collection<Reader> result = instance.getAll();
        assertEquals(expResult, result);

    }

    /**
     * Test of ban method, of class ReaderServiceImpl.
     */
    @Test
    public void verfyReaderBan() {
        instance.add(reader1);
        instance.ban(reader1);
        assertEquals(true, reader1.isBanned());
    }
    
}
