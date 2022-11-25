package MetodsAndArrays.oop.ImplementStack;

public class Main {
    public static void main(String[] args) {

       Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.getSize();
        s.push(30);
        s.push(40);
        s.push(60);
        s.push(70);
        s.push(80);
        s.getSize();
        System.out.println(s.isFull());
        s.showAllElements();
    }

}
