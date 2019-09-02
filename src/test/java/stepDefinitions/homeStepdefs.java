package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class homeStepdefs {
    private WebDriver driver = Browser.launch();

    public homeStepdefs() throws MalformedURLException {
    }

    @Given("^I go to \"([^\"]*)\"$")
    public void iGoTo(String url) throws Throwable {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @And("^I click on Empezar button$")
    public void iClickOnEmpezarButton() throws Throwable {
        driver.findElement(By.xpath("//*[@id='download-button']")).click();
    }

    @Then("^I should see \"([^\"]*)\" header$")
    public void iShouldSeeHeader(String expectedHeader) throws Throwable {
        String header = driver.findElement(By.xpath("/html/body/app-root/header/div/div")).getText();
        Assert.assertTrue(header.contains(expectedHeader));
    }
}
