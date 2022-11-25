package MetodsAndArrays.oop.HwFourTaskOne;

import java.util.Random;

public abstract class Car {
    protected int speed;
    protected double regularPrice;
    protected String color;


    public Car(){

    }

    public Car(int speed,String color,double regularPrice) {
        this.color = color;
        this.speed = speed;
        this.regularPrice= regularPrice;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String ourColor) {
        Random random = new Random();

        String [] colors = {"red","green","yellow","orange","black"};
        int index =  random.nextInt(colors.length);
         ourColor = colors[index];
        this.color =ourColor;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public double setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
        return regularPrice;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    abstract double getSalePrice();

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                '}';
    }
}
