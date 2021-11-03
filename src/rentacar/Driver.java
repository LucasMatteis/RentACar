/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacar;

// This line will give you an error until you create the needed class.
import ooc.yoursolution.BookingSystem;

import ooc.yoursolution.BookingSystemInterface;
import ooc.yoursolution.RentACarInterface;
import ooc.enums.Make;
import ooc.enums.Month;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// INCLUDE HERE THE LINK TO THE GIT REPOSITORY AS A COMMENT!!!!
//https://github.com/LucasMatteis/RentACar

// INCLUDE HERE THE FULL NAME AND STUDENT NUMBER OF BOTH TEAM MEMBERS 
// AS A COMMENT!!!!
// Lucas Matteis - 2020495
// Lais Santos - 2020311

/**
 *
 * @author apont
 */
public class Driver {

    /**
     * Do not change the signature of the main method!
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BookingSystemInterface bookingSystem = new BookingSystem();

        String file = "amilcar_rentals.txt";
        BufferedReader in = new BufferedReader(new FileReader(file));

        RentACarInterface rentACar = bookingSystem.setupRentACar(in);

        // Get the name of the car rental
        System.out.println(rentACar.getName());
        
        // Print the number of cars in the rent-a-car
        System.out.println(rentACar.getNumberOfCars());  
        
         
    }

}
