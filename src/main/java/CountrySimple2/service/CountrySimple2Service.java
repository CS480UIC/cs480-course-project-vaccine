package CountrySimple2.service;

import java.util.List;

import CountrySimple2.dao.CountrySimple2Dao;
import CountrySimple2.domain.CountrySimple2;

/**
 * logic functions such as register, login
 * @author yimai
 *
 */
public class CountrySimple2Service {
	private CountrySimple2Dao countrySimple2Dao = new CountrySimple2Dao();
	
	/**
	 * register a user
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */

	
	public List<Object> avgProtectionByType() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return countrySimple2Dao.avgProtectionByType();
		
	}
	
}
