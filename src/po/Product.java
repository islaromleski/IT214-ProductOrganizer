package po;

/**
 * 
 * @author Matthew Romleski
 *
 */

public class Product {
	
	private int productId, categoryId, supplierId;
	private String productName;
	private double unitPrice;
	private boolean discontinued;
	
	public int getProductId() {
		return this.productId;
	}
	
	public void setProductId(int newProId) {
		this.productId = newProId;
	}
	
	public int getCategoryId() {
		return this.categoryId;
	}
	
	public void setCategoryId(int newCatId) {
		this.categoryId = newCatId;
	}
	
	public int getSupplierId() {
		return this.supplierId;
	}
	
	public void setSupplierId(int newSupId) {
		this.supplierId = newSupId;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public void setProductName(String newProductName) {
		this.productName = newProductName;
	}
	
	public double getUnitPrice() {
		return this.unitPrice;
	}
	
	public void setUnitPrice(double newPrice) {
		this.unitPrice = newPrice;
	}
	
	public boolean getDiscontinued() {
		return this.discontinued;
	}
	
	public void setDiscontinued(boolean newDiscontinued) {
		this.discontinued = newDiscontinued;
	}
	
	@Override
	public String toString() {
		String message = "";
		
		message += "Product Name: " + this.getProductName() + "\n";
		message += "Unit Price: $" + this.getUnitPrice() + "\n";
		message += "Product ID: " + this.getProductId() + "\n";
		message += "Category ID: " + this.getCategoryId() + "\n";
		message += "Supplier ID: " + this.getSupplierId() + "\n";
		message += "Discontinued: " + this.getDiscontinued() + "\n";
		
		return message;
	}	
}