package zip_code.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

//	public state findByperson_id(String username) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		state state = new state();
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
//		    String sql = "select * from state where username=?";
//		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
//		    preparestatement.setString(1,username);
//		    ResultSet resultSet = preparestatement.executeQuery();
//		    state_id smallint not null,
//	        vaccine_name varchar(50) ,
//	        country_id smallint ,
//	        state_name varchar(50),
//	        population bigint not null, 
//	        percentage float4,
//		    while(resultSet.next()){
//		    	String user_name = resultSet.getString("username");
//		    	if(user_name.equals(username)){
//		    		state.setState_id(resultSet.getString("username"));
//		    		state.setPassword(resultSet.getString("password"));
//		    		state.setEmail(resultSet.getString("email"));		
//		    	}
//		    }
//		    connect.close();
//		} catch(SQLException e) {
//			throw new RuntimeException(e);
//		}
//		return state;
//	}	
	
	/**
	 * insert state
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(zip_code form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
			String sql = "insert into zip_code values(?, ?, ?, ?, ?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getZip_code());
		    preparestatement.setString(2,form.getVaccine_name());
		    preparestatement.setInt(3,form.getState_id());
		    preparestatement.setFloat(4,form.getPercentage());
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
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
			String sql = "UPDATE zip_code SET state_id = ?, percentage = ?, num_vaccination_center = ?, percentage = ? where state_id = ? and vaccine_name = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setInt(1,form.getZip_code());
		    preparestatement.setString(2,form.getVaccine_name());
		    preparestatement.setInt(3,form.getState_id());
		    preparestatement.setFloat(4,form.getPercentage());
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
	public void delete(Integer zip_code, String vaccine_name) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
			String sql = "delete from zip_code where zip_code = ? and vaccine_name = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1, zip_code);
		    preparestatement.setString(2, vaccine_name);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public List<Object> findByzip_code(Integer zip_code, String vaccine_name) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object>list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
		    String sql = "select * from zip_code where zip_code = ? and vaccine_name = ? ";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1, zip_code);
		    preparestatement.setString(2, vaccine_name);
		    ResultSet resultSet = preparestatement.executeQuery();
		    while(resultSet.next()){
		    	zip_code zip_codeObj = new zip_code();
		    	zip_codeObj.setState_id(resultSet.getInt("State_id"));
		    	zip_codeObj.setVaccine_name(resultSet.getString("vaccine_name"));
		    	zip_codeObj.setState_id(resultSet.getInt("vaccine_name"));
		    	zip_codeObj.setPercentage(resultSet.getFloat("state_name"));
		   		zip_codeObj.setNum_vaccination_center(resultSet.getInt("population"));
		   		list.add(zip_codeObj);
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
			String sql = "select * from zip_code";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				zip_code zip_codeObj = new zip_code();
				zip_codeObj.setState_id(resultSet.getInt("State_id"));
		    	zip_codeObj.setVaccine_name(resultSet.getString("vaccine_name"));
		    	zip_codeObj.setState_id(resultSet.getInt("vaccine_name"));
		    	zip_codeObj.setPercentage(resultSet.getFloat("state_name"));
		   		zip_codeObj.setNum_vaccination_center(resultSet.getInt("population"));
		   		list.add(zip_codeObj);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
}
