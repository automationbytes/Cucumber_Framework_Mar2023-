package StepDefn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class GoogleSteps {
	WebDriver driver;
	
	@Before()
	public void initBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	}
	
	@After()
	public void takeScreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			byte[] source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(source, "image/png", scenario.getName().replace(" ", "_").substring(0,25));
		}
	}
	
	
	
	@Given("the user launches the google url")
	public void the_user_launches_the_google_url() {
		
		driver.get("https://www.google.com/");
	}

	@Then("the user verifies the google logo")
	public void the_user_verifies_the_google_logo() {
	    Assert.assertTrue(driver.findElement(By.xpath("//img[@alt=\"Google\"]")).isDisplayed());
	}

	@When("the user enters {string} in google search bar")
	public void the_user_enters_in_google_search_bar(String SearchText) {
	    driver.findElement(By.xpath("//input[@title=\"Serch\"]")).sendKeys(SearchText);
	}

	@When("the user clicks on keyboard enter key")
	public void the_user_clicks_on_keyboard_enter_key() {
	    driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys(Keys.ENTER);
	}

	@Then("the user verifies the google search result")
	public void the_user_verifies_the_google_search_result() {
	   System.out.println(driver.getTitle());
	}


}
