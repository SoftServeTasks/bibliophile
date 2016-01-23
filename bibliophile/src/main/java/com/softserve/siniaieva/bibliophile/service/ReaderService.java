/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.service;

import com.softserve.siniaieva.bibliophile.models.Reader;

/**
 *
 * @author ksu
 */
public interface ReaderService extends GenericServce<Reader> {
    public void ban(Reader reader);
}
