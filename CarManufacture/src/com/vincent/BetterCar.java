package com.vincent;

public class BetterCar extends Car {

//    extras
    int seats;
    boolean engine;
    int mirrors;
    int exhausts;

    BetterCar(int seats, int mirrors, boolean engine, int exhausts, String model, int windows,
              int doors){
        super(doors, windows, model );
    }

    public  void startEngine(){
        System.out.println("Start engine with a button" + this.model);
    }

    @Override
    public void accelerate() {
        speed +=60;
    }
}
