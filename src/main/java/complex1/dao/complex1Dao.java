 package complex1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




import java.util.ArrayList;
import java.util.List;

import CountrySimple2.domain.CountrySimple2;
import complex1.domain.complex1;


/**
 * DDL functions performed in database
 * @author yimai
 *
 */
public class complex1Dao {
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

		String sql = "select * \n"
				+ "from vaccine\n"
				+ "where cost < (select avg(cost) from vaccine)\n"
				+ "order by cost;";
		PreparedStatement preparestatement = connect.prepareStatement(sql);
		ResultSet resultSet = preparestatement.executeQuery();

		while(resultSet.next()){
			complex1 Complex1 = new complex1();
			Complex1.setVaccine_name(resultSet.getString("vaccine_name"));
			Complex1.setTemperature(resultSet.getDouble("temperature"));
			Complex1.setVaccine_quantity(resultSet.getInt("vaccine_quantity"));
			Complex1.setCost(resultSet.getDouble("cost"));
			list.add(Complex1);
		}

	} catch(SQLException e) {
		throw new RuntimeException(e);
	}
	return list;
}

}
