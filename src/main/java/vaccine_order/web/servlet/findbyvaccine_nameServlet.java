package vaccine_order.web.servlet;

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

import vaccine_order.dao.vaccine_orderDao;
import vaccine_order.domain.vaccine_order;
import vaccine_order.service.vaccine_orderException;
import vaccine_order.service.vaccine_orderService;
/**
 * Servlet implementation class UserServlet
 */

public class findbyvaccine_nameServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public findbyvaccine_nameServlet() {
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

  vaccine_orderService vaccine_orderservice = new vaccine_orderService();
  Map<String,String[]> paramMap = request.getParameterMap();
  List<String> info = new ArrayList<String>();
  
  for(String name : paramMap.keySet()) {
   
   String[] values = paramMap.get(name);
   info.add(values[0]);
   System.out.println(name + ": " + Arrays.toString(values));
  }
  try {
   request.setAttribute("vaccineList", vaccine_orderservice.findByvaccine_name(Integer.parseInt(info.get(1)), info.get(2)));
   
  } catch (ClassNotFoundException e) {
   // TODO Auto-generated catch block
   request.setAttribute("msg", e.getMessage());
  } catch (InstantiationException e) {
   // TODO Auto-generated catch block
   request.setAttribute("msg", e.getMessage());
  } catch (IllegalAccessException e) {
   // TODO Auto-generated catch block
   request.setAttribute("msg", e.getMessage());
  } catch (vaccine_orderException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
  
  
  try {
   List<Object> li = vaccine_orderservice.findByvaccine_name(Integer.parseInt(info.get(1)), info.get(2));
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
  
  
  request.getRequestDispatcher("/jsps/vaccine_order/q1_list_vaccine_order.jsp").forward(request, response);

 
 }

}