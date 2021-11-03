/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author lucas
 */
public class RentACar implements RentACarInterface{

    private String name;
    private List<CarInterface> carList;

    public RentACar(String name, List<CarInterface> carList) {
        this.name = name;
        this.carList = carList;
    }

    public List<CarInterface> getCarList() {
        return carList;
    }

    public void setCarList(List<CarInterface> carList) {
        this.carList = carList;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
   @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public List<CarInterface> getCars() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfCars() {
        return carList.size();
    }
    
}
