package MetodsAndArrays.oop.HwTwoTaskOneShapes;

import java.util.Objects;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    private double angle1;
    private double angle2;
    private double angle3;

    public Triangle() {

    }

    public Triangle(double sideA, double sideB, double sideC,double angle1,double angle2,double angle3) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.angle1=angle1;
        this.angle2=angle2;
        this.angle3=angle3;
    }

    public double getAngle1() {
        return angle1;
    }

    public void setAngle1(double angle1) {
        this.angle1 = angle1;
    }

    public double getAngle2() {
        return angle2;
    }

    public void setAngle2(double angle2) {
        this.angle2 = angle2;
    }

    public double getAngle3() {
        return angle3;
    }

    public void setAngle3(double angle3) {
        this.angle3 = angle3;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public boolean isRightAngledTriangle(){
        if(angle1==90 || angle2 == 90 || angle3 == 90){
            return true;
        }
        return  false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.sideA, sideA) == 0 && Double.compare(triangle.sideB, sideB) == 0 && Double.compare(triangle.sideC, sideC) == 0 && Double.compare(triangle.angle1, angle1) == 0 && Double.compare(triangle.angle2, angle2) == 0 && Double.compare(triangle.angle3, angle3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC, angle1, angle2, angle3);
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ",AreaTriangle=" + getArea() +
                ",AreaTriangle=" + getPerimeter() +
                '}';
    }
}
