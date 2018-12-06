package poc.mobile.cielo.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import poc.mobile.cielo.core.BaseTeste;
import poc.mobile.cielo.core.DriverFactory;
import poc.mobile.cielo.funcionalidade.LoginFunc;

public class CieloMobileLoginSteps extends BaseTeste {

	private LoginFunc loginFunc = new LoginFunc();
	int contadorSrcreenshot = 0;
	Scenario cenario;
	
	private void gerarScreenShotFormatada() {
		gerarScreenShot(String.format("%s-%d", cenario.getId() , contadorSrcreenshot), cenario);
		contadorSrcreenshot++;
	}
	
	@Before
	public void pegaCenario(Scenario cenario) {
		this.cenario = cenario;
	}
	
	@After	
	public void finalizaCenario(Scenario cenario) {
		tearDown();
	}

	@Dado("^que inicializo o aplicativo Cielo Mobile$")
	public void queInicializoOAplicativoCieloMobile() throws Throwable {
		DriverFactory.getDriver();
	}

	@Entao("^sou direcionado para a tela de Menu inicial$")
	public void souDirecionadoParaATelaDeMenuInicial() throws Throwable {
		loginFunc.ValidaTelaInicial();
		gerarScreenShotFormatada();
	}

	@Dado("^que acesso a area Ja fez cadastro$")
	public void queAcessoAAreaJaFezCadastro() throws Throwable {
		loginFunc.acessarAreaJaCadastrado();
	}

	@Quando("^informo Numero Logico \"(.*?)\" e email \"(.*?)\"$")
	public void informoNumeroLogicoEEmail(String numeroLogico, String email) throws Throwable {
		loginFunc.inserirNumeroLogico(numeroLogico);
		loginFunc.inserirEmail(email);
	}

	@Entao("^vou para a proxima pagina$")
	public void vouParaAProximaPagina() throws Throwable {
		loginFunc.acessar();
		gerarScreenShotFormatada();
	}
}
