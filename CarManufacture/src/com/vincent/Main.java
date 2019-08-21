package com.vincent;

public class Main {

    static Car nissan = new Car(4, 6, "GTR");
    static Car nissan1400 = new Car(2, 4, "1400");
    static Car nissanSentra = new Car(4, 6, "Sentra");

//    manufacturing sports cars

    static BetterCar nissanGTRT = new BetterCar(4, 3, true, 4,
            "GTRT", 6, 4);



    public static void main(String[] args) {






//            startEngine();

        System.out.println("Speed before accelaration: " + nissan1400.speed + " \n");

        nissan1400.accelerate();
        nissan1400.accelerate();
        nissan1400.accelerate();
        nissan1400.accelerate();

        System.out.println("Speed after accelaration: " + nissan1400.speed + "\n");

        System.out.println("GTRT Speed before accelaration: " + nissanGTRT.speed + " \n");

        nissanGTRT.accelerate();
        nissanGTRT.accelerate();
        nissanGTRT.accelerate();
        nissanGTRT.accelerate();

        System.out.println("GTRT Speed after accelaration: " + nissanGTRT.speed);

//        carAssembling();

//        System.out.println("the car is a Nissan and it has: " + nissan.windows + " windows "
//                + nissan.doors + " doors " + "its model is: " + nissan.model + " & " + nissan.tyres + " tyres");
//
//        System.out.println("Printing second car \n");
//
//        System.out.println("the car is a Nissan and it has: " + nissan1400.windows + " windows "
//                + nissan1400.doors + " doors " + "its model is: " + nissan1400.model + " & "
//                + nissan1400.tyres + " tyres");
//
//        System.out.println("Printing third car \n");
//
//        System.out.println("the car is a Nissan and it has: " + nissanSentra.windows + " windows "
//                + nissanSentra.doors + " doors " + "its model is: " + nissanSentra.model + " & "
//                + nissanSentra.tyres + " tyres");

    }


    public static void startEngine(){
        nissanSentra.startEngine();
        nissan.startEngine();
        nissanGTRT.startEngine();
        nissan1400.startEngine();
    }

//    public static void carAssembling(){
////        Assembling GTR
//        nissan.doors =4;
//        nissan.model = "GTR";
//        nissan.windows = 6;
//
////        Assembling 1400
//
//        nissan1400.tyres =4;
//        nissan1400.windows =4;
//        nissan1400.model = "1400";
//        nissan1400.doors = 2;
//    }


}
