package elementos;

import org.openqa.selenium.By;

public class VehicleData {

	private By make = By.xpath("//*[@id=\"make\"]");
	private By model = By.xpath("//*[@id=\"model\"]");
	private By cylinder = By.id("cylindercapacity");
	private By engine = By.id("engineperformance");
	private By date = By.id("dateofmanufacture");
	private By numbersSeats = By.id("numberofseatsmotorcycle");
	private By numbers = By.id("numberofseats");
	private By fuel = By.id("fuel");
	private By payload = By.id("payload");
	private By total = By.id("totalweight");
	private By list = By.id("listprice");
	private By annual = By.id("annualmileage");
	private By next = By.id("nextenterinsurantdata");
	
	public By getMake() {
		return make;
	}
	public By getModel() {
		return model;
	}
	public By getCylinder() {
		return cylinder;
	}
	public By getEngine() {
		return engine;
	}
	public By getDate() {
		return date;
	}
	public By getNumbersSeats() {
		return numbersSeats;
	}
	public By getNumbers() {
		return numbers;
	}
	public By getFuel() {
		return fuel;
	}
	public By getPayload() {
		return payload;
	}
	public By getTotal() {
		return total;
	}
	public By getList() {
		return list;
	}
	public By getAnnual() {
		return annual;
	}
	public By getNext() {
		return next;
	}
}