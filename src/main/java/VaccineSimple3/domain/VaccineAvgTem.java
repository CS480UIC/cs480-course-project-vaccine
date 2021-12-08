package VaccineSimple3.domain;

/**
 * User object
 * 
 * @author yimai
 * 
 */
public class VaccineAvgTem {
	/*
	 * Correspond to the user table
	 */
	
	private String vaccine_name;
	private int vaccine_quantity; 
	
	

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



	@Override
	public String toString() {
		return "VaccineAvgTem[ vaccine_name=" + vaccine_name + ", vaccine_quantity=" + vaccine_quantity + "]";
	}
}
