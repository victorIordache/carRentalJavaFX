package sample.car;

import java.time.Year;
import java.util.Date;

public abstract class Car {

    private int carID;
    private int doorsNumber;
    private int horsePower;
    private String manufacturer;
    private String model;
    private String numberPlate;
    private boolean isRented;
    private Year modelYear;
    private Date rentedFrom;
    private Date rentedUntill;

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public Year getModelYear() {
        return modelYear;
    }

    public void setModelYear(Year modelYear) {
        this.modelYear = modelYear;
    }

    public Date getRentedFrom() {
        return rentedFrom;
    }

    public void setRentedFrom(Date rentedFrom) {
        this.rentedFrom = rentedFrom;
    }

    public Date getRentedUntill() {
        return rentedUntill;
    }

    public void setRentedUntill(Date rentedUntill) {
        this.rentedUntill = rentedUntill;
    }
}
