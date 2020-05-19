package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.screenplay.orders.Order;

import static java.lang.String.format;

public class OrderStepDefinitions {

    @Then("{actor} sees order by {string} consumer email")
    public void seesProduct(Actor actor, String consumerEmail) {
        actor.attemptsTo(
                Ensure.that(Order.byEmail(consumerEmail)).isDisplayed()
        );
    }
}
