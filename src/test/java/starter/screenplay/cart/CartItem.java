package starter.screenplay.cart;

import net.serenitybdd.screenplay.targets.Target;

import static java.lang.String.format;

public class CartItem {

    public static Target byName(String productName) {
        String xpath = format("//mat-card-title[contains(text(), '%s')]", productName);
        return Target.the("product name")
                .locatedBy(xpath);
    }
}
