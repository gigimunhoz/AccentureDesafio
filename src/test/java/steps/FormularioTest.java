package steps;

import elementos.InsurantData;
import elementos.PriceOption;
import elementos.ProductData;
import elementos.SendQuote;
import elementos.VehicleData;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Metodos;

public class FormularioTest {

	InsurantData insurant = new InsurantData();
	PriceOption price = new PriceOption();
	ProductData product = new ProductData();
	SendQuote send = new SendQuote();
	VehicleData vehicle = new VehicleData();
	Metodos metodos = new Metodos();

	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String string) {
		metodos.abrirBrowser("http://sampleapp.tricentis.com/101/app.php");
	}

	@Quando("eu preencher e enviar o formulario")
	public void eu_preencher_e_enviar_o_formulario() throws InterruptedException {
		// preencher formulario Enter Vehicle Data
		metodos.escrever(vehicle.getMake(), "BMW");
		metodos.escrever(vehicle.getModel(), "Scooter");
		metodos.escrever(vehicle.getCylinder(), "1");
		metodos.escrever(vehicle.getEngine(), "1");
		metodos.escrever(vehicle.getDate(), "08/08/2021");
		metodos.escrever(vehicle.getNumbers(), "1");
		metodos.escrever(vehicle.getNumbersSeats(), "1");
		metodos.escrever(vehicle.getFuel(), "Gas");
		metodos.escrever(vehicle.getPayload(), "1000");
		metodos.escrever(vehicle.getTotal(), "1000");
		metodos.escrever(vehicle.getList(), "1000");
		metodos.escrever(vehicle.getAnnual(), "100");
		metodos.clicar(vehicle.getNext());

		// Preencher formulario Enter Insurance Data
		metodos.escrever(insurant.getFirstName(), "Giovanna");
		metodos.escrever(insurant.getLastName(), "Munhoz");
		metodos.escrever(insurant.getDateBirth(), "12/01/2001");
		metodos.escrever(insurant.getCountry(), "Brazil");
		metodos.escrever(insurant.getZipCode(), "1234");
		metodos.escrever(insurant.getOccupacion(), "Employee");
		metodos.clicar(insurant.getHobbies());
		metodos.clicar(insurant.getNext());

		// Preencher formulario Enter Product Data
		metodos.escrever(product.getStarDate(), "11/03/2021");
		metodos.escrever(product.getInsurance(), "3.000.000,00");
		metodos.escrever(product.getMeritRating(), "Bonus 1");
		metodos.escrever(product.getDamegeInsurance(), "No Coverage");
		metodos.clicar(product.getOptionalProducts());
		metodos.escrever(product.getCoutersyCar(), "Yes");
		metodos.clicar(product.getNext());

		// Selecionar preco Select Price Option
		metodos.clicar(price.getSelectOption());
		Thread.sleep(1000);
		metodos.clicar(price.getNext());

		// Preencher formulario Send Quote
		metodos.escrever(send.getEmail(), "giovanna@teste.com");
		metodos.escrever(send.getUsername(), "Giovanna");
		metodos.escrever(send.getPassword(), "Testando1");
		metodos.escrever(send.getConfirmPassword(), "Testando1");
	}

	@Entao("valido o envio do e-mail com sucesso")
	public void valido_o_envio_do_e_mail_com_sucesso() {
		metodos.clicar(send.getSend());
	}

}