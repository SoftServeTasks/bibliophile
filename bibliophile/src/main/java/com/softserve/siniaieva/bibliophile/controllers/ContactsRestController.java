/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.controllers;

import com.softserve.siniaieva.bibliophile.models.Book;
import com.softserve.siniaieva.bibliophile.service.BookService;
import com.softserve.siniaieva.bibliophile.service.ReaderService;
import com.softserve.siniaieva.bibliophile.service.impl.BookServiceImpl;
import com.softserve.siniaieva.bibliophile.service.impl.ReaderServiceImpl;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ksu
 */
@WebServlet
public class ContactsRestController extends HttpServlet  {
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
                BookService service = new BookServiceImpl();
 
                service.add(new Book("Kobzar", "Shevchenko", "Ukrainian poetry"));
		request.setAttribute("books", service.getAll());
		getServletContext().getNamedDispatcher("MainView").forward(request, response);
    }
    
   
}
    

