package po;

/**
 * 
 * @author Matthew Romleski
 *
 */

public class Supplier {

	private int supplierId;
	private String companyName, street, city, country;
	
	public int getSupplierId() {
		return this.supplierId;
	}
	
	public void setSupplierId(int newSupId) {
		this.supplierId = newSupId;
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	
	public void setCompanyName(String newCompanyName) {
		this.companyName = newCompanyName;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	public void setStreet(String newStreet) {
		this.street = newStreet;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String newCity) {
		this.city = newCity;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String newCountry) {
		this.country = newCountry;
	}
	
	@Override
	public String toString() {
		String message = "";
		
		message += "Company Name: " + this.getCompanyName() + "\n";
		message += "Supplier ID: " + this.getSupplierId() + "\n";
		message += "Street: " + this.getStreet() + "\n";
		message += "City: " + this.getCity() + "\n";
		message += "Country: " + this.getCountry() + "\n";
		
		return message;
	}
}