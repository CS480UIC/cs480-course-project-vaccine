package state.web.servlet;

import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import state.domain.state;
import state.service.stateException;
import state.service.stateService;


/**
 * Servlet implementation class UserServlet
 */

public class stateServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public stateServletCreate() {
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
		stateService stateservice = new stateService();
		Map<String,String[]> paramMap = request.getParameterMap();
		state form = new state();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		form.setState_id(Integer.parseInt(info.get(0)));
		form.setVaccine_name(info.get(1));
		form.setCountry_id(Integer.parseInt(info.get(2)));
		form.setState_name(info.get(3));
		form.setPopulation(Integer.parseInt(info.get(4)));
		form.setPercentage(Float.parseFloat(info.get(5)));
		try {
			stateservice.insert(form);
			response.sendRedirect( request.getContextPath() + "/jsps/state/state.jsp");
			
		} catch (ClassNotFoundException | stateException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}
