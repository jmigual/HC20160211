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
    private ArrayList<Command> commands;
    private int turn;
    private static int maxTurn;

    public Algorithm(InputReader inputReader){
        this.inputReader = inputReader;
        /*warehouses = inputReader;
        drones = inputReader;
        orders = inputReader;
        maxTurn = inputReader;*/
        turn = 0;
        commands = new ArrayList<>();
    }

    public void deliveriesPuntuation(){

    }

    public void Work(){
        while(turn < maxTurn) {


            ++turn;
        }
    }

}
