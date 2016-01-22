/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.dao.factory;

import java.util.Properties;
import com.softserve.siniaieva.bibliophile.dao.BookDAO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ksu
 */
public class BookDAOFactory {
    
    private String daoType;
    private String propertyFilePath;
    private Properties property;
    private FileInputStream fis;
    private static Logger LOGGER;

    public BookDAOFactory() {
        LOGGER = LoggerFactory.getLogger(BookDAOFactory.class);
        propertyFilePath = "src/main/resources/dao_factory.properties";
        try {
            property = new Properties();
            fis = new FileInputStream(propertyFilePath);
            property.load(fis);
        } catch (FileNotFoundException ex) {
            LOGGER.error("Property file " + propertyFilePath + " doesn't exist", ex);
        } catch (IOException ex) {
            LOGGER.error("Unable to download Property file: " + propertyFilePath, ex);
        }
        daoType = property.getProperty("dao");
    }
    
    
    
    public BookDAO getInstance () throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c = Class.forName(daoType); 
        return (BookDAO) c.newInstance();   
    }
    
}
