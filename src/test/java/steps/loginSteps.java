package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	    @Given("user is on login page")
	    public void openLoginPage() {
	        System.out.println("Opening banking login page");
	    }

	    @When("user enters username and password")
	    public void enterCredentials() {
	        System.out.println("Entering credentials");
	    }

	    @Then("user should see dashboard")
	    public void verifyDashboard() {
	    	System.out.println("Dashboard displayed");
	    	System.out.println("Dashboard displayed");
	    }
	}

//	WebDriver driver;
//	@Given("Navigating to the webpage")
//	public void navigatingToTheWebpage() {
//		driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//	    
//	}
////	@Given("Enter item name")
////	public void enterItemName() {
////	  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Slipper");
////	}
//	
//	@Given("Enter item name as {string}")
//	public void enterItemNameAs(String itemName) {
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(itemName);
//	}
//	@When("Click Search")
//	public void clickSearch() {
//		 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//	}
//	@Then("Show Results")
//	public void showResults() {
//	   driver.close();
//	}

//}
