package hackit.upc.edu.domini;

import hackit.upc.edu.presentacio.InputReader;

import java.util.ArrayList;

/**
 * Created by aleix on 11/02/2016.
 */
public class Algorithm {
    public InputReader inputReader;
    private ArrayList<Warehouse> warehouses;
    private ArrayList<Drone> drones;
    private ArrayList<Order> orders;
    private ArrayList<CommandType> commandTypes;
    private int turn;
    private static int maxTurn;

    public Algorithm(InputReader inputReader){
        this.inputReader = inputReader;
        /*warehouses = inputReader;
        drones = inputReader;
        orders = inputReader;
        maxTurn = inputReader;*/
        turn = 0;
        commandTypes = new ArrayList<>();
    }

    public void deliveriesPuntuation(){
        // ha d'assignar a invAlgorithm puntuacions i les ordena
    }

    public void warehousePuntuation(){

    }

    public void Work(){
        while(turn < maxTurn) {
            deliveriesPuntuation();
            warehousePuntuation();
            for (Warehouse w : warehouses){
                int i = 0;
                for(Drone dr : w.drones){
                    Product prod = w.inventory.invAlgorithm.get(i);
                    dr.setCurrentCommandType();
                    commandTypes.add(CommandType.LOAD);

                }
            }

            ++turn;
        }
    }

}
