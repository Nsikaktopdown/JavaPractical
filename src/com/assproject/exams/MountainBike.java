package com.assproject.exams;

public class MountainBike extends Bike {

    public void getHeight(){

    }

    public MountainBike(String name, int gear) {
        super(name, gear);
    }

    public static void main(String[] args) {
        Bike bike = new Bike("generic Bike", 0);
        MountainBike mountainBike = new MountainBike("Mountain Bike", 2);

        MountainBike mike = (MountainBike) new Bike();
        mike.getGear();
        mike.getHeight();


    }
}
