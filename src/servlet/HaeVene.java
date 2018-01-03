package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Vene;
import dao.Dao;

@WebServlet("/HaeVene")
public class HaeVene extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HaeVene() {
        super();
        System.out.println("HaeVene.HaeVene()");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HaeVene.doGet()");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HaeVene.doPost()");
		String hakusana = request.getParameter("hakusana");
	
		Dao dao = new Dao();
		ArrayList<Vene> veneet = dao.listaaKaikki(hakusana);
		request.setAttribute("veneet", veneet);
		String jsp ="/haeveneet.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
	}

}



