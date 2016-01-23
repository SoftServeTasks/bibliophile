/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.service;

import com.softserve.siniaieva.bibliophile.models.Book;
import java.util.Collection;

/**
 *
 * @author ksu
 * @param <T>
 */
public interface GenericServce <T> {
    public void add(T businessModel);
    public void update(T businessModel);
    public void delete(T businessModel);
    public Collection<T> getAll();
}
