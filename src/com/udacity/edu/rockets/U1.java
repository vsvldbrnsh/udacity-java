package com.udacity.edu.rockets;

public class U1 extends Rocket{

    public U1() {
        setCost(100);
        setWeight(10000);
        setWeightMax(18000);
        setCurrentWeight(getWeight());
    }

    @Override
    public boolean launch() {
        int random = (int)(Math.random() * 100 + 1);
        setLaunchExplosion(5.0 * (getCurrentWeight() - getWeight()) / (getWeightMax() - getWeight()));
        return getLaunchExplosion() <= random ;
    }

    @Override
    public boolean land() {
        int random = (int)(Math.random() * 100 + 1);
        setLandExplosion(1.0 * (getCurrentWeight() - getWeight()) / (getWeightMax() - getWeight()));
        return  getLandExplosion()<= random ;
    }
}
