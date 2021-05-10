package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver=null;

	@SuppressWarnings("deprecation")
	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Browser is open");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		
	}

	@And("User is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://google.com");
		System.out.println("User is on google search page");
		
	}

	@When("User enters text in search box")
	public void user_enters_text_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("Shakti CV");
		System.out.println("User enters text in search box");
	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("User hits enter");
	}

	@Then("User is Navigated to search results page")
	public void user_is_navigated_to_search_results_page() {
		driver.getPageSource().contains("Shakti");
		driver.close();
		System.out.println("User is Navigated to search results page");
	}


}
