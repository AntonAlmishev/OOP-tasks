package MetodsAndArrays.StaritTask6;

import java.util.ArrayList;

public class Student {
    private String lastName;
    private String firstName;
    private int age;
    private int schoolClass;

    private double averageGrade;


    public Student(String lastName,String firstName,int age,int schoolClass,double averageGrade) {
        this.lastName =lastName;
        this.firstName=firstName;
        this.age = age;
        this.schoolClass=schoolClass;
        this.averageGrade=averageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        if(averageGrade>=2&&averageGrade<=6) {
            this.averageGrade = averageGrade;
        }
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


     public ArrayList<String> isExcellent(ArrayList<String> excellentStudents){
         ;
        if(averageGrade>5.49){

            excellentStudents.add(this.lastName);
        }
        return excellentStudents;
     }
    public ArrayList<String> isVeryBad(ArrayList<String> veryBadStudents){
        if(averageGrade<3.00){

            veryBadStudents.add(this.lastName);
        }
        return veryBadStudents;
    }


    @Override
    public String toString() {

        return "\nStudent{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", schoolClass=" + schoolClass +
                ". averageGrade="+getAverageGrade()+
                '}';

    }
}
