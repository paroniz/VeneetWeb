package servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import model.Vene;

@WebServlet("/LisaaVene")
public class LisaaVene extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LisaaVene() {
        super();
        System.out.println("LisaaVene.LisaaVene()");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LisaaVene.doGet()");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LisaaVene.doPost()");
		
		String nimi = request.getParameter("nimi");
		String merkkimalli = request.getParameter("merkkimalli");
		String pituus = request.getParameter("pituus");
		String leveys = request.getParameter("leveys");
		String hinta = request.getParameter("hinta");
		Vene vene = new Vene(nimi, merkkimalli, pituus, leveys, hinta);
		Dao dao = new Dao();
		if(dao.lisaaVene(vene)){
			response.sendRedirect("lisaavene.jsp?ilmo=1");
		}else{
			response.sendRedirect("lisaavene.jsp?ilmo=0");
		}
	}

}


