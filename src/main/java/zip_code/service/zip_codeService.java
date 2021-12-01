package zip_code.service;


import zip_code.dao.zip_codeDao;
import zip_code.domain.zip_code;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class zip_codeService {
	private zip_codeDao zip_codeDao = new zip_codeDao();
	
	/**
	 * register a zip_code
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
//	public void create(zip_code form) throws zip_codeException, ClassNotFoundException, InstantiationException, IllegalAccessException{
//		// check the primary key of zip_code
//		zip_code zip_code1 = zip_codeDao.findByzip_code(form.getZip_code(), form.getVaccine_name());
//		if(zip_code1.getZip_code()!=null && zip_code1.getUsername().equals(form.getUsername())) throw new zip_codeException("This user name has been registered!");
//		zip_codeDao.add(form);
//	}
	
	public void insert(zip_code form) throws zip_codeException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		zip_codeDao.add(form);
	}
	
	public void delete(int zip_code, String vaccine_name) throws zip_codeException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		zip_codeDao.delete(zip_code, vaccine_name);
	}
	
	public void update(zip_code form) throws zip_codeException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		zip_codeDao.add(form);
	}
	
	public void read(int zip_code, String vaccine_name) throws zip_codeException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		zip_codeDao.findByzip_code(zip_code, vaccine_name);
	}
	
	/**
	 * Login function
	 * @param form
	 * @return
	 * @throws UserException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */

}
