package elementos;

import org.openqa.selenium.By;

public class InsurantData {

	private By firstName = By.id("firstname");
	private By lastName = By.id("lastname");
	private By dateBirth = By.id("birthdate");
	private By country = By.id("country");
	private By zipCode = By.id("zipcode");
	private By occupacion = By.id("occupation");
	private By hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]");
	private By next = By.id("nextenterproductdata");

	public By getFirstName() {
		return firstName;
	}

	public By getLastName() {
		return lastName;
	}

	public By getDateBirth() {
		return dateBirth;
	}

	public By getCountry() {
		return country;
	}

	public By getZipCode() {
		return zipCode;
	}

	public By getOccupacion() {
		return occupacion;
	}

	public By getHobbies() {
		return hobbies;
	}

	public By getNext() {
		return next;
	}

}