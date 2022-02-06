package com.udacity.edu.rockets;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {

            // create simulation object
            Simulation sim = new Simulation();
            // load fleet of u1 rockets for phase-1
            ArrayList<Rocket> FleetU1 = new ArrayList<Rocket>();
            FleetU1.addAll(sim.loadU1(sim.loadItems("data/phase-1.txt")));
            FleetU1.addAll(sim.loadU1(sim.loadItems("data/phase-2.txt")));
            sim.runSimulation(FleetU1);
            System.out.println("---------------------------------");
            ArrayList<Rocket> FleetU2 = new ArrayList<Rocket>();
            FleetU2.addAll(sim.loadU2(sim.loadItems("data/phase-1.txt")));
            FleetU2.addAll(sim.loadU2(sim.loadItems("data/phase-2.txt")));
            sim.runSimulation(FleetU2);
    }

}
