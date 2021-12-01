package vaccine.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import user.domain.User;
import vaccine.domain.vaccine;

//import java.util.ArrayList;
//import java.util.List;

import vaccine.domain.vaccine;

/**
 * DDL functions performed in database
 */
public class vaccineDao {
	
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
	
	public void add(vaccine form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
			String sql = "insert into vaccine values(?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getVaccine_name());
		    preparestatement.setDouble(2,form.getTemperature());
		    preparestatement.setInt(3,form.getVaccine_quantity());
		    preparestatement.setDouble(4,form.getCost());
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
	public void update(vaccine form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
			String sql = "UPDATE vaccine SET temperature = ?, vaccine_quantity = ?, cost = ?  where  vaccine_name = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			
		    preparestatement.setDouble(1,form.getTemperature());
		    preparestatement.setInt(2,form.getVaccine_quantity());
		    preparestatement.setDouble(3,form.getCost());
		    preparestatement.setString(4,form.getVaccine_name());
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
	public void delete(String vaccine_name) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
			String sql = "delete from vaccine where vaccine_name= ? ";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,vaccine_name);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Object> findByvaccine_name(String vaccine_name) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object>list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
		    String sql = "select * from vaccine where vaccine_name = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,vaccine_name);
		    ResultSet resultSet = preparestatement.executeQuery();
		    while(resultSet.next()){
		    	vaccine vaccine1 = new vaccine();
		    	vaccine1.setVaccine_name(resultSet.getString("vaccine_name"));
		    	vaccine1.setTemperature(resultSet.getDouble("temperature"));
		   		vaccine1.setVaccine_quantity(resultSet.getInt("vaccine_quantity"));
		   		vaccine1.setCost(resultSet.getDouble("cost"));

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
			String sql = "select * from vaccine";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				vaccine vaccine1 = new vaccine();
				vaccine1.setVaccine_name(resultSet.getString("vaccine_name"));
				vaccine1.setTemperature(resultSet.getDouble("temperature"));
				vaccine1.setVaccine_quantity(resultSet.getInt("vaccine_quantity"));
				vaccine1.setCost(resultSet.getDouble("cost"));
	    		list.add(vaccine1);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
}
