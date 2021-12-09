package complex1.service;

import java.util.List;

import CountrySimple2.dao.CountrySimple2Dao;
import CountrySimple2.domain.CountrySimple2;
import complex1.dao.complex1Dao;

/**
 * logic functions such as register, login
 * @author yimai
 *
 */
public class complex1Service {
	private complex1Dao Complex1Dao = new complex1Dao();
	
	/**
	 * register a user
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */

	
	public List<Object> avgProtectionByType() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return Complex1Dao.avgProtectionByType();
		
	}
	
}
