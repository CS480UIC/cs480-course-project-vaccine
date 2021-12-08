package country.service;


import java.util.List;

import country.dao.countryDao;
import country.domain.country;

/**
 * logic functions such as register, login
 * @author yimai
 *
 */
public class countryService {
	private countryDao countryDao = new countryDao();
	
	/**
	 * register a country
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
//	public void create(country form) throws countryException, ClassNotFoundException, InstantiationException, IllegalAccessException{
//		// check the primary key of country
//		country country1 = countryDao.findBycountry(form.getcountry(), form.getcountry_name());
//		if(country1.getcountry()!=null && country1.getUsername().equals(form.getUsername())) throw new countryException("This user name has been registered!");
//		countryDao.add(form);
//	}
	
	public void insert(country form) throws countryException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		countryDao.add(form);
	}
	
	public void delete(int country_id,String country_name) throws countryException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		countryDao.delete(country_id, country_name);
	}
	
	public void update(country form) throws countryException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		countryDao.update(form);
	}
	
	public List<Object> findbycountry_id(int country_id,String country_name) throws countryException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		return countryDao.findbycountry_id(country_id, country_name);
	}
	
	public List<Object> findall() throws countryException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		return countryDao.findall();
	}
}
