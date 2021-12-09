 package CountrySimple2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




import java.util.ArrayList;
import java.util.List;

import CountrySimple2.domain.CountrySimple2;


/**
 * DDL functions performed in database
 * @author yimai
 *
 */
public class CountrySimple2Dao {
	private String MySQL_user = "root"; //TODO change user
	

	
	private String MySQL_password = "111"; //TODO change password
/**
* get the search result with number
* @param peoplename
* @return
* @throws ClassNotFoundException
* @throws IllegalAccessException
* @throws InstantiationException
*/
	
public List<Object> avgProtectionByType() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	List<Object> list = new ArrayList<>();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vaccine", MySQL_user, MySQL_password);

		String sql = "Select country_id, country_name, Concat(country_id, ' ', country_name) id_country_name from country group by country_id";
		PreparedStatement preparestatement = connect.prepareStatement(sql);
		ResultSet resultSet = preparestatement.executeQuery();

		while(resultSet.next()){
			CountrySimple2 countrySimple2 = new CountrySimple2();
			countrySimple2.setCountry_id(resultSet.getInt("country_id"));
			countrySimple2.setCountry_name(resultSet.getString("country_name"));
			countrySimple2.setId_country_name(resultSet.getString("id_country_name"));
			list.add(countrySimple2);
		}

	} catch(SQLException e) {
		throw new RuntimeException(e);
	}
	return list;
}

}
