package starter.screenplay.products;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import static java.lang.String.format;

public class ProductListActions {

    public static Performable buy(String productName) {
        return Task.where("{0} buys product " + productName,
                Click.on(By.id(format("buy %s", productName))));
    }

    public static Performable viewInfo(String productName) {
        return Task.where("{0} buys product " + productName,
                Click.on(By.id(format("info %s", productName))));
    }
}

