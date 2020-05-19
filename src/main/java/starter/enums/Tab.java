package starter.enums;

import java.util.stream.Stream;

public enum Tab {

    PRODUCTS("products", "products-tab"),
    CART("cart", "cart-tab"),
    ORDERS("orders", "orders-tab");

    private final String label;
    private final String id;

    Tab(String label, String id) {
        this.label = label;
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public String getId() {
        return id;
    }

    public static Tab fromName(String label) {
        return Stream.of(values())
                .filter(tab -> tab.label.equalsIgnoreCase(label))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No page found with name " + label));
    }
}
