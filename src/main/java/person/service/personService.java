package person.service;


import person.dao.personDao;
import person.domain.person;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class personService {
	private personDao personDao = new personDao();
	
	/**
	 * register a person
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(person form) throws personException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of person
		person person = personDao.findByperson_id(form.getUsername());
		if(person.getUsername()!=null && person.getUsername().equals(form.getUsername())) throw new personException("This user name has been registered!");
		personDao.add(form);
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
	public void login(person form) throws personException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		person user = personDao.findByperson_id(form.getUsername());
		if(user.getUsername()==null) throw new personException("The user is not in the database");
		
		String password = user.getPassword();
		
		if(password!=null && !password.equals(form.getPassword()))
			throw new personException(" The password is not right");
		
	}
}
