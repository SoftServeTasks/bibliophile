/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.siniaieva.bibliophile.controllers;

import com.softserve.siniaieva.bibliophile.models.Book;
import com.softserve.siniaieva.bibliophile.service.BookService;
import com.softserve.siniaieva.bibliophile.service.impl.BookServiceImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ksu
 */

@WebServlet(
        description = "Add New Servlet", 
        urlPatterns = { "/bibliophile/books" })
public class AddBookController extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
            String title = request.getParameter("title");
            System.err.println("title: = " + title);
            String author = request.getParameter("author");  
            String category = request.getParameter("category");  
            Book newBook = new Book(title, author, category);
            BookService service = new BookServiceImpl();
                service.add(newBook);
                
		request.setAttribute("books", service.getAll());
		getServletContext().getNamedDispatcher("MainView").forward(request, response);
    }
    
}
