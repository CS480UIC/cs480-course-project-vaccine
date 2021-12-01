package vaccine.web.servlet;

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

import vaccine.dao.vaccineDao;
import vaccine.domain.vaccine;
import vaccine.service.vaccineException;
import vaccine.service.vaccineService;

/**
 * Servlet implementation class UserServlet
 */

public class vaccineServletUpdate extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public vaccineServletUpdate() {
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
  vaccineService vaccineservice = new vaccineService();
  Map<String,String[]> paramMap = request.getParameterMap();
  vaccine form = new vaccine();
  List<String> info = new ArrayList<String>();
  
  for(String name : paramMap.keySet()) {
   
   String[] values = paramMap.get(name);
   info.add(values[0]);
   System.out.println(name + ": " + Arrays.toString(values));
  }
  //form.setNumber(Integer.parseInt(info.get(1)));
	form.setVaccine_name(info.get(1));
	form.setTemperature(Double.parseDouble(info.get(2)));	
	form.setVaccine_quantity(Integer.parseInt(info.get(3)));
	form.setCost(Double.parseDouble(info.get(4)));
  
  
  try {
   vaccineservice.update(form);
   
   response.sendRedirect( request.getContextPath() + "/jsps/vaccine/vaccine.jsp");
  } catch (ClassNotFoundException | vaccineException e) {
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