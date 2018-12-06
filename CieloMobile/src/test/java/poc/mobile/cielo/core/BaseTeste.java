package poc.mobile.cielo.core;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.imgscalr.Scalr;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;

public class BaseTeste {
	
	
//	public static void finaliza() {
//	}
	
	public void tearDown() {
//		DriverFactory.getDriver().resetApp();
		DriverFactory.killDriver();		
	}

    public void gerarScreenShot(String cenario, Scenario scenario) {
    	String caminhoImagem = "target/screenshots/"+cenario.replace(";","")+".png";
    	
    	try {
    		File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
    		    		           
            BufferedImage scaledImage = Scalr.resize(ImageIO.read(imagem), 500);
            byte[] screenshotEmbed = toByteArrayAutoClosable(scaledImage, "png");

            
    		//byte[] screenshotEmbed = Files.readAllBytes(imagem.toPath());
            scenario.write("\n");
            scenario.embed(screenshotEmbed, "image/png");
            scenario.write("\n");

            
			FileUtils.copyFile(imagem, new File(caminhoImagem));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    private static byte[] toByteArrayAutoClosable(BufferedImage image, String type) throws IOException {
        try (ByteArrayOutputStream out = new ByteArrayOutputStream()){
            ImageIO.write(image, type, out);
            return out.toByteArray();
        }
    }
    	
}
