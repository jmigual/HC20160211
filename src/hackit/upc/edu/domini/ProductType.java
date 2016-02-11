package hackit.upc.edu.domini;

/**
 * Created by Joan on 11/02/2016.
 */
public class ProductType {
    private int ID;
    private int weight;

    public ProductType(int ID, int weight) {
        this.ID = ID;
        this.weight = weight;
    }

    public int getID() {
        return ID;
    }

    public int getWeight() {
        return weight;
    }
}
