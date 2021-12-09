package CountrySimple2.domain;

/**
 * User object
 * 
 * @author yimai
 * 
 */
public class CountrySimple2 {
	/*
	 * Correspond to the user table
	 */
	
	private int country_id;
	private String country_name;
	private String id_country_name; 
	
	
	
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
	 * @return the id_country_name
	 */
	public String getId_country_name() {
		return id_country_name;
	}



	/**
	 * @param id_country_name the id_country_name to set
	 */
	public void setId_country_name(String id_country_name) {
		this.id_country_name = id_country_name;
	}



	@Override
	public String toString() {
		return "CountrySimple2[ country_id=" + country_id + ", country_name=" + country_name + ", id_country_name=" + id_country_name + "]";
	}
}
