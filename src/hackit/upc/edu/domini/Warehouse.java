package hackit.upc.edu.domini;

import java.util.ArrayList;

/**
 * Created by Joan on 11/02/2016.
 */
public class Warehouse {
    public Inventory inventory;
    private Point position;
    public int puntuation;
    public ArrayList<Drone> drones;

    public Warehouse(Point position) {
        this.position = position;
        puntuation = -1;
        drones = new ArrayList<>();
        inventory = new Inventory();
    }
}
