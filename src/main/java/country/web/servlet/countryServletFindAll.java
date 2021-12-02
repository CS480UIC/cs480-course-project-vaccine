package country.web.servlet;

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

import country.domain.country;
import country.service.countryException;
import country.service.countryService;
import country.service.countryService;

/**
 * Servlet implementation class findAll
 */

public class countryServletFindAll extends HttpServlet {
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
	 countryService countryservice = new countryService();
 try {
  request.setAttribute("countryAllList", countryservice.findall());
 } catch (InstantiationException | IllegalAccessException
   | ClassNotFoundException e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
 } catch (countryException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 try {
  List<Object> li = countryservice.findall();
  for(int i = 0; i < li.size();i++){
   System.out.println(li.get(i).toString());
  }
  
 } catch (InstantiationException | IllegalAccessException
   | ClassNotFoundException e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
 } catch (countryException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
 
 request.getRequestDispatcher("/jsps/country/q1_alllist_country.jsp").forward(request, response);
 }

}