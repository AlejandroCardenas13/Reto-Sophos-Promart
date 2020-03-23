package com.sophos.promart.stepdefinitions;

import com.sophos.promart.models.Product;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static com.sophos.promart.questions.VerifyProduct.theProductSelected;
import static com.sophos.promart.tasks.SelectAProduct.selectProduct;
import static com.sophos.promart.userinterfaces.ProductPage.BUTTON_GO_TO_SHOPPING_CART;
import static com.sophos.promart.userinterfaces.ShoppingCartPage.LABLE_PRODUCT_PRICE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

/**
 * Clase donde estarán los métodos de el feature Shopping Cart.
 */

public class ShoppingCartStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver herBrowser;
    private Actor proMartUser = Actor.named("proMartUser");


    /**
     * Este método se encarga de abrir el navegador en la página de Promart.
     * También pude haberlo considerado como un Step propio dentro del feature
     * o implementarlo como BackGround en el feature pero está forma es la que
     * me parece más optima
     */
    @Before
    public void setUp() {
        Serenity.setSessionVariable("proMartUser").to(proMartUser);
        proMartUser.can(BrowseTheWeb.with(herBrowser));
        proMartUser.wasAbleTo(Open.url("https://www.promart.pe/"));
    }

    /**
     * Algo que no me gusto de la tarea selectProduct() es que está lleno de esperas,
     * intente minimizarlas pero no las pude eliminar.
     */
    @When("^The user select a product of list of new$")
    public void selectAProduct() {
        proMartUser.attemptsTo(selectProduct());
    }

    @When("^The user goes to shopping cart$")
    public void goShoppingCart() {
        proMartUser.attemptsTo(Click.on(BUTTON_GO_TO_SHOPPING_CART),
                WaitUntil.the(LABLE_PRODUCT_PRICE, isVisible()).forNoMoreThan(6).seconds());
    }

    @Then("^Verify that the user have a products in the shopping cart$")
    public void verifyProductsInTheShoppingCart() {
        Product product = Serenity.sessionVariableCalled("Product");
        proMartUser.should(seeThat(theProductSelected(product)));
    }
}