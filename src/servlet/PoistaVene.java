package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;


@WebServlet("/PoistaVene")
public class PoistaVene extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PoistaVene() {
        super();
        System.out.println("PoistaVene.PoistaVene()");
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("PoistaVene.doGet()");
		String tunnus = request.getParameter("tunnus");
		Dao dao = new Dao();
		if(dao.poistaVene(tunnus)){
			response.sendRedirect("ListaaVeneet");
		}else{
			response.sendRedirect("index.jsp");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("PoistaVene.doPost()");
	}

}
