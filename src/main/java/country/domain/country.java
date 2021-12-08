package country.domain;

/**
 * User object
 * 
 * @author Yimai
 * 
 */
public class country {
	/*
	 * Correspond to the user table
	 */
	
	private int country_id;
	private String vaccine_name; 
	private String country_name; 
	private int population;
	private int cost;
	private Double percentage_vaccinated;
	
	/**
	 * @return the country_name
	 */
	public String getCountry_name() {
		return country_name;
	}



	/**
	 * @param country_name the country_name to set
	 */
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}



	

	/**
	 * @return the country_id
	 */
	public int getCountry_id() {
		return country_id;
	}



	/**
	 * @param country_id the country_id to set
	 */
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
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
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}



	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}



	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}



	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}



	/**
	 * @return the percentage_vaccinated
	 */
	public Double getPercentage_vaccinated() {
		return percentage_vaccinated;
	}



	/**
	 * @param percentage_vaccinated the percentage_vaccinated to set
	 */
	public void setPercentage_vaccinated(Double percentage_vaccinated) {
		this.percentage_vaccinated = percentage_vaccinated;
	}



	@Override
	public String toString() {
		return "vaccine [ country_id="
				+ country_id + ", vaccine_name=" + vaccine_name +", country_name = " + country_name +", population="
				+ population +", cost=" + cost +", percentage_vaccinated=" + percentage_vaccinated +"]";
	}

}
