 package complex2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




import java.util.ArrayList;
import java.util.List;

import CountrySimple2.domain.CountrySimple2;
import complex1.domain.complex1;
import complex2.domain.complex2;


/**
 * DDL functions performed in database
 * @author yimai
 *
 */
public class complex2Dao {
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
		String sql = "Select vaccine_name, vaccine_quantity from vaccine where temperature > (select avg(temperature) from vaccine);";
		PreparedStatement preparestatement = connect.prepareStatement(sql);
		ResultSet resultSet = preparestatement.executeQuery();

		while(resultSet.next()){
			complex2 Complex2 = new complex2();
			Complex2.setVaccine_name(resultSet.getString("vaccine_name"));
			Complex2.setTemperature(resultSet.getDouble("temperature"));
			Complex2.setVaccine_quantity(resultSet.getInt("vaccine_quantity"));
			Complex2.setCost(resultSet.getDouble("cost"));
			list.add(Complex2);
		}

	} catch(SQLException e) {
		throw new RuntimeException(e);
	}
	return list;
}

}
