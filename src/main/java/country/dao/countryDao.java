package country.dao;

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

import country.domain.country;

/**
 * DDL functions performed in database
 */
public class countryDao {
	
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
	
	public void add(country form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
			String sql = "insert into country values(?,?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getCountry_id());
		    preparestatement.setString(2,form.getVaccine_name());
		    preparestatement.setString(3,form.getCountry_name());
		    preparestatement.setInt(4,form.getPopulation());
		    preparestatement.setInt(5,form.getCost());
		    preparestatement.setDouble(6,form.getPercentage_vaccinated());
		    preparestatement.executeUpdate();

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
	public void update(country form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
			String sql = "UPDATE country SET country_name = ?, population = ?, cost = ?, percentage_vaccinated = ?  where  country_id = ? and vaccine_name = ? ";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 

			preparestatement.setString(1,form.getCountry_name());
		    preparestatement.setInt(2,form.getPopulation());
		    preparestatement.setInt(3,form.getCost());
		    preparestatement.setDouble(4,form.getPercentage_vaccinated());
		    preparestatement.setInt(5,form.getCountry_id());
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
	public void delete(int country_id, String vaccine_name) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
			
			String sql = "delete from country where country_id=? and vaccine_name= ? ";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,country_id);
		    preparestatement.setString(2,vaccine_name);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Object> findbycountry_id(int country_id, String vaccine_name) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object>list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);
		    String sql = "select * from country where country_id=? and vaccine_name = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,country_id);
		    preparestatement.setString(2,vaccine_name);
		    ResultSet resultSet = preparestatement.executeQuery();
		    while(resultSet.next()){
		    	country country1 = new country();
		    	country1.setCountry_id(resultSet.getInt("country_id"));
		    	country1.setVaccine_name(resultSet.getString("vaccine_name"));
		    	country1.setPopulation(resultSet.getInt("population"));
		    	country1.setPopulation(resultSet.getInt("cost"));
		    	country1.setPercentage_vaccinated(resultSet.getDouble("percentage_vaccinated"));


		   		list.add(country1);
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
			String sql = "select * from country";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
		    while(resultSet.next()){
		    	country country1 = new country();
		    	country1.setCountry_id(resultSet.getInt("country_id"));
		    	country1.setVaccine_name(resultSet.getString("vaccine_name"));
		    	country1.setCountry_name(resultSet.getString("country_name"));
		    	country1.setPopulation(resultSet.getInt("population"));
		    	country1.setPopulation(resultSet.getInt("cost"));
		    	country1.setPercentage_vaccinated(resultSet.getDouble("percentage_vaccinated"));

		   		list.add(country1);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
}
