package vaccine.service;


import java.util.List;

import vaccine.dao.vaccineDao;
import vaccine.domain.vaccine;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class vaccineService {
	private vaccineDao vaccineDao = new vaccineDao();
	
	/**
	 * register a vaccine
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
//	public void create(vaccine form) throws vaccineException, ClassNotFoundException, InstantiationException, IllegalAccessException{
//		// check the primary key of vaccine
//		vaccine vaccine1 = vaccineDao.findByvaccine(form.getvaccine(), form.getVaccine_name());
//		if(vaccine1.getvaccine()!=null && vaccine1.getUsername().equals(form.getUsername())) throw new vaccineException("This user name has been registered!");
//		vaccineDao.add(form);
//	}
	
	public void insert(vaccine form) throws vaccineException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		vaccineDao.add(form);
	}
	
	public void delete(String vaccine_name) throws vaccineException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		vaccineDao.delete(vaccine_name);
	}
	
	public void update(vaccine form) throws vaccineException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		vaccineDao.update(form);
	}
	
	public List<Object> findByvaccine_name(String vaccine_name) throws vaccineException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		return vaccineDao.findByvaccine_name(vaccine_name);
	}
	
	public List<Object> findall() throws vaccineException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		return vaccineDao.findall();
	}
}
