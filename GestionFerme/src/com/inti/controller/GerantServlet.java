package com.inti.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inti.entities.Gerant;
import com.inti.services.impl.ManagerService;
import com.inti.services.interfaces.IService;

@WebServlet("/accueil")
public class GerantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	IService<Gerant> GerantService = new ManagerService<>();
	
   
    public GerantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("Gerants", GerantService.findAll(Gerant.class));
		request.getRequestDispatcher("accueil.jsp").forward(request, response);
	}

}
