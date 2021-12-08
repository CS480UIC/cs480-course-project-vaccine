package vaccine_order.web.servlet;

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

import vaccine_order.domain.vaccine_order;
import vaccine_order.service.vaccine_orderException;
import vaccine_order.service.vaccine_orderService;
import vaccine_order.service.vaccine_orderService;

/**
 * Servlet implementation class findAll
 */

public class vaccine_orderServletFindAll extends HttpServlet {
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
	 vaccine_orderService vaccine_orderservice = new vaccine_orderService();
 try {
  request.setAttribute("vaccine_orderAllList", vaccine_orderservice.findall());
 } catch (InstantiationException | IllegalAccessException
   | ClassNotFoundException e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
 } catch (vaccine_orderException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 try {
  List<Object> li = vaccine_orderservice.findall();
  for(int i = 0; i < li.size();i++){
   System.out.println(li.get(i).toString());
  }
  
 } catch (InstantiationException | IllegalAccessException
   | ClassNotFoundException e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
 } catch (vaccine_orderException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
 
 request.getRequestDispatcher("/jsps/vaccine_order/q1_alllist_vaccine_order.jsp").forward(request, response);
 }

}