package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.enums.Tab;
import starter.screenplay.navigation.NavigateTo;

public class NavigationStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{actor} opens the tech shop website")
    public void opensWebsite(Actor actor) {
        actor.wasAbleTo(NavigateTo.techShopHomePage());
    }

    @Given("{actor} opens {string} tab on toolbar")
    public void opensTab(Actor actor, String tabName) {
        actor.wasAbleTo(NavigateTo.tab(Tab.fromName(tabName)));
    }
}
