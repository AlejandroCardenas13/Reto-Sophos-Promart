package com.sophos.promart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartPage {

    public static final Target LABLE_PRODUCT_NAME = Target.the("Label product name").located(By.xpath("//*[contains(@id,'product-name')]"));
    public static final Target LABLE_PRODUCT_PRICE = Target.the("Label product price").located(By.xpath("//span[@class='best-price']"));
    public static final Target BUTTON_GO_TO_BUY = Target.the("Button go to buy").located(By.id("cart-to-orderform"));

    private ShoppingCartPage(){ throw new IllegalStateException("Utility Target class");}
}