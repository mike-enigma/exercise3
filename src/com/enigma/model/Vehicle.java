package com.enigma.model;

public class Vehicle {

    protected Integer wheel;
    protected Integer numberOfSheat;

    public Vehicle(Integer wheel, Integer numberOfSheat){
        this.wheel=wheel;
        this.numberOfSheat=numberOfSheat;

    }

    public String getType(){
        if(this.wheel ==2 ||this.wheel == 3){
            this.numberOfSheat=2;
            return "Kendaraan berjenis Motor";
        }
        else if(this.wheel >= 4 && this.wheel % 2==0){
            return "Kendaraan berjenis Mobil";
        }
        return "Bukan kendaraan bermotor";
    }

    public String print() {
        return "Vehicle{" +
                "wheel=" + wheel +
                ", numberOfSheat=" + numberOfSheat +
                ", type=" + getType() +
                '}';
    }
}
