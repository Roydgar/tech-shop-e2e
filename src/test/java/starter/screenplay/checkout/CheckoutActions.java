package starter.screenplay.checkout;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static java.lang.String.format;

public class CheckoutActions {

    public static Performable enterName(String value) {
        return Task.where("{0} confirm",
                Enter.theValue(value)
                        .into(By.id("name_input"))
                        .thenHit(Keys.ENTER)
                );
    }

    public static Performable enterEmail(String value) {
        return Task.where("{0} confirm",
                Enter.theValue(value)
                        .into(By.id("email_input"))
        );
    }

    public static Performable confirm() {
        return Task.where("{0} confirm",
                Click.on(By.id("confirm_button")));
    }
}
