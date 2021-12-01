package zip_code.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zip_code.domain.zip_code;
import zip_code.service.zip_codeException;
import zip_code.service.zip_codeService;


/**
 * Servlet implementation class UserServlet
 */

public class zip_codeServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public zip_codeServletCreate() {
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
		zip_codeService zip_codeservice = new zip_codeService();
		Map<String,String[]> paramMap = request.getParameterMap();
		zip_code form = new zip_code();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		form.setZip_code(Integer.parseInt(info.get(0)));
		form.setVaccine_name(info.get(1));
		form.setState_id(Integer.parseInt(info.get(2)));	
		form.setPercentage(Double.parseDouble(info.get(3)));
		form.setNum_vaccination_center(Integer.parseInt(info.get(4)));
		
		try {
			zip_codeservice.insert(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | zip_codeException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}
