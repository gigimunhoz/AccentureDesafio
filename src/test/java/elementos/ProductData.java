package elementos;

import org.openqa.selenium.By;

public class ProductData {
	private By starDate = By.id("startdate");
	private By insurance = By.id("insurancesum");
	private By meritRating = By.id("meritrating");
	private By damegeInsurance = By.id("damageinsurance");
	private By optionalProducts = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]");
	private By coutersyCar = By.id("courtesycar");
	private By next = By.id("nextselectpriceoption");

	public By getStarDate() {
		return starDate;
	}

	public By getInsurance() {
		return insurance;
	}

	public By getMeritRating() {
		return meritRating;
	}

	public By getDamegeInsurance() {
		return damegeInsurance;
	}

	public By getOptionalProducts() {
		return optionalProducts;
	}

	public By getCoutersyCar() {
		return coutersyCar;
	}

	public By getNext() {
		return next;
	}

}