package zip_code.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import zip_code.domain.zip_code;

/**
 * DDL functions performed in database
 */
public class zip_codeDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "root"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "111"; //TODO change password

	public zip_code findByzip_code(int zip_code, String vaccine_name) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		zip_code zip_code1 = new zip_code();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
		    String sql = "select * from zip_code where zip_code=? and vaccine_name = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,zip_code);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	String zip_code2 = resultSet.getString("zip_code");
		    	if(zip_code2.equals(zip_code1)){
		    		zip_code1.setZip_code(resultSet.getInt("zip_code"));
		    		zip_code1.setVaccine_name(resultSet.getString("vaccine_name"));
		    		zip_code1.setState_id(resultSet.getInt("state_id"));
		    		zip_code1.setPercentage(resultSet.getDouble("percentage"));
		    		zip_code1.setNum_vaccination_center(resultSet.getInt("num_vaccination_center"));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return zip_code1;
	}	
	
	/**
	 * insert zip_code
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(zip_code form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
			String sql = "insert into zip_code values(?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getZip_code());
		    preparestatement.setString(2,form.getVaccine_name());
		    preparestatement.setInt(3,form.getState_id());
		    preparestatement.setDouble(4,form.getPercentage());
		    preparestatement.setInt(5,form.getNum_vaccination_center());
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
	public void update(zip_code form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			String sql = "UPDATE zip_code SET zip_code = ?, vaccine_name = ? where state_id = ? percentage = ? num_vaccination_center = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getZip_code());
		    preparestatement.setString(2,form.getVaccine_name());
		    preparestatement.setInt(3,form.getState_id());
		    preparestatement.setDouble(4,form.getPercentage());
		    preparestatement.setInt(5,form.getNum_vaccination_center());
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
	public void delete(int zip_code, String vaccine_name) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			String sql = "delete from zip_code where zip_code = ? and vaccine_name= ? ";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,zip_code);
		    preparestatement.setString(2,vaccine_name);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
