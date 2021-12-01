package person.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import person.dao.personDao;
import person.domain.person;


/**
 * Servlet implementation class UserServlet
 */

public class personServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public personServletDelete() {
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
		String method = request.getParameter("method");
		personDao personDao = new personDao();
		person person = null;
		if(method.equals("search"))
		{
			try {
				person = personDao.findByperson_id(request.getParameter("username"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
			if(person.getUsername()!=null){
						System.out.println(person);
						request.setAttribute("person", person);
						request.getRequestDispatcher("/jsps/person/person_delete_output.jsp").forward(request, response);			
				}
				else{
				request.setAttribute("msg", "Entity not found");
				request.getRequestDispatcher("/jsps/person/person_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				personDao.delete(request.getParameter("username"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Entity Deleted");
			request.getRequestDispatcher("/jsps/person/person_read_output.jsp").forward(request, response);
		}
	}
}



