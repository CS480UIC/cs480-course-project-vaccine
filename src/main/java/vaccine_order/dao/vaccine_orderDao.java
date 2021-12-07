package vaccine_order.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import user.domain.User;
import vaccine_order.domain.vaccine_order;

//import java.util.ArrayList;
//import java.util.List;


/**
 * DDL functions performed in database
 */
public class vaccine_orderDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "root"; //TODO change user
	

	
	private String MySQL_password = "111"; //TODO change password

//	public vaccine findByvaccine(String vaccine_name) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		vaccine vaccine1 = new vaccine();
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
//		    String sql = "select * from vaccine where vaccine_name = ?";
//		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
//		    preparestatement.setString(1,vaccine_name);
//		    ResultSet resultSet = preparestatement.executeQuery();
//
//		    while(resultSet.next()){
//		    	String vaccine2 = resultSet.getString("vaccine_name");
//		    	if(vaccine2.equals(vaccine1)){
//		    		vaccine1.setVaccine_name(resultSet.getString("vaccine_name"));
//		    		vaccine1.setTemperature(resultSet.getDouble("temperature"));
//		    		vaccine1.setVaccine_quantity(resultSet.getInt("vaccine_quantity"));
//		    		vaccine1.setCost(resultSet.getDouble("cost"));
//		    	}
//		    }
//		    connect.close();
//		} catch(SQLException e) {
//			throw new RuntimeException(e);
//		}
//		return vaccine1;
//	}	
	
	/**
	 * insert vaccine
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(vaccine_order form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
			String sql = "insert into vaccine_order values(?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getOrder_id());
		    preparestatement.setString(2,form.getVaccine_name());
		    preparestatement.setInt(3,form.getCountry_id());
		    preparestatement.setInt(4,form.getQuantity());
		    preparestatement.setString(5,form.getOrder_date());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param form
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void update(vaccine_order form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
			String sql = "UPDATE vaccine_order SET country_id = ?, quantity = ?, order_date = ?  where  order_id = ? and vaccine_name = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			
			preparestatement.setInt(1,form.getCountry_id());
		    preparestatement.setInt(2,form.getQuantity());
		    preparestatement.setString(3,form.getOrder_date());
		    preparestatement.setInt(4,form.getOrder_id());
		    preparestatement.setString(5,form.getVaccine_name());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param username
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void delete(int order_id, String vaccine_name ) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
			String sql = "delete from vaccine_order where order_id = ? and vaccine_name = ? ";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setInt(1, order_id);
			preparestatement.setString(2, vaccine_name);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Object> findByvaccine_name(int order_id, String vaccine_name ) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object>list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
		    String sql = "select * from vaccine_order where order_id = ? and vaccine_name = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1, order_id);
		    preparestatement.setString(2, vaccine_name);
		    ResultSet resultSet = preparestatement.executeQuery();
		    while(resultSet.next()){
		    	vaccine_order vaccine1 = new vaccine_order();
		    	vaccine1.setVaccine_name(resultSet.getString("vaccine_name"));
		    	vaccine1.setOrder_id(resultSet.getInt("order_id"));
		   		vaccine1.setCountry_id(resultSet.getInt("country_id"));
		   		vaccine1.setQuantity(resultSet.getInt("quantity"));
		   		vaccine1.setOrder_date(resultSet.getString("order_date"));

		   		list.add(vaccine1);
		    }

		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}	
	
	public List<Object> findall() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			String sql = "select * from vaccine_order";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				vaccine_order vaccine1 = new vaccine_order();
				vaccine1.setVaccine_name(resultSet.getString("vaccine_name"));
		    	vaccine1.setOrder_id(resultSet.getInt("order_id"));
		   		vaccine1.setCountry_id(resultSet.getInt("country_id"));
		   		vaccine1.setQuantity(resultSet.getInt("quantity"));
		   		vaccine1.setOrder_date(resultSet.getString("order_date"));
	    		list.add(vaccine1);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
}
