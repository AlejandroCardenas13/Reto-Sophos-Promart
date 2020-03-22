package com.sophos.promart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {
    public static final Target LABLE_PRODUCT_NAME = Target.the("Label product name").located(By.xpath("//*[contains(@class,'fn productName')]"));
    public static final Target LABLE_PRODUCT_PRICE = Target.the("Label product price").located(By.xpath("//div[@class='price js-price-price tam']"));
    public static final Target BUTTON_ADD_PRODUCT = Target.the("Button add product").located(By.xpath("//button[@class='js-addtocart gh-btn v2 v3']"));
    public static final Target BUTTON_GO_TO_SHOPPING_CART = Target.the("Button go to shopping cart").located(By.xpath("//a[@class='lnk2']"));
}