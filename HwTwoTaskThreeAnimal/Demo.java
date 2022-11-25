package MetodsAndArrays.oop.HwTwoTaskThreeAnimal;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal a = new Animal();

        Animal b = new Birth();
        Birth parrot = new Parrot();
        Birth piguin = new Piguin();
        Birth seagull = new Seagull();




        Mammal m = new Mammal();
         Dog d = new Dog();
        Cat c = new Cat();

        PetShop shop = new PetShop();


        System.out.println("Welcome in our pet shop.");

        System.out.println("Input a button, please:\n For Birds 1.\n For mammals 2.");
        int n = scanner.nextInt();

            switch (n){
                case 1 :
                    shop.printCatalogue(parrot);
                    break;
                case 2:
                    shop.printCatalogue(m);
                case 3:
                    break;
            }

          ArrayList<Birth> births = new ArrayList<>();
            ArrayList<Mammal> mammals = new ArrayList<>();
        if (n==1){
            int numAnimal = scanner.nextInt();
            while (numAnimal!=4){
                switch (numAnimal){
                    case 1:
                        births.add(parrot);
                        System.out.println("You add parrot");
                        parrot.sing();
                        parrot.walk();
                        parrot.fly();

                        break;
                    case 2:
                        births.add(piguin);
                        System.out.println("You add pinguin");
                        piguin.sing();
                        piguin.fly();
                        piguin.walk();
                        break;
                    case 3:
                        births.add(seagull);
                        System.out.println("You add seagull");
                        seagull.sing();
                        seagull.fly();
                        seagull.walk();

                        break;
                    case 4:
                        break;

                }
                numAnimal = scanner.nextInt();
            }

        }
        else if(n==2){
            int numAnimal = scanner.nextInt();
            while (numAnimal!=3) {
                switch (numAnimal) {
                    case 1:
                        mammals.add(d);
                        System.out.println("You add dog");
                        d.walk();
                        d.bark();
                        break;
                    case 2:
                        mammals.add(c);
                        System.out.println("You add cat");
                        c.walk();
                        c.meow();
                        break;
                    case 3:

                        break;

                }
                numAnimal = scanner.nextInt();

            }

        }

        }

    }
