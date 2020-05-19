package starter.stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.screenplay.checkout.CheckoutActions;

public class CheckoutStepDefinitions {
    @When("{actor} enters {string} name")
    public void entersName(Actor actor, String name) {
        actor.wasAbleTo(CheckoutActions.enterName(name));
    }

    @When("{actor} enters {string} email")
    public void entersEmail(Actor actor, String email) {
        actor.wasAbleTo(CheckoutActions.enterEmail(email));
    }

    @When("{actor} confirms checkout")
    public void confirmsCheckout(Actor actor) {
        actor.wasAbleTo(CheckoutActions.confirm());
    }
}
