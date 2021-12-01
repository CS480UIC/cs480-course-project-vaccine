package person.domain;

/**
 * User object
 * 
 * @author Aayush Makharia
 * 
 */
public class person {
	/*
	 * Correspond to the user table
	 */
	
	private String person_id;
	private String vaccine_name; 
	private Integer zip_code; 
	private String email;
	private Boolean vaccine_recieved; 
	private String person_name; 
	private Integer person_age;
	/**
	 * @return the person_id
	 */
	public String getPerson_id() {
		return person_id;
	}
	/**
	 * @param person_id the person_id to set
	 */
	public void setPerson_id(String person_id) {
		this.person_id = person_id;
	}
	/**
	 * @return the vaccine_name
	 */
	public String getVaccine_name() {
		return vaccine_name;
	}
	/**
	 * @param vaccine_name the vaccine_name to set
	 */
	public void setVaccine_name(String vaccine_name) {
		this.vaccine_name = vaccine_name;
	}
	/**
	 * @return the zip_code
	 */
	public Integer getZip_code() {
		return zip_code;
	}
	/**
	 * @param zip_code the zip_code to set
	 */
	public void setZip_code(Integer zip_code) {
		this.zip_code = zip_code;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the vaccine_recieved
	 */
	public Boolean getVaccine_recieved() {
		return vaccine_recieved;
	}
	/**
	 * @param vaccine_recieved the vaccine_recieved to set
	 */
	public void setVaccine_recieved(Boolean vaccine_recieved) {
		this.vaccine_recieved = vaccine_recieved;
	}
	/**
	 * @return the person_name
	 */
	public String getPerson_name() {
		return person_name;
	}
	/**
	 * @param person_name the person_name to set
	 */
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	/**
	 * @return the person_age
	 */
	public Integer getPerson_age() {
		return person_age;
	}
	/**
	 * @param person_age the person_age to set
	 */
	public void setPerson_age(Integer person_age) {
		this.person_age = person_age;
	} 
	
	
}
