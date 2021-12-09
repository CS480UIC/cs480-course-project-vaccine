package complex1.domain;

/**
 * User object
 * 
 * @author yimai
 * 
 */
public class complex1 {
	/*
	 * Correspond to the user table
	 */
	
	private String vaccine_name;
	private double temperature; 
	private int vaccine_quantity;
	private double cost;

	
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
	 * @return the temperature
	 */
	public Double getTemperature() {
		return temperature;
	}


	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}


	/**
	 * @return the vaccine_quantity
	 */
	public int getVaccine_quantity() {
		return vaccine_quantity;
	}


	/**
	 * @param vaccine_quantity the vaccine_quantity to set
	 */
	public void setVaccine_quantity(int vaccine_quantity) {
		this.vaccine_quantity = vaccine_quantity;
	}


	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}


	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "vaccine [ vaccine_name="
				+ vaccine_name + ", temperature=" + temperature +", vaccine_quantity="
				+ vaccine_quantity +", cost=" + cost +"]";
	}
}
