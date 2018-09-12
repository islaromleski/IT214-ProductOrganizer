/**
 * 
 * @author Matthew Romleski
 *
 */

package po;

public class Category {

	private int categoryId;
	private String categoryName, description;
	
	public int getCategoryId() {
		return this.categoryId;
	}
	
	public void setCategoryId(int newCatId) {
		this.categoryId = newCatId;
	}
	
	public String getCategoryName() {
		return this.categoryName;
	}
	
	public void setCategoryName(String newCatName) {
		this.categoryName = newCatName;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String newDescription) {
		this.description = newDescription;
	}
	
	@Override
	public String toString() {
		String message = "";
		
		message += "Category ID: " + this.getCategoryId() + "\n";
		message += "Category Name: " + this.getCategoryName() + "\n";
		message += "Description: " + this.getDescription() + "\n";
		
		return message;
	}
}