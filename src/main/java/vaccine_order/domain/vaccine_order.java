package vaccine_order.domain;

import java.sql.Date;

/**
 * User object
 * 
 * @author Yimai
 * 
 */
public class vaccine_order {
	/*
	 * Correspond to the user table
	 */
	
	private String vaccine_name;
	private Integer country_id; 
	private Integer order_id;
	private int quantity;
	private String order_date;
	/**
	 * @return the order_id
	 */
	public Integer getOrder_id() {
		return order_id;
	}



	/**
	 * @param order_id the order_id to set
	 */
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
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
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}



	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	/**
	 * @return the date
	 */
	public String getOrder_date() {
		return order_date;
	}



	/**
	 * @param date the date to set
	 */
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}


	
	
	@Override
	public String toString() {
		return "vaccine [ vaccine_name="
				+ vaccine_name + ", country_id=" + country_id +", vaccine_quantity="
				+ quantity +", date=" + order_date +"]";
	}

}
