package com.sophos.promart.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/shopping cart.feature",
        glue = "com.sophos.promart.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class ShoppingCart {
}
