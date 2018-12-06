package poc.mobile.cielo.core;

import static poc.mobile.cielo.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage {
		
	public MobileElement retornaElemento(By by) {
		return getDriver().findElement(by);
	}
	
	public void clicar(By by) {
		getDriver().findElement(by).click();
	}
			
	public void tap(int x, int y) {
		new TouchAction(getDriver()).tap(PointOption.point(x,y)).perform();
	}
}
