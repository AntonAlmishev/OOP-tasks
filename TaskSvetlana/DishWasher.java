package MetodsAndArrays.oop.TaskSvetlana;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class DishWasher {

        private int dishes;
        private int cook;

    public DishWasher(int dishes,int cook) {
        this.dishes=dishes;
        this.cook = cook;

    }

    public int getDishes() {
        return dishes;
    }

    public void setDishes(int dishes) {
        this.dishes = dishes;
    }

    public int getCook() {
        return cook;
    }

    public void setCook(int cook) {
        this.cook = cook;
    }

    public  void wash(Stack<Integer> dishes){
        if(!dishes.isEmpty()) {
            dishes.pop();
            System.out.println(dishes);
        }
        else {
            System.out.println("There are no dirty plates");
        }

    }


}
