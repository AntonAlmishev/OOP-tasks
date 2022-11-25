package MetodsAndArrays.oop.HwTwoTaskOneShapes;

import java.util.Objects;

public class Square extends Shape implements Comparable<Square>{


   private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(){
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }


    @Override
    public int compareTo(Square o2) {
          if(this.getSide()>o2.getSide()){
              return 1;
          }
          else {
              return -1;
          }

    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    @Override
    public double getArea() {
        return side * side;
    }


    @Override
    public double getPerimeter() {
        return 2*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "SquareArea=" +getArea()+
                "SqarePerimeter="+getPerimeter()+
                "side=" + side +
                '}';
    }
}
