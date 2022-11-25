package MetodsAndArrays.StaritTask6;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Student> ourStudents = new ArrayList<>();
        ArrayList<String> theBest = new ArrayList<>();
        ArrayList<String> thePoorest = new ArrayList<>();

        Student s1 = new Student("Spahiev","Ivan",16,9,3.50);
        ourStudents.add(s1);
        Student s2 = new Student("Almishev","Anton",16,9,4.40);
        ourStudents.add(s2);
        Student s3 = new Student("Trampov","Kiril",16,9,5.56);
        ourStudents.add(s3);
        Student s4 = new Student("Ivanov","Georgi",16,9,5.99);
        ourStudents.add(s4);
        Student s5 = new Student("Pramatarov","Mihail",16,9,5.90);
        ourStudents.add(s5);
        Student s6 = new Student("Kolumb","Nikifor",16,9,4.67);
        ourStudents.add(s6);
        Student s7 = new Student("Konstantinov","Asen",16,9,4.40);
        ourStudents.add(s7);
        Student s8 = new Student("Marinov","Niki",16,9,3.05);
        ourStudents.add(s8);
        Student s9 = new Student("Alipiev","Kamen",16,9,2.50);
        ourStudents.add(s9);
        Student s10 = new Student("Nikolov","Georgi",16,9,2.12);
        ourStudents.add(s10);
        Student s11 = new Student("Peshkov","Valentin",16,9,3.20);
        ourStudents.add(s11);
        Student s12 = new Student("Gorsov","Maksim",16,9,5.20);
        ourStudents.add(s12);
        Student s13 = new Student("Almishev","Anton",16,9,5.53);
        ourStudents.add(s13);
        Student s14 = new Student("Almishev","Anton",16,9,4.53);
        ourStudents.add(s14);
        Student s15 = new Student("Almishev","Anton",16,9,3.53);
        ourStudents.add(s15);
        Student s16 = new Student("Almishev","Anton",16,9,2.53);
        ourStudents.add(s16);

        System.out.println(ourStudents);
        System.out.println("-------------------------------------------------------------------------------");

        for (Student stud: ourStudents) {
            stud.isExcellent(theBest);
            stud.isVeryBad(thePoorest);

        }
        System.out.println(theBest);
        System.out.println(thePoorest);

    }
}
