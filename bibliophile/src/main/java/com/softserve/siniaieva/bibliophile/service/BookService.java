/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.service;

import com.softserve.siniaieva.bibliophile.models.Book;
import java.util.Collection;
import java.util.Comparator;
/**
 *
 * @author ksu
 */
public interface BookService extends GenericServce <Book> {
    public Book getByTitle (String title);
    public Collection <Book> getSortedList (Comparator compareParameter);
}
