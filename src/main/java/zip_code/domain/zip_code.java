package zip_code.domain;

/**
 * User object
 * 
 * @author Amrit Raj Vardhan
 * 
 */
public class zip_code {
	/*
	 * Correspond to the user table
	 */
	
	private Integer zip_code;
	private String vaccine_name; 
	private Integer state_id;
	private Float percentage;
	private Integer num_vaccination_center;
	
	
	

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
	 * @return the state_id
	 */
	public Integer getState_id() {
		return state_id;
	}




	/**
	 * @param state_id the state_id to set
	 */
	public void setState_id(Integer state_id) {
		this.state_id = state_id;
	}




	/**
	 * @return the percentage
	 */
	public Float getPercentage() {
		return percentage;
	}




	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}




	/**
	 * @return the num_vaccination_center
	 */
	public Integer getNum_vaccination_center() {
		return num_vaccination_center;
	}




	/**
	 * @param num_vaccination_center the num_vaccination_center to set
	 */
	public void setNum_vaccination_center(Integer num_vaccination_center) {
		this.num_vaccination_center = num_vaccination_center;
	}




	/**
	 * @return the state_id
	 */
	
	@Override
	public String toString() {
		return "State [ zip_code=" + zip_code + ", vaccine_name="
				+ vaccine_name + ", state_id=" + state_id + ", percentage=" + percentage + ", num_vaccination_centres=" + num_vaccination_center +  "]";
	}
}
