package MetodsAndArrays.StartitTask3;

public class Student {
    private String lastName;
    private String firstName;
    int age;
    int schoolClass;

    public Student(String lastName,String firstName,int age,int schoolClass) {
        this.lastName =lastName;
        this.firstName=firstName;
        this.age = age;
        this.schoolClass=schoolClass;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(int schoolClass) {
        this.schoolClass = schoolClass;
    }

    @Override
    public String toString() {

        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", schoolClass=" + schoolClass +
                '}';

    }
}
