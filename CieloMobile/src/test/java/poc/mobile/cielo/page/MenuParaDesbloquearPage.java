package poc.mobile.cielo.page;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import poc.mobile.cielo.core.BasePage;

public class MenuParaDesbloquearPage extends BasePage{

	public MobileElement CampoNumeroLogico() {
		return retornaElemento(By.id("com.m4u.cielomobile:id/desbloqueio_numeroLogico"));
	}

	public MobileElement CampoEmail() {
		return retornaElemento(By.id("com.m4u.cielomobile:id/desbloqueio_email"));
	}

	public void clicarNoVisto() {
		tap(1075, 1915);
	}



	
	
	
}
