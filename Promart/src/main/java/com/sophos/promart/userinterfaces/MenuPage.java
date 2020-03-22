package com.sophos.promart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPage {
    public static final Target BUTTON_NEW = Target.the("button the new").located(By.xpath("//a[@class='link-int lo-nuevo']"));
    public static final Target ICON_CART = Target.the("Icon cart").located(By.xpath("//i[@class='icons-cart']"));
    public static final Target LINK_CLOSE_POP_UP = Target.the("Link close pop up").located(By.xpath("//a[@class='close-dp gh-enlace']"));
}