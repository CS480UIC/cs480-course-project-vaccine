package zip_code.domain;

/**
 * User object
 * 
 * @author Yimai
 * 
 */
public class zip_code {
	/*
	 * Correspond to the user table
	 */
	
	private int zip_code;
	private String vaccine_name; 
	private int state_id;
	private double percentage;
	private int num_vaccination_center;
	/**
	 * @return the zip_code
	 */
	public int getZip_code() {
		return zip_code;
	}
	/**
	 * @param zip_code the zip_code to set
	 */
	public void setZip_code(int zip_code) {
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
	public int getState_id() {
		return state_id;
	}
	/**
	 * @param state_id the state_id to set
	 */
	public void setState_id(int state_id) {
		this.state_id = state_id;
	}
	/**
	 * @return the percentage
	 */
	public double getPercentage() {
		return percentage;
	}
	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	/**
	 * @return the num_vaccination_center
	 */
	public int getNum_vaccination_center() {
		return num_vaccination_center;
	}
	/**
	 * @param num_vaccination_center the num_vaccination_center to set
	 */
	public void setNum_vaccination_center(int num_vaccination_center) {
		this.num_vaccination_center = num_vaccination_center;
	}
	
	@Override
	public String toString() {
		return "zip_code [ zip_code=" + zip_code + ", vaccine_name="
				+ vaccine_name + ", state_id=" + state_id +", percentage="
				+ percentage +", num_vaccination_center=" + state_id +"]";
	}

}
