package state.service;


import java.util.List;

import state.dao.stateDao;
import state.domain.state;

/**
 * logic functions such as register, login
 * @author Amrit Raj Vardhan
 *
 */
public class stateService {
	private stateDao stateDao = new stateDao();
	
	public void insert(state form) throws stateException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		stateDao.add(form);
	}
	
	public void delete(Integer state_id, String state_name) throws stateException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		stateDao.delete(state_id, state_name);
	}
	
	public void update(state form) throws stateException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		stateDao.update(form);
	}
	
	public List<Object> findBystate_name(Integer state_id, String vaccine_name) throws stateException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		return stateDao.findBystate_name(state_id, vaccine_name);
	}
	
	public List<Object> findall() throws stateException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		return stateDao.findall();
	}
}
