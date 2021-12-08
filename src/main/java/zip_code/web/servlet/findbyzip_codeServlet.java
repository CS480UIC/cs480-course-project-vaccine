package zip_code.web.servlet;

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

import zip_code.dao.zip_codeDao;
import zip_code.domain.zip_code;
import zip_code.service.zip_codeException;
import zip_code.service.zip_codeService;

/**
 * Servlet implementation class UserServlet
 */

public class findbyzip_codeServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public findbyzip_codeServlet() {
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

  zip_codeService zip_codeservice = new zip_codeService();
  Map<String,String[]> paramMap = request.getParameterMap();
  List<String> info = new ArrayList<String>();
  
  for(String name : paramMap.keySet()) {
   
   String[] values = paramMap.get(name);
   info.add(values[0]);
   System.out.println(name + ": " + Arrays.toString(values));
  }
  try {
   request.setAttribute("zip_codeList", zip_codeservice.findByzip_code_name(Integer.parseInt(info.get(1)),info.get(2)));
   
  } catch (ClassNotFoundException e) {
   // TODO Auto-generated catch block
   request.setAttribute("msg", e.getMessage());
  } catch (InstantiationException e) {
   // TODO Auto-generated catch block
   request.setAttribute("msg", e.getMessage());
  } catch (IllegalAccessException e) {
   // TODO Auto-generated catch block
   request.setAttribute("msg", e.getMessage());
  } catch (zip_codeException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
  
  
  try {
   List<Object> li = zip_codeservice.findByzip_code_name(Integer.parseInt(info.get(1)),info.get(2));
   for(int i = 0; i < li.size();i++){
    System.out.println(li.get(i).toString());
   }
   
  } catch (InstantiationException | IllegalAccessException
    | ClassNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (zip_codeException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
  
  request.getRequestDispatcher("/jsps/zip_code/q1_list_zip_code.jsp").forward(request, response);

 
 }

}