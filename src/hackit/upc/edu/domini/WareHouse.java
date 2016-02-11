package hackit.upc.edu.domini;

/**
 * Created by Joan on 11/02/2016.
 */
public class Warehouse {
    public Inventory inventory = new Inventory();
    public int puntuation;
    private Point position;

    public Warehouse(Point position) {
        this.position = position;
        puntuation = -1;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}
