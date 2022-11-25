package MetodsAndArrays.oop.HwFourTaskOne;

public class Truck extends Car {

   double weight;

   public Truck(){

   }


    public Truck(int speed, String color, double regularPrice, double weight) {
        super(speed, color, regularPrice);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        if(weight>2000){
            regularPrice=regularPrice*0.9;
        }
        else {
            regularPrice= regularPrice*0.80;
        }
        return   regularPrice;
    }

}

