package po;

/**
 * 
 * @author Matthew Romleski
 *
 */

public class MainController {
	public static void main(String[] args) {

		// Creates the objects for the first product.
		Product chickenRamen = new Product();
		Category food = new Category();
		Supplier genericFoodCo = new Supplier();

		// Creates the objects for the second product.
		Product spoonSet = new Product();
		Category home = new Category();
		Supplier everythingUtensils = new Supplier();

		// Creates the objects for the third product.
		Product oldFlipPhone = new Product();
		Category tech = new Category();
		Supplier furuiTech = new Supplier();
		
		//Creates a ConsoleView object.
		ConsoleView aView = new ConsoleView();

		//Sets the variables for the first product.
		chickenRamen.setProductName("Chicken Ramen");
		chickenRamen.setUnitPrice(0.45);
		chickenRamen.setProductId(1283);
		chickenRamen.setCategoryId(1);
		chickenRamen.setSupplierId(1);
		chickenRamen.setDiscontinued(false);

		//Sets the variables for the second product.
		spoonSet.setProductName("Spoons - 5 Pack");
		spoonSet.setUnitPrice(2.99);
		spoonSet.setProductId(4267);
		spoonSet.setCategoryId(2);
		spoonSet.setSupplierId(2);
		spoonSet.setDiscontinued(false);

		//Sets the variables for the third product.
		oldFlipPhone.setProductName("Really Old Flip Phone");
		oldFlipPhone.setUnitPrice(129.99);
		oldFlipPhone.setProductId(293);
		oldFlipPhone.setCategoryId(3);
		oldFlipPhone.setSupplierId(3);
		oldFlipPhone.setDiscontinued(true);
		
		//Sets the variables for the first category.
		food.setCategoryId(1);
		food.setCategoryName("Foodstuffs");
		food.setDescription("This category is for any kind of edible perishables such as food and drinks.");
		
		//Sets the variables for the second category.
		home.setCategoryId(2);
		home.setCategoryName("Home & Kitchen");
		home.setDescription("Used for items such as utensils, tableware, and cups, among other things.");
		
		//Sets the variables for the third category.
		tech.setCategoryId(3);
		tech.setCategoryName("Technology");
		tech.setDescription("A category for all technological items, including (but not limited to) " +
							"smartphones, laptops, keyboards, mice, and etc.");
		
		//Sets the variables for the first supplier.
		genericFoodCo.setCompanyName("Generic Food Inc.");
		genericFoodCo.setSupplierId(1);
		genericFoodCo.setStreet("24039 Main Street");
		genericFoodCo.setCity("Louisville");
		genericFoodCo.setCountry("United States of America");
		
		//Sets the variables for the second supplier.
		everythingUtensils.setCompanyName("Everything Utensils & Co.");
		everythingUtensils.setSupplierId(2);
		everythingUtensils.setStreet("14 Wall Street");
		everythingUtensils.setCity("New York City");
		everythingUtensils.setCountry("United States of America");
		
		//Sets the variables for the third supplier.
		furuiTech.setCompanyName("Furui Tech / ŒÃ‚¢ƒeƒN");
		furuiTech.setSupplierId(3);
		furuiTech.setStreet("1 Chrome-9-10 Kohinata");
		furuiTech.setCity("Tokyo");
		furuiTech.setCountry("Japan");
		
		//Prints the contents of each object to the console.
		aView.print(chickenRamen.toString());
		aView.print(food.toString());
		aView.print(genericFoodCo.toString());
		aView.print(spoonSet.toString());
		aView.print(home.toString());
		aView.print(everythingUtensils.toString());
		aView.print(oldFlipPhone.toString());
		aView.print(tech.toString());
		aView.print(furuiTech.toString());
	}
}