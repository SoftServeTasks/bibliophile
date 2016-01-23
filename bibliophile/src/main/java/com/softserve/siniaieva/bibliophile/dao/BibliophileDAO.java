/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.dao;

import java.util.Collection;

/**
 *
 * @author ksu
 * @param <T>
 */
public interface BibliophileDAO <T> {
    public void add(T entity);
    public void update(T entity);
    public void delete(T entity);
    public T get(String title);
    // TODO public T get(Parametr parametr);
    public Collection<T> getAll();
}
