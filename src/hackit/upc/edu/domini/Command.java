package hackit.upc.edu.domini;

/**
 * Created by aleix on 11/02/2016.
 */
public class Command {
    public Point destination;
    public Warehouse warehouseDestination;
    public CommandType commandType;
    public Inventory inventory;

    public Command(Point destination, Warehouse warehouseDestination, CommandType commandType, Inventory inventory){
        this.destination = destination;
        this.warehouseDestination = warehouseDestination;
        this.commandType = commandType;
        this.inventory = inventory;
    }
}
