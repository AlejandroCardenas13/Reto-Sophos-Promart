package com.sophos.promart.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sophos.promart.userinterfaces.MenuPage.BUTTON_NEW;
import static com.sophos.promart.userinterfaces.MenuPage.LINK_CLOSE_POP_UP;
import static com.sophos.promart.userinterfaces.ProductPage.BUTTON_ADD_PRODUCT;
import static com.sophos.promart.userinterfaces.TheNewPage.IMAGEN_OF_PRODUCT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SelectAProduct implements Task {

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
                Click.on(IMAGEN_OF_PRODUCT.resolveAllFor(actor).get(4)),
                WaitUntil.the(BUTTON_ADD_PRODUCT, isCurrentlyEnabled()).forNoMoreThan(5).seconds());
    }
//TODO ACARDENAS, averiguar por que no se puede interactuar con todos los elementos en un solo actor.attemptsTo

}
