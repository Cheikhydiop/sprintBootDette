package web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.CreditMetierImpl;
import metier.ICreditMetier;  

public class ControlleurServlet extends HttpServlet {
	ICreditMetier metier;
@Override
public void init() throws ServletException {
	  metier = new CreditMetierImpl();
	
}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	

	
	 req.setAttribute("result", new CreditMetier());	  	
	 req.getRequestDispatcher("vueCredit.jsp").forward(req,resp);
	}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	 double montant =Double.parseDouble(req.getParameter("montant"));
	 double taux =Double.parseDouble(req.getParameter("taux"));
	 int duree  =Integer.parseInt(req.getParameter("duree"));
	 
	 CreditMetier model = new CreditMetier();
	 model.setMontant(montant);
	 model.setTaux(taux);
	 model.setDuree(duree);
	 double result=metier.calculMensualiteCredit(montant, taux, duree);
	 model.setMensualite(result);
	 
	 req.setAttribute("result", model);
	 
	 
	 req.getRequestDispatcher("vueCredit.jsp").forward(req,resp);
	 
	 
	 
	
	 
	}

}
