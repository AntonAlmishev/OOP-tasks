package MetodsAndArrays.oop.BorderControl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
     //   List<String> ids = new ArrayList<>();
        HashMap<String,Identifiable> map = new HashMap<>();



        String inputLine = scanner.nextLine();

        while(!inputLine.equals("End")){
            String [] array = inputLine.split(" ");
            if(array.length ==2){
             //    ids.add(array[1]);
                 map.put(array[1], new Robot(array[1],array[0]));
            } else {
             //    ids.add(array[2]);
                 map.put(array[2], new Citizien(array[2],array[0],Integer.parseInt(array[1]) ) );

            }
            inputLine = scanner.nextLine();


        }
        String faceIdEndingNum= scanner.nextLine();

     //   ids.stream().filter(s -> s.endsWith(faceIdEndingNum)).forEach(s -> System.out.println(s));

        map.keySet().stream().filter(s -> s.endsWith(faceIdEndingNum)).forEach(s -> System.out.println(s));

    }
}
