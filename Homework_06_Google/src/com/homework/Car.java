package com.homework;

public class Car {

    private String carModel;
    private String carSpeed;

public Car(String model, String speed) {
    this.carModel = model;
    this.carSpeed = speed;
}


    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(String carSpeed) {
        this.carSpeed = carSpeed;
    }


}
