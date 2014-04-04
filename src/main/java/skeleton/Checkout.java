package skeleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aimeerivers on 04/04/2014.
 */
public class Checkout {
    private final Map<String, Integer> productPrices = new HashMap<String, Integer>();
    private int numberOfEspressos;
    private int numberOfCroissants;
    private int runningTotal = 0;

    public void setPrice(String product, int price) {
        productPrices.put(product, price);
    }

    public void sellProduct(String product, int quantity) {
        this.runningTotal += productPrices.get(product) * quantity;
    }

    public int total() {
        return runningTotal;
    }
}
