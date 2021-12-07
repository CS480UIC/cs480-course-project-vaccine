package vaccine.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vaccine.domain.vaccine;
import vaccine.service.vaccineException;
import vaccine.service.vaccineService;


/**
 * Servlet implementation class UserServlet
 */

public class vaccineServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public vaccineServletCreate() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("test");
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("test2");
		vaccineService vaccineservice = new vaccineService();
		Map<String,String[]> paramMap = request.getParameterMap();
		vaccine form = new vaccine();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		form.setVaccine_name(info.get(0));
		form.setTemperature(Double.parseDouble(info.get(1)));	
		form.setVaccine_quantity(Integer.parseInt(info.get(2)));
		form.setCost(Double.parseDouble(info.get(3)));
		
		try {
			vaccineservice.insert(form);
			response.sendRedirect( request.getContextPath() + "/jsps/vaccine/vaccine.jsp");
			
		} catch (ClassNotFoundException | vaccineException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}
