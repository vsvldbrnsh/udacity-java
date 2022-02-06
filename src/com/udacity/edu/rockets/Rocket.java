package com.udacity.edu.rockets;

import java.util.ArrayList;

public class Rocket implements SpaceShip {
    private Integer cost;
    private Integer weight;
    private Integer currentWeight;
    private Integer weightMax;
    private double launchExplosion;
    private double landExplosion;
    ArrayList<Item> cargoContainer;

    public double getLaunchExplosion() {
        return launchExplosion;
    }

    public void setLaunchExplosion(double launchExplosion) {
        this.launchExplosion = launchExplosion;
    }

    public double getLandExplosion() {
        return landExplosion;
    }

    public void setLandExplosion(double landExplosion) {
        this.landExplosion = landExplosion;
    }

    public Integer getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(Integer currentWeight) {
        this.currentWeight = currentWeight;
    }

    public ArrayList<Item> getCargoContainer() {
        return cargoContainer;
    }

    public void setCargoContainer(ArrayList<Item> cargoContainer) {
        this.cargoContainer = cargoContainer;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeightMax() {
        return weightMax;
    }

    public void setWeightMax(Integer weightMax) {
        this.weightMax = weightMax;
    }

    public Rocket(){
        cargoContainer = new ArrayList<Item>();
        setLaunchExplosion(0.0);
        setLandExplosion(0.0);
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    private void updateWeight(Integer weight){
        setCurrentWeight(getCurrentWeight()+weight);
    }

    @Override
    final public boolean canCarry(Item item) {
        if(getCurrentWeight() + item.getWeight() <= getWeightMax()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    final public void carry(Item item) {
        if(canCarry(item)){
            updateWeight(item.getWeight());
            cargoContainer.add(item);
        }
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "cost=" + cost +
                ", weight=" + weight +
                ", currentWeight=" + currentWeight +
                ", weightMax=" + weightMax +
                ", cargoContainer=" + cargoContainer +
                '}';
    }
}
