package state.web.servlet;

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

import state.domain.state;
import state.service.stateException;
import state.service.stateService;
import state.service.stateService;

/**
 * Servlet implementation class findAll
 */

public class stateServletFindAll extends HttpServlet {
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
	 stateService stateservice = new stateService();
 try {
  request.setAttribute("stateAllList", stateservice.findall());
 } catch (InstantiationException | IllegalAccessException
   | ClassNotFoundException e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
 } catch (stateException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 try {
  List<Object> li = stateservice.findall();
  for(int i = 0; i < li.size();i++){
   System.out.println(li.get(i).toString());
  }
  
 } catch (InstantiationException | IllegalAccessException
   | ClassNotFoundException e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
 } catch (stateException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
 
 request.getRequestDispatcher("/jsps/state/q1_alllist_state.jsp").forward(request, response);
 }

}