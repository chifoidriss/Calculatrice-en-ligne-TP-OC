package com.calculatrice.model;

import javax.servlet.http.HttpServletRequest;

public class Calcul {
	
	private float resultat;
	private float val1;
	private float val2;
	private String opera;

	public Calcul() {
		
	}
	
	private void setVal1(String val1) {
		if(val1 != null && val1 != "") {
			this.val1 = (Float.parseFloat(val1));
		}else {
			this.val1 = 0;
		}
	}
	
	private void setVal2(String val2) {
		if(val2 != null && val2 != "") {
			this.val2 = (Float.parseFloat(val2));
		}else {
			this.val2 = 0;
		}
	}
	
	public void operation(HttpServletRequest request) {
		
		setVal1(request.getParameter("val1"));
		setVal2(request.getParameter("val2"));

		this.opera = request.getParameter("operation");
		
		if(opera.equalsIgnoreCase("add")) {
			request.setAttribute("opera", "+");
			this.resultat = val1 + val2;
		} else if(opera.equalsIgnoreCase("sous")) {
			request.setAttribute("opera", "-");
			this.resultat = val1 - val2;
		} else if(opera.equalsIgnoreCase("mult")) {
			request.setAttribute("opera", "x");
			this.resultat = val1 * val2;
		} else if(opera.equalsIgnoreCase("div")) {
			request.setAttribute("opera", "/");
			if(this.val2 != 0) {
				this.resultat = val1 / val2;
			}else {
				request.setAttribute("error", "ERREUR: DIVISION PAR 0 NON AUTORISEE!!!");
			}
		}
		
		request.setAttribute("resultat", this.resultat);
		request.setAttribute("val1", this.val1);
		request.setAttribute("val2", this.val2);
	}

}
