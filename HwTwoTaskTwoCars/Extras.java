package MetodsAndArrays.oop.HwTwoTaskTwoCars;

public enum Extras {
    NAVIGATION(500), Automatic(3000), AirConditional(850);

    private final double price;

    public double getPrice() {
        return price;
    }


    Extras(double price) {
        this.price = price;
    }

}
