package hackit.upc.edu.domini;

/**
 * Created by Joan on 11/02/2016.
 */
public class Drone {

    private static int maxLoad = 0;
    private int ID;
    private Inventory inventory;
    private Point position = new Point();
    private CommandType currentCommandType = CommandType.WAIT;

    public Drone() {
        this.ID = -1;
        this.inventory = new Inventory();
    }

    public Drone(int ID) {
        this.ID = ID;
        this.inventory = new Inventory();
    }

    public Drone(int ID, Point pos) {
        this.ID = ID;
        this.position = pos;
        this.inventory = new Inventory();
        inventory = new Inventory();
    }
    public Drone(int ID, Point pos, Inventory inventory) {
        this.ID = ID;
        this.position = pos;
        this.inventory = inventory;
    }

    public static int getMaxLoad() {
        return maxLoad;
    }

    public static void setMaxLoad(int value) {
        maxLoad = value;
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
