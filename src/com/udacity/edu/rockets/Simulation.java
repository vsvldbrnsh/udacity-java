package com.udacity.edu.rockets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    public ArrayList<Item> loadItems(String filename){
        ArrayList<Item> cargo = new ArrayList<Item>();
        try{
            File file = new File(filename);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Item itemObj = new Item(data.split("=")[0],  Integer.parseInt(data.split("=")[1]));
                cargo.add(itemObj);
            }
        }catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return cargo;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> cargo){
        ArrayList<Rocket> fleet = new ArrayList<Rocket>();
        Rocket rocketU1 = new U1();
        for(Item item:cargo){
            while(!rocketU1.canCarry(item)){
                fleet.add(rocketU1);
                rocketU1 = new U1();
            }
            rocketU1.carry(item);
        }
        fleet.add(rocketU1);
        return fleet;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> cargo){
        ArrayList<Rocket> fleet = new ArrayList<Rocket>();
        Rocket rocketU2 = new U2();
        for(Item item:cargo){
            while(!rocketU2.canCarry(item)){
                fleet.add(rocketU2);
                rocketU2 = new U2();
            }
            rocketU2.carry(item);
        }
        fleet.add(rocketU2);
        return fleet;
    }


    /*
    * runSimulation: this method takes an ArrayList of Rockets and calls:
    *   - launch and
    *   - land methods for each of the rockets in the ArrayList.
    * Every time a rocket explodes or crashes (i.e if launch or land return false) it will have to send that rocket again.
    * All while keeping track of the total budget required to send each rocket safely to Mars.
    * runSimulation then returns the total budget required to send all rockets (including the crashed ones).
    * */
    public void runSimulation(ArrayList<Rocket> fleet){
        int crashed=0;
        for(Rocket rocket: fleet){
            if(!rocket.launch() && rocket.land())
                crashed++;
        }
        System.out.println(fleet.getClass() +" for both phases had to launched "
                + (crashed+fleet.size()) + "rockets\n"
                +"total budget is: " +(crashed+fleet.size())*fleet.get(0).getCost()+"$ mln");
    }
}
