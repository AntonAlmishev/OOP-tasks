package MetodsAndArrays.oop.HwFourTaskOne;

public class Ford extends Car{

  private int year;
  private double manufacturerDiscount;



    public Ford(int speed, String color, double regularPrice, double manufacturerDiscount, int year) {
        super(speed, color, regularPrice);
        this.manufacturerDiscount = manufacturerDiscount;
        this.year = year;
    }



    @Override
    double getSalePrice() {
         return  regularPrice-manufacturerDiscount;
    }

}
