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

    public void addProduct(ProductType type) {
        addProduct(type, 1);
    }
    
    public void addProduct(ProductType type, int quantity) {
        if (items.containsKey(type)) {
            items.put(type, items.get(type) + quantity);
        }
        else items.put(type, quantity);
    }

    public void removeProduct(ProductType type) {
        removeProduct(type, 1);
    }

    public void removeProduct(ProductType type, int quantity) {
        if (items.containsKey(type)) {
            Integer val = items.get(type);
            items.put(type, (val - quantity) < 0 ? 0 : val - quantity);
        }
        else items.put(type, 0);
    }

    public void setProduct(ProductType type, int quantity) {
        items.put(type, quantity);
    }

    public Integer getProduct(ProductType type) {
        return items.get(type);
    }
}
