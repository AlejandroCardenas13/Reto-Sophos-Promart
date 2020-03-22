package com.sophos.promart.stepdefinitions;

import com.sophos.promart.models.Product;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static com.sophos.promart.tasks.SelectAProduct.selectProduct;

public class ShoppingCartStepDefinitions {


    @Managed(driver = "chrome")
    private WebDriver herBrowser;
    private Actor proMartUser = Actor.named("proMartUser");
//    private Product product = new Product();


    @Before
    public void setUp() {
        Serenity.setSessionVariable("proMartUser").to(proMartUser);
        proMartUser.can(BrowseTheWeb.with(herBrowser));
        proMartUser.wasAbleTo(Open.url("https://www.promart.pe/"));
    }


    @When("^The user select a product of list of new$")
    public void selectAProduct() {
        proMartUser.attemptsTo(selectProduct());
    }

    @When("^The user goes to shopping cart$")
    public void goShoppingCart() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify that the user have a products in the shopping cart$")
    public void verifyProductsInTheShoppingCart() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
