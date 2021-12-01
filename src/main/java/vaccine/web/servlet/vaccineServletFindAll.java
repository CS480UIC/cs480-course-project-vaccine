package vaccine.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vaccine.dao.vaccineDao;
import vaccine.domain.vaccine;


/**
 * Servlet implementation class UserServlet
 */

public class vaccineServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public vaccineServletRead() {
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
		vaccine vaccine1 = null;
		vaccineDao vaccineDao1 = new vaccineDao();
		
		try {
			vaccine1 = vaccineDao1.findByvaccine(request.getParameter("vaccine_name"));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(vaccine.getUsername()!=null){
					System.out.println(vaccine);
					request.setAttribute("vaccine", vaccine);
					request.getRequestDispatcher("/jsps/vaccine/vaccine_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "Entity not found");
			request.getRequestDispatcher("/jsps/vaccine/vaccine_read_output.jsp").forward(request, response);
		}
	}
}



