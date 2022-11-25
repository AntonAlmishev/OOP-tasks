package MetodsAndArrays.oop.TaskSvetlana;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Queue<Integer> chef = new ArrayDeque<>();
        Stack<Integer> dish = new Stack<>();
        for (int i = 1; i <=5 ; i++) {
            DishWasher d = new DishWasher(i,i);
            d.wash(dish);
            chef.add(d.getDishes());
            dish.push(d.getCook());
        }

        System.out.println(chef);
        System.out.println(dish);










    }
}
