package state.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import state.dao.stateDao;
import state.domain.state;
import state.service.stateException;
import state.service.stateService;

/**
 * Servlet implementation class UserServlet
 */

public class stateServletUpdate extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public stateServletUpdate() {
        super();
        // TODO Auto-generated constructor stub
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
  //Map<String, String> form = new HashMap<String,String>();
  stateService stateservice = new stateService();
  Map<String,String[]> paramMap = request.getParameterMap();
  state form = new state();
  List<String> info = new ArrayList<String>();
  
  for(String name : paramMap.keySet()) {
   
   String[] values = paramMap.get(name);
   info.add(values[0]);
   System.out.println(name + ": " + Arrays.toString(values));
  }
  //form.setNumber(Integer.parseInt(info.get(1)));
	form.setState_id(Integer.parseInt(info.get(1)));
	form.setVaccine_name(info.get(2));	
	form.setCountry_id(Integer.parseInt(info.get(3)));
	form.setState_name(info.get(4));
	form.setPopulation(Integer.parseInt(info.get(5)));
	form.setPercentage(Float.parseFloat(info.get(6)));
  
  
  try {
   stateservice.update(form);
   
   response.sendRedirect( request.getContextPath() + "/stateServletFindAll");
  } catch (ClassNotFoundException | stateException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (InstantiationException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IllegalAccessException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } 
  
 }

}