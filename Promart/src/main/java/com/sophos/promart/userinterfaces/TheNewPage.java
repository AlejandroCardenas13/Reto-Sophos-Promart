package com.sophos.promart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TheNewPage {
    public static final Target IMAGEN_OF_PRODUCT = Target.the("Imagen of product").located(By.xpath("//*[@class='productImage']"));

    private TheNewPage(){ throw new IllegalStateException("Utility Target class");}
}