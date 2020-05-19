package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.screenplay.home.Headline;

public class HomeStepDefinitions {

    @Then("{actor} sees {string} headline")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(Headline.headlineLabel()).hasText(term)
        );
    }

}
