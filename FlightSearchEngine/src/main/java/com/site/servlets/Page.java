package com.site.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.site.beans.Flight;
//import com.site.volexampl.Filters;
//import com.site.volexampl.VolsExmpl;
import com.site.dao.*;
import com.site.dao.DaoException;
import com.site.flight_filters.FlightFilter;

/**
 * Servlet implementation class Page
 */
public class Page extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Page() {
        super();
        // TODO Auto-generated constructor stub
    }
    private FlightDao flightDao;
    private List<Flight> flights;

    public void init() throws ServletException {
        DaoFactory daoFactory = DaoFactory.getInstance();
        this.flightDao = daoFactory.getFlightDao();
    }
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("vDepCourant", "All");
		request.setAttribute("vArrCourant", "All");
		//List<Flight> flights;
		try {
			flights = flightDao.lister();
			request.setAttribute("vols", flightDao.lister());
			request.setAttribute("villes", flightDao.getVilles(flights));
		} catch (DaoException e) {
			 request.setAttribute("erreur", e.getMessage());
		}
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/page.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("vDepCourant", request.getParameter("vDep"));
		request.setAttribute("vArrCourant", request.getParameter("vArr"));
		request.setAttribute("villes", flightDao.getVilles(flights));
		
		List<Flight> flightsFilter = new FlightFilter().listVolsFilter(request, flights);
		request.setAttribute("vols", flightsFilter);
		
		
        this.getServletContext().getRequestDispatcher("/WEB-INF/page.jsp").forward(request, response);

	}

}
