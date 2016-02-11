package hackit.upc.edu.domini;

/**
 * Created by aleix on 11/02/2016.
 */
public class Order{
    private Point destination;
    public Inventory inventory;

    public Order(Point destination, Inventory inventory){
        this.destination = destination;
        this.inventory = inventory;
    }

    public Point getDestination(){
        return destination;
    }

    public void setDestination(Point d){
        destination = d;
    }
}
