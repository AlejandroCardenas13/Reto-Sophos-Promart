package com.sophos.promart.tasks;

import com.sophos.promart.models.Product;
import com.sophos.promart.util.CommonFunctions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sophos.promart.userinterfaces.MenuPage.BUTTON_NEW;
import static com.sophos.promart.userinterfaces.MenuPage.LINK_CLOSE_POP_UP;
import static com.sophos.promart.userinterfaces.ProductPage.*;
import static com.sophos.promart.userinterfaces.TheNewPage.IMAGEN_OF_PRODUCT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


/**
 * Task donde se interactua con el producto que se quiere para el carrito de compras,
 * además se guarda el nombre y el precio del producto.
 * Generalmente no me gusta settear datos en las tareas y menos guardarlas como variables de Serenity, pero no
 * encontre otra forma de validarlo.
 */

public class SelectAProduct implements Task {
    private Product product = new Product();
    private CommonFunctions commonFunctions = new CommonFunctions();

    public static SelectAProduct selectProduct() {
        return new SelectAProduct();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LINK_CLOSE_POP_UP, isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Click.on(LINK_CLOSE_POP_UP));
        actor.attemptsTo(
                WaitUntil.the(BUTTON_NEW, isCurrentlyEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BUTTON_NEW));
        actor.attemptsTo(
                WaitUntil.the(IMAGEN_OF_PRODUCT, isCurrentlyEnabled()).forNoMoreThan(5).seconds(),
                Click.on(IMAGEN_OF_PRODUCT.resolveAllFor(actor).get(commonFunctions.getRandomNumberInterval(14, 4))),
                WaitUntil.the(BUTTON_ADD_PRODUCT, isCurrentlyEnabled()).forNoMoreThan(5).seconds());
        product.setName(LABLE_PRODUCT_NAME.resolveFor(actor).getText());
        product.setPrice(LABLE_PRODUCT_PRICE.resolveFor(actor).getText().substring(9).split("\\.")[0]);
        actor.attemptsTo(
                Click.on(BUTTON_ADD_PRODUCT),
                WaitUntil.the(BUTTON_GO_TO_SHOPPING_CART, isCurrentlyVisible()).forNoMoreThan(5).seconds()
        );
        Serenity.setSessionVariable("Product").to(product);
    }

//TODO ACARDENAS, averiguar por que no se puede interactuar con todos los elementos en un solo actor.attemptsTo
}