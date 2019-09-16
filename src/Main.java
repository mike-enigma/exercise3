import com.enigma.model.Car;
import com.enigma.model.Motorcycle;
import com.enigma.model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in) );

        System.out.print("Input Wheel : ");
        Integer wheel= Integer.parseInt(reader.readLine());

       System.out.print("Input numberOfSheat : ");
        Integer numberOfSheat=Integer.parseInt(reader.readLine());

        System.out.print("Input Door : ");
        Integer door= Integer.parseInt(reader.readLine());

        Vehicle kendaraan= new Vehicle(wheel,numberOfSheat);
        System.out.println(kendaraan.print());

        Car car=new Car(wheel,numberOfSheat,door);
        System.out.println(car.print());

        System.out.print("Input Kickstand : ");
        Integer kickstand=Integer.parseInt(reader.readLine());
        Motorcycle motor=new Motorcycle(wheel,numberOfSheat, kickstand);
        System.out.println(motor.print());



    }
}
