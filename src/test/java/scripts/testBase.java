package scripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.message.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testBase {
	@Test
	public void browserInitializer() throws IOException {

		
		Logger log = LogManager.getLogger(testBase.class);

		log.info("mySnapps homepage is successfully launched");
		log.info("Code is successfully pushed and pulled from Git frist time");
		log.info("Code is successfully pushed and pulled from Git second time");

		WebDriver driver = null;
		Properties pop = new Properties();
		FileInputStream file = new FileInputStream(

				"C:\\Users\\GANGULA\\Desktop\\Automation\\Projects\\MavenArt\\src\\main\\java\\resource\\data.properties");

		pop.load(file);
		String browserVal = pop.getProperty("browser");

		if (browserVal.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\GANGULA\\Desktop\\Automation\\Projects\\MavenArt\\src\\main\\java\\resource\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.get(pop.getProperty("url"));
			driver.close();
			driver.quit();

		} else {

		}
//		return driver;

	}

}
