package hackit.upc.edu.domini;

/**
 * Created by Joan on 11/02/2016.
 */
public class Drone {

    private static int capacity = 0;
    private Inventory inventory;
    private Point position = new Point();
    private CommandType currentCommandType = CommandType.WAIT;

    public Drone() {
        this.inventory = new Inventory();
    }

    public Drone(Point pos) {
        this.position = pos;
        this.inventory = new Inventory();
        inventory = new Inventory();
    }
    public Drone(Point pos, Inventory inventory) {
        this.position = pos;
        this.inventory = inventory;
    }

    public static int getCapacity() {
        return capacity;
    }

    public static void setCapacity(int value) {
        capacity = value;
    }

    public CommandType getCurrentCommandType() {
        return currentCommandType;
    }

    public void setCurrentCommandType(CommandType currentCommandType) {
        this.currentCommandType = currentCommandType;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
