package starter.screenplay.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.By;
import starter.enums.Tab;

public class NavigateTo {

    public static Performable techShopHomePage() {
        return Task.where("{0} opens the Tech Shop home page",
                Open.browserOn().the(TechShopHomePage.class));
    }

    public static Performable tab(Tab tab) {
        return Task.where("{0} navigate by tab with name " + tab.getLabel(),
                Click.on(By.id(tab.getId())));
    }
}
