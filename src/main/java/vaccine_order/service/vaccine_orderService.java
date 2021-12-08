package vaccine_order.service;


import java.util.List;

import vaccine_order.dao.vaccine_orderDao;
import vaccine_order.domain.vaccine_order;

/**
 * logic functions such as register, login
 * @author Amrit Raj Vardhan
 *
 */
public class vaccine_orderService {
	private vaccine_orderDao vaccine_orderDaoObj = new vaccine_orderDao();
	
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
	
	public void insert(vaccine_order form) throws vaccine_orderException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		vaccine_orderDaoObj.add(form);
	}
	
	public void delete(int order_id, String vaccine_name) throws vaccine_orderException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		vaccine_orderDaoObj.delete(order_id, vaccine_name);
	}
	
	public void update(vaccine_order form) throws vaccine_orderException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		vaccine_orderDaoObj.update(form);
	}
	
	public List<Object> findByvaccine_name(int order_id, String vaccine_name) throws vaccine_orderException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		return vaccine_orderDaoObj.findByvaccine_name(order_id, vaccine_name);
	}
	
	public List<Object> findall() throws vaccine_orderException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		return vaccine_orderDaoObj.findall();
	}
}
