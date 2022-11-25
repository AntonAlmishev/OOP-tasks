package MetodsAndArrays.oop.HwFourTaskOne;

public class Sedan extends Car{

    double length;

    public Sedan(){

    }

    public Sedan(int speed, String color, double regularPrice, double length) {
        super(speed, color, regularPrice);
        this.length = length;
    }


    @Override
    double getSalePrice() {
        if (length>6.5){
            return regularPrice*0.95;
        }
        else {
            return regularPrice*0.90;
        }
    }
}
