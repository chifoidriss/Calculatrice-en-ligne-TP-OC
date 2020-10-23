package com.calculatrice.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.calculatrice.model.Calcul;


@WebServlet({ "/home", "/Calculatrice", "/calculatrice" })
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Calculatrice() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Calcul calculons = new Calcul();
		
		calculons.operation(request);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

}
