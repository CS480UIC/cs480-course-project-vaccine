package vaccine.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vaccine.domain.vaccine;
import vaccine.service.vaccineException;
import vaccine.service.vaccineService;
import vaccine.service.vaccineService;

/**
 * Servlet implementation class findAll
 */

public class vaccineServletFindAll extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  doPost(request,response);
 }

 /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 // TODO Auto-generated method stub
	 vaccineService vaccineservice = new vaccineService();
 try {
  request.setAttribute("vaccineAllList", vaccineservice.findall());
 } catch (InstantiationException | IllegalAccessException
   | ClassNotFoundException e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
 } catch (vaccineException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 try {
  List<Object> li = vaccineservice.findall();
  for(int i = 0; i < li.size();i++){
   System.out.println(li.get(i).toString());
  }
  
 } catch (InstantiationException | IllegalAccessException
   | ClassNotFoundException e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
 } catch (vaccineException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
 
 request.getRequestDispatcher("/jsps/vaccine/q1_alllist_vaccine.jsp").forward(request, response);
 }

}