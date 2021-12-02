package country.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import country.domain.country;
import country.service.countryException;
import country.service.countryService;


/**
 * Servlet implementation class UserServlet
 */

public class countryServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public countryServletCreate() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		countryService countryservice = new countryService();
		Map<String,String[]> paramMap = request.getParameterMap();
		country form = new country();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		form.setCountry_id(Integer.parseInt(info.get(0)));
		form.setVaccine_name(info.get(1));	
		form.setCountry_name(info.get(2));	
		form.setPopulation(Integer.parseInt(info.get(3)));
		form.setCost(Integer.parseInt(info.get(4)));
		form.setPercentage_vaccinated(Double.parseDouble(info.get(5)));
		
		try {
			countryservice.insert(form);
			response.sendRedirect( request.getContextPath() + "/jsps/country/country.jsp");
			
		} catch (ClassNotFoundException | countryException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}
