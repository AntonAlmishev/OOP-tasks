package MetodsAndArrays.oop.HwFourTaskOne;

public class MyOwnAutoShop {

    public static void main(String[] args) {
        Car s1 = new Sedan(200,"red",40000,5);
        Car f1 = new Ford(190,"black",30000,1000,2015);
        Car f2 = new Ford(180,"black",20000,500,2013);
        Car t1 = new Truck(150,"white",80000,7000);

        Car [] array = {s1,f1,f2,t1};
        for (Car ourCars : array) {
            System.out.println(ourCars.getSalePrice());

        }
    }
}
