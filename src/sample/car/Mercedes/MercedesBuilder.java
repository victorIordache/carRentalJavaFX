package sample.car.Mercedes;

import java.time.Year;

public class MercedesBuilder {

    private MercedesBenz mercedesBenzCar = new MercedesBenz();

    public MercedesBuilder setDoorsNumber(int doorsNumber){
        mercedesBenzCar.setDoorsNumber(doorsNumber);
        return this;
    }

    public MercedesBuilder setHorsePower(int horsePower){
        mercedesBenzCar.setHorsePower(horsePower);
        return this;

    }

    public MercedesBuilder setModel(String model){
        mercedesBenzCar.setModel(model);
        return this;
    }

    public MercedesBuilder setNumberPlate(String numberPlate){
        mercedesBenzCar.setNumberPlate(numberPlate);
        return this;
    }

    public MercedesBuilder setModelYear(Year year){
        mercedesBenzCar.setModelYear(year);
        return this;
    }


    public MercedesBenz build(){
        return mercedesBenzCar;
    }
}
