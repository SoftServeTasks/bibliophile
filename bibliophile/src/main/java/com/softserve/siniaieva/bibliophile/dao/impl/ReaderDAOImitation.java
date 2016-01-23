/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.dao.impl;

import com.softserve.siniaieva.bibliophile.dao.ReaderDAO;
import com.softserve.siniaieva.bibliophile.entities.MappedBook;
import com.softserve.siniaieva.bibliophile.entities.MappedReader;
import com.softserve.siniaieva.bibliophile.models.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ksu
 */
public class ReaderDAOImitation implements ReaderDAO{
    
    private Map <String,MappedReader> readers = new HashMap<String,MappedReader>();
    private static ReaderDAOImitation instance;
    
    private ReaderDAOImitation () {}

    public static ReaderDAOImitation getInstance() {
        
    if (instance == null) {
      instance = new ReaderDAOImitation();
    }
    return instance;
   }


    @Override
    public void add(MappedReader entity) {
        readers.put(entity.getEmail(),entity);
    }

    @Override
    public void update(MappedReader entity) {
        MappedReader oldReader = get(entity.getEmail());
        if(oldReader != null) {
            oldReader.setName(entity.getName());
            oldReader.setSurname(entity.getSurname());
            oldReader.setPhone(entity.getPhone());
            oldReader.setBanned(entity.isBanned());
        }
    }

    @Override
    public void delete(MappedReader entity) {
        readers.remove(entity.getEmail(), entity);
    }

    @Override
    public MappedReader get(String email) {
        return readers.get(email);
    }

    @Override
    public Collection<MappedReader> getAll() {
        return readers.values();
    }
    
}
