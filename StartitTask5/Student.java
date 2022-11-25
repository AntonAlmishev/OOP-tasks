package MetodsAndArrays.StartitTask5;

import java.util.ArrayList;

public class Student extends ArrayList<String> {

    private String lastName;
    private String firstName;
    int age;
    int schoolClass;
    final static int totalStudent=100;


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
    public void increaseAge(){
        age++;
    }
    public void increaseAge(int years){
        age = age+years;

    }
    public void goToNextClass(){
          increaseAge();
        if(schoolClass<12) {
            schoolClass++;
        }
        else{
            System.out.println("Йееее, завърпих :) !!");
        }

    }


    @Override
    public String toString() {

        return "\nStudent{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", schoolClass=" + schoolClass +
                '}';

    }
}
