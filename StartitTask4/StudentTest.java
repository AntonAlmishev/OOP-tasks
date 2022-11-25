package MetodsAndArrays.StartitTask4;


public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student("Anton","Almishev",12,6);
        Student s2 = new Student("Ivan","Yanev",11,5);
        Student s3 = new Student("Nikolai","Bogatinov",12,6);
        s1.goToNextClass();
        System.out.println(s1.getSchoolClass());
        s1.goToNextClass();
        System.out.println(s1.getSchoolClass());
        s1.goToNextClass();
        System.out.println(s1.getSchoolClass());
        s1.goToNextClass();
        System.out.println(s1.getSchoolClass());
        s1.goToNextClass();
        s1.goToNextClass();
        s1.goToNextClass();
        s1.goToNextClass();
        s1.increaseAge();
        s1.increaseAge(3);
        System.out.println(s1.toString());
        Student[] ourStudents= {s1,s2,s3};


        }
    }
