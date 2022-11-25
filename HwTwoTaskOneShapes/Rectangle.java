package MetodsAndArrays.oop.HwTwoTaskOneShapes;

import java.util.Objects;

public class Rectangle extends Shape implements Comparable{
    private double width;
    private double high;

    public Rectangle(double width,double high) {
        this.width = width;
        this.high = high;
    }
    public Rectangle(){

    }
    public double getMaxPossibleSquareInside() {
        if (width == high) {
            return high;
        }
        else if(width<high){
            return width;
        }
        else {
            return high;
        }

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.high, high) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, high);
    }

    @Override
    public double getArea() {
        return width*high;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+high);

    }

    @Override
    public String toString() {
        return "Rectangle{" +

                "width=" + width +
                ", high=" + high +
                ",ReArea="+getArea()+
                ",RePerimeter="+getPerimeter()+
                '}';
    }
}
