package MetodsAndArrays.Task1.HW3;

import java.util.Scanner;

public  class Calculator implements AdvancedArithmetic {

    public int divisorSum(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }
}

   class Main{
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

           int n= scanner.nextInt();

           Calculator c1 = new Calculator();

           System.out.println(c1.divisorSum(n));

       }


   }