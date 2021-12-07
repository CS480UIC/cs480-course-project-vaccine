package state.domain;

/**
 * User object
 * 
 * @author Amrit Raj Vardhan
 * 
 */
public class state {
	/*
	 * Correspond to the user table
	 */
	
	private Integer state_id;
	private String vaccine_name; 
	private Integer country_id;
	private String state_name;
	private Integer population;
	private Float percentage;
	
	

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
	 * @return the country_id
	 */
	public Integer getCountry_id() {
		return country_id;
	}



	/**
	 * @param country_id the country_id to set
	 */
	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}



	/**
	 * @return the state_name
	 */
	public String getState_name() {
		return state_name;
	}



	/**
	 * @param state_name the state_name to set
	 */
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}



	/**
	 * @return the population
	 */
	public Integer getPopulation() {
		return population;
	}



	/**
	 * @param population the population to set
	 */
	public void setPopulation(Integer population) {
		this.population = population;
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


	@Override
	public String toString() {
		return "State [ state_id=" + state_id + ", vaccine_name="
				+ vaccine_name + ", country_id=" + country_id + ", state_name=" + state_name + ", population=" + population + ", percentage=" + percentage +"]";
	}
}
