package MetodsAndArrays.StartitTask5;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<School>  ourClasses = new ArrayList<>();
        ArrayList<Student> ourStudents = new ArrayList<>();
        ArrayList<String> ourAbitorients = new ArrayList<>();


        String input = scanner.nextLine();
        while(!input.equalsIgnoreCase("End")){

            String [] array = input.split(",");
            School school = new School("POLK HIGH",11,new Student(array[0],array[1],Integer.parseInt(array[2]),Integer.parseInt(array[3])));
            Student s = new Student(array[0],array[1],Integer.parseInt(array[2]),Integer.parseInt(array[3]) );
            if(array[2].equals("12")){
                ourAbitorients.add(array[0]);
            }
            ourStudents.add(s);
            ourClasses.add(school);

            input = scanner.nextLine();


        }


        System.out.println("Our abitorients are: "+ourAbitorients);

        for (Student ourStudent : ourStudents) {
            ourStudent.goToNextClass();
        }

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("------------------------------------------------------------------------------------");

        System.out.println(ourClasses);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(ourStudents);



    }


}
