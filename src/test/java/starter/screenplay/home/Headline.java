package starter.screenplay.home;

import net.serenitybdd.screenplay.targets.Target;

public class Headline {

    public static Target headlineLabel() {
        return Target.the("headline content").locatedBy("#headline-label");
    }
}
