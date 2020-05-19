package starter.screenplay.orders;

import net.serenitybdd.screenplay.targets.Target;

import static java.lang.String.format;

public class Order {

    public static Target byEmail(String email) {
        String xpath = format("//div[contains(text(),'Email: %s')]", email);
        return Target.the("product name")
                .locatedBy(xpath);
    }
}
