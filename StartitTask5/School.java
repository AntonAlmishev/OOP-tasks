package MetodsAndArrays.StartitTask5;

import java.util.ArrayList;

public class School {

   private String name;
   private int classes ;
   private ArrayList<String> students = new ArrayList<>();


   public School(String name, int classes, Student students) {
      this.name = name;
      this.classes = classes;
      this.students=students;

   }


   public int getClasses() {
      return classes;
   }

   public void setClasses(int classes) {
      this.classes = classes;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public ArrayList<String> getStudents() {
      return students;
   }

   public void setStudents(ArrayList<String> students) {
      this.students = students;
   }



   @Override
   public String toString() {
      return "\nSchool{" +
              "name='" + name + '\'' +
              ", classes=" + classes +
              ", students=" + students +
              '}';
   }
}
