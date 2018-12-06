package poc.mobile.cielo.page;

import org.openqa.selenium.By;

import poc.mobile.cielo.core.BasePage;

public class MenuPrincipalPage extends BasePage {

	public void clicarEmJaFezCadastro() {
	    clicar(By.id("com.m4u.cielomobile:id/tela_bloqueado_btDesbloquear"));
		
	}

	public boolean retornaLogoCieloVisivel() {
		return retornaElemento(By.id("com.m4u.cielomobile:id/logoCielo")).isDisplayed();
	}




	
}
