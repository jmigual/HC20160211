package hackit.upc.edu.domini;

import java.util.HashMap;

/**
 * Created by Joan on 11/02/2016.
 */
public class Drone {

    private static int capacity = 0;
    private HashMap<ProductType, Integer> inventory = new HashMap<>();
    private Point position = new Point();
    private Command currentCommand = Command.WAIT;

    public Drone() {

    }

    public Drone(Point pos) {
        this.position = pos;
    }

    public static void setCapacity(int value) {
        capacity = value;
    }

    public void addToInventory()
}
