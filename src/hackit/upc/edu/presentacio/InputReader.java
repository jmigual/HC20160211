package hackit.upc.edu.presentacio;

import hackit.upc.edu.Exceptions.InvalidFormatException;
import hackit.upc.edu.domini.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Joan on 11/02/2016.
 */
public class InputReader {

    private ArrayList<Warehouse> warehouses = new ArrayList<>();
    private ArrayList<Drone> drones = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<ProductType> productTypes = new ArrayList<>();
    private int deadline;

    public InputReader(String path) throws FileNotFoundException, InvalidFormatException {
        Scanner in = new Scanner(new FileReader(path));
        read(in);
    }

    public ArrayList<ProductType> getProductTypes() {
        return productTypes;
    }

    public int getDeadline() {
        return deadline;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public ArrayList<Warehouse> getWarehouses() {
        return warehouses;
    }

    public ArrayList<Drone> getDrones() {
        return drones;
    }

    public void read(Scanner in) throws InvalidFormatException {
        Point.setLimits(in.nextInt(), in.nextInt());
        int dron = in.nextInt();
        for (int i = 0; i < dron; ++i) {
            drones.add(new Drone(i));
        }
        deadline = in.nextInt();
        Drone.setMaxLoad(in.nextInt());

        // Load Products
        int prodNumber = in.nextInt();
        for (int i = 0; i < prodNumber; ++i) {
            productTypes.add(new ProductType(i, in.nextInt()));
        }

        // Load Warehouses
        int wareNumber = in.nextInt();
        for (int i = 0; i < wareNumber; ++i) {
            try {
                Point pos = new Point(in.nextInt(), in.nextInt());
                Warehouse warehouse = new Warehouse(pos);

                HashMap<ProductType, Integer> inventory = new HashMap<>();
                for (int j = 0; j < prodNumber; ++j) {
                    inventory.put(productTypes.get(j), in.nextInt());
                }
                warehouse.inventory.setAll(inventory);
                warehouses.add(warehouse);

            } catch (Exception e) {
                e.printStackTrace();
                throw new InvalidFormatException();
            }
        }

        int ordersNumber = in.nextInt();
        for (int i = 0; i < ordersNumber; ++i) {
            try {
                Point pos = new Point(in.nextInt(), in.nextInt());
                Inventory inventory = new Inventory();
                int inventoryCount = in.nextInt();
                for (int j = 0; j < inventoryCount; ++j) {
                    inventory.addProduct(new ProductType(in.nextInt(),0));
                }
                Order order = new Order(pos, inventory);
                orders.add(order);
            } catch (Exception e) {
                e.printStackTrace();
                throw new InvalidFormatException();
            }
        }
    }

}
