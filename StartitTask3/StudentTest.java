package MetodsAndArrays.StartitTask3;

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student("Anton","Almishev",12,6);
        Student s2 = new Student("Ivan","Yanev",11,5);
        Student s3 = new Student("Nikolai","Bogatinov",12,6);
        Student[] ourStudents= {s1,s2,s3};
        for (Student s:ourStudents) {
            System.out.println(s.toString());


        }
    }
}
