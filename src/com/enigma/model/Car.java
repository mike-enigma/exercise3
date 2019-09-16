package com.enigma.model;

public class Car extends Vehicle{
    private Integer door;

    public Car(Integer wheel, Integer numberOfSheat, Integer door){
        super (wheel, numberOfSheat);
        this.door=door;
    }

    public void getWheel(Integer wheel){
        this.wheel=wheel;
    }

    public void getDoor(Integer door){
        this.door=door;
    }

    public String getType(){
        if(this.wheel==6 && this.door==2){
            this.numberOfSheat = 2;
            return "Mobil berjenis Mobil Truk";
        }
        else if(this.wheel==4 && this.door==3){
            this.numberOfSheat = 12;
            return "Mobil berjenis Angkot";
        }
        else if(this.wheel==4 && this.door==4){
            this.numberOfSheat = 6;
            return "Mobil berjenis pribadi";
        }
        else if(this.wheel==4 && this.door==2){
            this.numberOfSheat = 2;
            return "Mobil berjenis Sport";
        }
        return "Bukan jenis Mobil";

    }



    public String print() {
        return "Car{" +
                "wheel= " + wheel +
                ", " + "door= " + door +
                ", " + "number of sheat= " + numberOfSheat +
                ", " + "type= " + getType() +
                '}';
    }
}
