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

@WebServlet("/ListaaVeneet")
public class ListaaVeneet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListaaVeneet() {
        super();
        System.out.println("ListaVeneet.ListaaVeneet()");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Tässä doGetissä servlet hakee daon listaakaikki-metodin kautta ArrayListin tietokannan tiedoista*/
		System.out.println("ListaaVeneet.doGet()");
		Dao dao = new Dao();
		ArrayList<Vene> veneet = dao.listaaKaikki();
		/* dao.ListaaKaikki() palauttaa ArrayListin, jossa on tietueet olioina */
		request.setAttribute("veneet", veneet);
		String jsp ="/listaaveneet.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
		/* listaaveneet.jsp laukaistaan ja sille toimitetaan "veneet"-attribuutti */
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ListaaVeneet.doPost()");
		Dao dao = new Dao();
		ArrayList<Vene> veneet = dao.listaaKaikki();
		request.setAttribute("veneet", veneet);
		String jsp ="/listaaveneet.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
	}

}