package hackit.upc.edu.domini;

import java.util.HashMap;

/**
 * Created by Joan on 11/02/2016.
 */
public class Inventory {
    private HashMap<ProductType, Integer> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public Inventory(HashMap<ProductType, Integer> items) {
        this.items = items;
    }

    public void addItem(ProductType type) {
        
    }
}
