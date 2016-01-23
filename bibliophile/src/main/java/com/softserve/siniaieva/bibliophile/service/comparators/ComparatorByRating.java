/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.service.comparators;

import com.softserve.siniaieva.bibliophile.models.Book;
import java.util.Comparator;

/**
 *
 * @author ksu
 */
public class ComparatorByRating implements Comparator<Book>{

    @Override
    public int compare(Book t, Book t1) {
        return Integer.compare(t.getRating(), t1.getRating());
    }
    
}
