package com.sophos.promart.questions;

import com.sophos.promart.models.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.sophos.promart.userinterfaces.ShoppingCartPage.*;

/**
 * Question donde se valida el carrito de compras y
 * que el producto que se seleccionó del catálogo se encuentre en él.
 */


public class VerifyProduct implements Question<Boolean> {
    private Product product;

    private VerifyProduct(Product product) {
        this.product = product;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(Ensure.that(LABLE_PRODUCT_NAME).text().isEqualTo(product.getName()),
                Ensure.that(LABLE_PRODUCT_PRICE.resolveFor(actor).getText().substring(3).split("\\.")[0])
                        .isEqualTo(product.getPrice()),
                Ensure.that(BUTTON_GO_TO_BUY).isDisplayed());

        return true;
    }

    public static VerifyProduct theProductSelected(Product product) {
        return new VerifyProduct(product);
    }
}
