package com.inti.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inti.services.impl.GerantService;
import com.inti.services.interfaces.IGerantService;


@WebServlet("/Delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    IGerantService gerantService= new GerantService();   
  
    public DeleteServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long idger=Long.parseLong(request.getParameter("pId"));
		GerantService.remove(idger);
		request.getRequestDispatcher("accueil.jsp").forward(request, response);
	}
	
}
