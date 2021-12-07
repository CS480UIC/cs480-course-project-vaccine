package zip_code.service;


import java.util.List;

import zip_code.dao.zip_codeDao;
import zip_code.domain.zip_code;

/**
 * logic functions such as register, login
 * @author Amrit Raj Vardhan
 *
 */
public class zip_codeService {
	private zip_codeDao zip_codeDao = new zip_codeDao();
	
	public void insert(zip_code form) throws zip_codeException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		zip_codeDao.add(form);
	}
	
	public void delete(Integer zip_code_id, String zip_code_name) throws zip_codeException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		zip_codeDao.delete(zip_code_id, zip_code_name);
	}
	
	public void update(zip_code form) throws zip_codeException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		zip_codeDao.update(form);
	}
	
	public List<Object> findByzip_code_name(Integer zip_code_id, String vaccine_name) throws zip_codeException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		return zip_codeDao.findByzip_code(zip_code_id, vaccine_name);
	}
	
	public List<Object> findall() throws zip_codeException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		return zip_codeDao.findall();
	}
}
