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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductType)) return false;

        ProductType that = (ProductType) o;

        return ID == that.ID;

    }

    @Override
    public int hashCode() {
        int result = ID;
        result = 31 * result + weight;
        return result;
    }
}
