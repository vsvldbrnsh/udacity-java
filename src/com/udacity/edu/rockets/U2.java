package com.udacity.edu.rockets;

public class U2 extends Rocket{
    public U2() {
        setCost(120);
        setWeight(18000);
        setWeightMax(29000);
        setCurrentWeight(getWeight());
    }

    @Override
    public boolean launch() {
        int random = (int)(Math.random() * 100 + 1);
        setLaunchExplosion(4.0 * (getCurrentWeight() - getWeight()) / (getWeightMax() - getWeight()));
        return getLaunchExplosion() <= random ;
    }

    @Override
    public boolean land() {
        int random = (int)(Math.random() * 100 + 1);
        setLandExplosion(8.0 * (getCurrentWeight() - getWeight()) / (getWeightMax() - getWeight()));
        return  getLandExplosion()<= random ;
    }
}
