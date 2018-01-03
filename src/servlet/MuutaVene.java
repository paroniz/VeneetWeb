package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Vene;
import dao.Dao;


@WebServlet("/MuutaVene")
public class MuutaVene extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MuutaVene() {
        super();
        System.out.println("MuutaVene.MuutaVene()");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MuutaVene.doGet()");
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MuutaVene.doPost()");
		String nimi = request.getParameter("nimi");
		String merkkimalli = request.getParameter("merkkimalli");
		String pituus = request.getParameter("pituus");
		String leveys = request.getParameter("leveys");
		String hinta = request.getParameter("hinta");
		String tunnus = request.getParameter("tunnus");
		Vene vene = new Vene(tunnus, nimi, merkkimalli, pituus, leveys, hinta);
		Dao dao = new Dao();
		dao.muutaVene(vene);
		response.sendRedirect("haeveneet.jsp");
	}

}
