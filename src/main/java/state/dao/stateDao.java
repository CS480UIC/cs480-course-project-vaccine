package state.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;
//import java.util.List;

import state.domain.state;

/**
 * DDL functions performed in database
 */
public class stateDao {
	
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
	
	public void add(state form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
			String sql = "insert into state values(?, ?, ?, ?, ?, ?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getState_id());
		    preparestatement.setString(2,form.getVaccine_name());
		    preparestatement.setInt(3,form.getCountry_id());
		    preparestatement.setString(4,form.getState_name());
		    preparestatement.setInt(5,form.getPopulation());
		    preparestatement.setFloat(6,form.getPercentage());
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
	public void update(state form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
			String sql = "UPDATE state SET country_id = ?, state_name = ?, population = ?, percentage = ? where state_id = ? and vaccine_name = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getCountry_id());
		    preparestatement.setString(2,form.getState_name());
		    preparestatement.setInt(3,form.getPopulation());
		    preparestatement.setFloat(4,form.getPercentage());
		    preparestatement.setInt(5,form.getState_id());
		    preparestatement.setString(6,form.getVaccine_name());
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
	public void delete(Integer state_id, String vaccine_name) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
			String sql = "delete from state where state_id = ? and vaccine_name = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1, state_id);
		    preparestatement.setString(2, vaccine_name);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public List<Object> findBystate_name(Integer state_id, String vaccine_name) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object>list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
		    String sql = "select * from state where state_id = ? and vaccine_name = ? ";
		    PreparedStatement preparestatement = connect.prepareStatement(sql);
		    preparestatement.setInt(1, state_id);
		    preparestatement.setString(2, vaccine_name);
		    ResultSet resultSet = preparestatement.executeQuery();
		    while(resultSet.next()){
		    
		    	state stateObj = new state();
		    	stateObj.setState_id(resultSet.getInt("State_id"));
		    	stateObj.setVaccine_name(resultSet.getString("vaccine_name"));
		    	stateObj.setCountry_id(resultSet.getInt("vaccine_name"));
		    	stateObj.setState_name(resultSet.getString("state_name"));
		   		stateObj.setPopulation(resultSet.getInt("population"));
		   		stateObj.setPercentage(resultSet.getFloat("Percentage"));
		   		list.add(stateObj);
		   		
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
			String sql = "select * from state";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				state stateObj = new state();
				stateObj.setVaccine_name(resultSet.getString("vaccine_name"));
				stateObj.setState_id(resultSet.getInt("state_id"));
		    	stateObj.setCountry_id(resultSet.getInt("country_id"));
		    	stateObj.setState_name(resultSet.getString("state_name"));
		   		stateObj.setPopulation(resultSet.getInt("population"));
		   		stateObj.setPercentage(resultSet.getFloat("Percentage"));
		   		list.add(stateObj);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
}
