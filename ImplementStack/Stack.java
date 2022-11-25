package MetodsAndArrays.oop.ImplementStack;

public class Stack {

    private int maxSize = 5;
    private int [] stackArray = new int[maxSize];
    private int top = -1;

    public void push(int x){
        if(isFull()){
            int [] newStackArray = new int[maxSize*maxSize ];
            newStackArray= stackArray;
        }
        else {
            top++;
            stackArray[top] = x;
            System.out.println("Element pushed in the stack is: " + x);
        }

    }

   public void pop() {
       if (isEmpty()) {
           System.out.println("The stack is empty!");
       } else {
           int x = stackArray[top--];
           System.out.println("Element popped from stack is: " + x);

       }
   }

   public int peek(){
        int x = stackArray[top];
        return x;
   }

   public void showAllElements (){
       for (int i = 0; i <=top ; i++) {
           System.out.print(stackArray[i]+" ");

       }

   }
   public void getSize(){
       System.out.println("The size is: "+(1+top));
   }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {

        return (top == maxSize - 1);

    }


}
