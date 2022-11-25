package MetodsAndArrays.PhoneBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        Map <String, String> phoneBook = new HashMap<>();
        PhoneBook book = new PhoneBook(phoneBook);
        printMenu();
        Options(scanner, phoneBook, book);
    }












    private static void Options(Scanner scanner, Map<String, String> phoneBook, PhoneBook book)  {

        try {

            int choice = Integer.parseInt(scanner.nextLine());

            while (choice != 5) {
                switch (choice) {
                    case 1:
                        try {
                            System.out.println("Въведете име-номер");
                            book.addSomebody(scanner, phoneBook);
                            break;
                        } catch (ErrorStringException e) {
                            System.out.println(e.getMessage());
                        }

                    case 2:
                        try {
                            String string = scanner.nextLine();
                            if (phoneBook.containsKey(string)) {
                                phoneBook.remove(string);

                            } else {
                                throw new EntryNotFoundException("There are no record " + string);
                            }
                        } catch (EntryNotFoundException e){
                            System.out.println(e.getMessage());
                        }
                         break;

                    case 3:
                        try {
                            book.getAllNamesStartingWith((HashMap<String, String>) phoneBook);
                        }
                       catch (EntryNotFoundException e){
                           System.out.println(e.getMessage());
                       }


                        //  System.out.println(phoneBook.containsKey(str));
                        // System.out.println(phoneBook.get(str));


                        break;
                    case 4:
                        System.out.println("Това е вашият телефонен указател:");
                        book.printNewLine(phoneBook);
                        break;
                    case 5:

                        break;

                }

                printMenu();
                choice = Integer.parseInt(scanner.nextLine());

            }
        }
        catch (NumberFormatException e){
            System.out.println("Invalid digit "+e.getMessage());
        }
    }

    private static void printMenu() {
        System.out.println("Изберете опция:\n1. Добави нов запис\n2. Изтрий запис по номер\n3. Покажи всички записи които започват с низ\n4. Принтирай указателят\n5. Изход");
    }
}
