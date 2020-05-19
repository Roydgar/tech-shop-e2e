package starter.screenplay.cart;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static java.lang.String.format;

public class CartActions {

    public static Performable checkout() {
        return Task.where("{0} checkout",
                Click.on(By.id("checkout")));
    }

    public static Performable clearCart() {
        return Task.where("{0} checkout",
                Click.on(By.id("clear_cart")));
    }
}
