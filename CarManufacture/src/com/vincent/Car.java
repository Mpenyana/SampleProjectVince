package com.vincent;

public class Car {

    int doors;
    int windows;
    String model;
    int tyres;

    int speed;

    Car(int doors, int windows, String model){
        this.doors = doors;
        this.windows = windows;
        this.model = model;
        this.tyres = 4;
    }

    public void startEngine(){
        System.out.println("You start engine using a key" + " in a " + this.model );
    }

    public void accelerate(){
        speed += 30;
    }

}
