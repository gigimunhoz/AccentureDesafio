package elementos;

import org.openqa.selenium.By;

public class PriceOption {
	private By selectOption = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span");
	private By next = By.id("nextsendquote");

	public By getSelectOption() {
		return selectOption;
	}

	public By getNext() {
		return next;
	}

}