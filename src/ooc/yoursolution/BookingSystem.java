/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ooc.enums.Make;

/**
 *
 * @author lucas
 */
public class BookingSystem implements BookingSystemInterface{

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        List<CarInterface> cars = new ArrayList<>();
        
        String line = in.readLine();
        String name = line;
        
           while((line = in.readLine()) != null){

        String [] car = line.split(":");
        Make make = Make.valueOf(car[0]);
        double price = Double.parseDouble(car[1]);
        int quantity = Integer.parseInt(car[2]);
        
        for(int i = 0; i < quantity; i++){
           cars.add(new Car(make,price, i));
       }

      }
                
        
        return new RentACar(name, cars);
    }
    
}
