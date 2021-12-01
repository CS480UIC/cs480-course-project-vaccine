package person.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import person.domain.person;

/**
 * DDL functions performed in database
 */
public class personDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "root"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "111"; //TODO change password

	public person findByperson_id(String person_id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		person person = new person();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
		    String sql = "select * from person where person_id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,person_id1);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	String person_id = resultSet.getString("person_id");
		    	if(person_id.equals(person_id1)){
		    		person.person_id(resultSet.getString("username"));
		    		person.vaccine_name(resultSet.getString("password"));
		    		person.setEmail(resultSet.getString("email"));		 
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return person;
	}	
	
	/**
	 * insert person
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(person form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			String sql = "insert into person values(person_id,vaccine_name,person_zip_code,vaccine_recieved,person_name,person_age)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getperson_id());
		    preparestatement.setString(2,form.getvaccine_name());
		    preparestatement.setString(3,form.getperson_zip_code());
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
	public void update(person form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			String sql = "UPDATE person SET person_id = ?, email = ? where username = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getperson_id());
			preparestatement.setString(2,form.getvaccine_name());
		    preparestatement.setString(3,form.getperson_zip_code());
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
	public void delete(String username) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			String sql = "delete from person where username = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,username);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
