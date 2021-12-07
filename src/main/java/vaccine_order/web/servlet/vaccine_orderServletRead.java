package vaccine_order.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vaccine_order.dao.vaccine_orderDao;
import vaccine_order.domain.vaccine_order;


/**
 * Servlet implementation class UserServlet
 */

public class vaccine_orderServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public vaccine_orderServletRead() {
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
		vaccine_order vaccine = null;
		vaccine_orderDao vaccineDao = new vaccine_orderDao();
		
		try {
			vaccine = vaccineDao.findByvaccine_name(request.getParameter("username"));
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



