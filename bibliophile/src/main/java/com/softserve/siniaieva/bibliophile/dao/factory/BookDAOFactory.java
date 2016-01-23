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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

    public BookDAOFactory(String propertyFilePath) {
        this();
        this.propertyFilePath = propertyFilePath;
        
    }
 

    public BookDAOFactory() {
        propertyFilePath = "src/main/resources/dao_factory.properties";
        LOGGER = LoggerFactory.getLogger(BookDAOFactory.class);
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
    
    
    
    public BookDAO getInstance () throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        Class c = Class.forName(daoType); 
        Method method = c.getDeclaredMethod("getInstance");
        return (BookDAO) method.invoke(null, null);
    }
    
}
