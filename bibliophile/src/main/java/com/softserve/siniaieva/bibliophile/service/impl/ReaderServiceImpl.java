/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.service.impl;

import com.softserve.siniaieva.bibliophile.dao.ReaderDAO;
import com.softserve.siniaieva.bibliophile.dao.factory.DAOFactory;
import com.softserve.siniaieva.bibliophile.entities.MappedReader;
import com.softserve.siniaieva.bibliophile.models.Reader;
import com.softserve.siniaieva.bibliophile.service.ReaderService;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author ksu
 */
public class ReaderServiceImpl implements ReaderService {
    
    private ReaderDAO dao;
    private DAOFactory<ReaderDAO> daoFactory;

    
    public void setDao(ReaderDAO dao) {
        this.dao = dao;
    }
    
    // TODO catch exeptions
    
    public ReaderServiceImpl() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        daoFactory = new DAOFactory("ReaderDAO");
        dao = daoFactory.getInstance();
    }
    
    

    @Override
    public void add(Reader businessModel) {
        dao.add(new MappedReader(businessModel));
    }

    @Override
    public void update(Reader businessModel) {
        dao.update(new MappedReader(businessModel));
    }

    @Override
    public void delete(Reader businessModel) {
        dao.delete(new MappedReader (businessModel));
    }

    @Override
    public Collection<Reader> getAll() {
        Collection<MappedReader> entities = dao.getAll();
        Collection<Reader> models = new ArrayList<>(entities.size());
        Reader reader = null;
        for (MappedReader mappedReader : entities) {
            reader = new Reader(mappedReader);
            models.add(reader);
        }
        return models;
    }

    @Override
    public void ban(Reader reader) {
        reader.setBanned(true);
    }
    
}
