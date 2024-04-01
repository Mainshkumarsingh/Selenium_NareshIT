package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001 {
	public WebDriver driver;
	@Given("OpenApplication")
	public void open_application() {
	driver = new ChromeDriver();
	driver.get("http://183.82.103.245/nareshit/login.php");
	}
	@When("Login")
	public void login() {
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	}
	@Then("Logout")
	public void logout() {
	driver.findElement(By.linkText("Logout")).click();
	}
}
