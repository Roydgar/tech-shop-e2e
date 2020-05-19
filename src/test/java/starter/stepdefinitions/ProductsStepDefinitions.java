package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.screenplay.products.Product;
import starter.screenplay.products.ProductList;
import starter.screenplay.products.ProductListActions;

public class ProductsStepDefinitions {
    @When("{actor} buys {string} product")
    public void userBuysProduct(Actor actor, String productName) {
        actor.wasAbleTo(ProductListActions.buy(productName));
    }

    @Then("{actor} sees {string} product")
    public void seesProduct(Actor actor, String productName) {
        actor.attemptsTo(
                Ensure.that(ProductList.byName(productName)).isDisplayed()
        );
    }

    @Then("{actor} views {string} product info")
    public void viewsProductInfo(Actor actor, String productName) {
        actor.wasAbleTo(ProductListActions.viewInfo(productName));
    }

    @Then("{actor} sees {string} product info")
    public void seesProductInfo(Actor actor, String productName) {
        actor.attemptsTo(
                Ensure.that(Product.byName(productName)).isDisplayed()
        );
    }
}
