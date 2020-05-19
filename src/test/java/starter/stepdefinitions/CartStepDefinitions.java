package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.screenplay.cart.CartActions;
import starter.screenplay.cart.CartItem;

public class CartStepDefinitions {
    @Then("{actor} sees {string} product in the cart")
    public void seesProductInTheCart(Actor actor, String productName) {
        actor.attemptsTo(
                Ensure.that(CartItem.byName(productName)).isDisplayed()
        );
    }

    @When("{actor} proceeds checkout")
    public void seesProductInTheCart(Actor actor) {
        actor.wasAbleTo(CartActions.checkout());
    }
}
