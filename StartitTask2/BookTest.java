package MetodsAndArrays.StartitTask2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int option = Integer.parseInt(scanner.nextLine());
        ArrayList<Book> ourBooks = new ArrayList<>();
        while(option!=2){
            System.out.println("Въведете автор,заглавие,ISBN,брой страници,издателство,цена");
            String input = scanner.nextLine();
            String[] array = input.split(",");
            Book b = new Book(array[0],array[1],array[2],Integer.parseInt(array[3]),array[4],Integer.parseInt(array[5]));
            ourBooks.add(b);
            System.out.println("1. Да въведе книга, или 2. Изход.");
            option = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Общия брой книги е " +Book.countBooks);
        System.out.println(ourBooks);



    }

    public static void printMenu(){
        System.out.println("Моля изберете опция:");
        System.out.println("1. Да въведе книга, или 2. Изход.");

    }
}
