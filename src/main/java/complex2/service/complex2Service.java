package complex2.service;

import java.util.List;

import CountrySimple2.dao.CountrySimple2Dao;
import CountrySimple2.domain.CountrySimple2;
import complex1.dao.complex1Dao;
import complex2.dao.complex2Dao;

/**
 * logic functions such as register, login
 * @author yimai
 *
 */
public class complex2Service {
	private complex2Dao Complex2Dao = new complex2Dao();
	
	/**
	 * register a user
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */

	
	public List<Object> avgProtectionByType() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return Complex2Dao.avgProtectionByType();
		
	}
	
}
