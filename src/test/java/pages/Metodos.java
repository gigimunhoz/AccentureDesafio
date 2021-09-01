package pages;

import org.openqa.selenium.By;

public class Metodos extends Browser {

	public void escrever(By elemento, String texto) {

		adriver().findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		adriver().findElement(elemento).click();

	}
}