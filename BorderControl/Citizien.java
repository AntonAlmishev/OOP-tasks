package MetodsAndArrays.oop.BorderControl;

public class Citizien implements  Identifiable {
    private String id;
    private String name;
    private int age;

    public Citizien(String name,String id,int age) {
        this.name = name;
        this.id=id;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
