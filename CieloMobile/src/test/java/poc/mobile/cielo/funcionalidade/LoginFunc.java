package poc.mobile.cielo.funcionalidade;

import static org.junit.Assert.assertTrue;

import io.appium.java_client.MobileElement;
import poc.mobile.cielo.page.MenuParaDesbloquearPage;
import poc.mobile.cielo.page.MenuPrincipalPage;

public class LoginFunc {

	private MenuPrincipalPage menuPpage = new MenuPrincipalPage();
	private MenuParaDesbloquearPage paraDesbloquearPage = new MenuParaDesbloquearPage();
	
	public void acessarAreaJaCadastrado() {
		menuPpage.clicarEmJaFezCadastro();
		
	}

	public void ValidaTelaInicial() {
		boolean logoCielo = false;
		try {
			logoCielo = menuPpage.retornaLogoCieloVisivel();
		} catch (Exception e) {
			// TODO
		}
		assertTrue(logoCielo);
	}

	public void inserirNumeroLogico(String numeroLogico) {
		MobileElement elemento = paraDesbloquearPage.CampoNumeroLogico();
		
		elemento.sendKeys(numeroLogico);		
	}

	public void inserirEmail(String email) {
		MobileElement elemento = paraDesbloquearPage.CampoEmail();
		elemento.sendKeys(email);		
	}

	public void acessar() {
		paraDesbloquearPage.clicarNoVisto();
		
	}

	
	

	
	
}
