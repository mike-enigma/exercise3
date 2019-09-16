package com.enigma.model;

public class Motorcycle extends Vehicle{
    private Integer kickstand;

    public Motorcycle(Integer wheel, Integer numberOfSheat, Integer kickstand){
        super(wheel, numberOfSheat);
        this.kickstand=kickstand;
    }



    public String getType(){
        if(this.wheel ==2 && this.kickstand == 1){
            this.numberOfSheat=2;
            return "Motor jenis biasa";
        }
        else if (this.wheel ==3 && this.kickstand == 0){
            this.numberOfSheat=1;
            return "Motor jenis tosa";
        }
        return "Tidak ada jenis motor";
    }


    public String print() {
        return "Motorcycle{" +
                "wheel= " + wheel +
                ", " + "kickstand= " + kickstand +
                ", " + "number of sheat= " + numberOfSheat +
                ", " + "type= " + getType() +
                '}';
    }
}
