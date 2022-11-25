package MetodsAndArrays.oop.HwTwoTaskOneShapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ShapesTest {
    public static void main(String[] args) {


        Shape c = new Circle(4);
        Shape t = new Triangle(5,6,7,90,60,30);
        Square s = new Square(5);
        Square s1 = new Square(7);
        Square s2 = new Square(8);
        Square s3 = new Square(4);
        Square s4 = new Square(7);
        Shape r = new Rectangle(5,6);






        TreeSet<Square> shapesTree = new TreeSet<>();
                       shapesTree.add(s1);
                       shapesTree.add(s2);
                       shapesTree.add(s3);
                       shapesTree.add(s);
                       shapesTree.add(s4);
        for (Square sq: shapesTree) {
            System.out.println( sq.getPerimeter());

        }
        System.out.println(shapesTree);
                       /*

                        */
        List<Square> shapeList= new ArrayList<>();
                    shapeList.add(s1);
                    shapeList.add(s2);
                    shapeList.add(s3);
                    shapeList.add(s);
                    shapeList.add(s4);
        Collections.sort(shapeList);
        System.out.println(shapeList);

/*
      for(int i = 0; i< shapesTree.size();i++){
          System.out.println( shapesTree.contains(i));
      }

        for (Shape shape : shapeList) {

            shape.getPerimeter();

        }

         */









        /*

        Shape [] array = {c,t,s,r};



        for (Shape shape : array) {

            if(shape instanceof Circle) {
                System.out.printf("Кръг с радиус: %.2f и диаметр %.2f\n",((Circle) shape).getRadius(),((Circle) shape).getDiameter());
            }
            else if(shape instanceof Rectangle){
                System.out.printf("Правоъгълник с височина %.2f и широчина %.2f\nСтраната на най-големия квадрат който се събира в правоъгълника е: %.2f",((Rectangle) shape).getHigh(),((Rectangle) shape).getWidth(),
                        ((Rectangle) shape).getMaxPossibleSquareInside());
            } else if (shape instanceof Square) {
                System.out.println("Квадрат");
            }
            else if (shape instanceof Triangle){
                if(((Triangle) shape).isRightAngledTriangle()){
                System.out.printf("Правоъгълен/Тъпоъгълен Триъгълник със страни %.2f,%.2f,%.2f, и ъгли %.2f, %.2f, %.2f.\n",
                        ((Triangle) shape).getSideA(), ((Triangle) shape).getSideB(),((Triangle) shape).getSideC(),
              ((Triangle) shape).getAngle1(),((Triangle) shape).getAngle2(),((Triangle) shape).getAngle3()  );
            }
                else {
                    System.out.printf("Правоъгълен/Тъпоъгълен/Остроъгълен Триъгълник със страни %.2f,%.2f,%.2f, и ъгли %.2f, %.2f, %.2f.\n",
                            ((Triangle) shape).getSideA(), ((Triangle) shape).getSideB(),((Triangle) shape).getSideC(),
                            ((Triangle) shape).getAngle1(),((Triangle) shape).getAngle2(),((Triangle) shape).getAngle3()  );
                }
                }
            }

*/

        }


    }


