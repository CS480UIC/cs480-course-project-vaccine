package vaccine_order.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vaccine_order.domain.vaccine_order;
import vaccine_order.service.vaccine_orderException;
import vaccine_order.service.vaccine_orderService;


/**
 * Servlet implementation class UserServlet
 */

public class vaccine_orderServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public vaccine_orderServletCreate() {
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
		vaccine_orderService vaccine_orderservice = new vaccine_orderService();
		Map<String,String[]> paramMap = request.getParameterMap();
		vaccine_order form = new vaccine_order();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		form.setOrder_id(Integer.parseInt(info.get(0)));
		form.setVaccine_name(info.get(1));	
		form.setCountry_id(Integer.parseInt(info.get(2)));
		form.setQuantity(Integer.parseInt(info.get(3)));
		form.setOrder_date(info.get(4));
		try {
			vaccine_orderservice.insert(form);
			response.sendRedirect( request.getContextPath() + "/jsps/vaccine_order/vaccine_order.jsp");
			
		} catch (ClassNotFoundException | vaccine_orderException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}
