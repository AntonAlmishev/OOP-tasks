package MetodsAndArrays.PhoneBook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneBook {

    private Map<String,String> phoneBook;

    public Map<String, String> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(Map<String, String> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public PhoneBook(Map<String, String> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public  void addSomebody(Scanner scanner, Map<String, String> phoneBook) {
        String input = scanner.nextLine();
        if (input.length() > 26 || input.length()<1) {
            throw new ErrorStringException("The contact have to be less 26 symbols and bigger then null");
        }
        if(phoneBook.size()>=3){
            throw new PhoneBookFullException("The memory is full, if ypu want add some contact, you have to delete other.");
        }

        String [] array= input.split("-");

        phoneBook.put(array[0],array[1]);

    }


    public  void printNewLine(Map<String, String> ourMap) {
        for (String i: ourMap.keySet()) {
            System.out.print(i + "\t" + "- ");
            System.out.println(ourMap.get(i));
        }

    }
    public  void getAllNamesStartingWith(HashMap<String, String> fun) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете низ:");
        String str= scanner.nextLine();

        List<String> names = fun.keySet()
                        .stream()
                         .collect(Collectors.toList());
        if(names.contains(str)) {
            names.stream()
                    .filter(name -> name.startsWith(str))
                    .sorted().forEach(name -> System.out.println(name));
        }
        else {
            throw new EntryNotFoundException("There are nothing starting with "+str);
        }



    }
}
