package sample.car.BMW;

import java.time.Year;

public class BMWBuilder {

    private BMW BMWCar = new BMW();

    public BMWBuilder setDoorsNumber(int doorsNumber){
        BMWCar.setDoorsNumber(doorsNumber);
        return this;
    }

    public BMWBuilder setHorsePower(int horsePower){
        BMWCar.setHorsePower(horsePower);
        return this;
    }

    public BMWBuilder setModel(String model){
        BMWCar.setModel(model);
        return this;
    }

    public BMWBuilder setNumberPlate(String numberPlate){
        BMWCar.setNumberPlate(numberPlate);
        return this;
    }

    public BMWBuilder setModelYear(Year year){
        BMWCar.setModelYear(year);
        return this;
    }


    public BMW build(){
        return BMWCar;
    }
}
