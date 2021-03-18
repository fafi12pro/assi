

public class stack {
   
    private int maxSize;
    
    private int[] stackArray;
    
    private int top;

    
     public stack(int size) {
         maxSize = size;
         stackArray = new int[maxSize];
         top = -1;
    }
    public void push(int value) {
        if (!isFull()) { 
            top++;
            stackArray[top] = value;
        } else {
            resize(maxSize * 4);
            push(value);
        }
    }

    
     public int pop() {
         if (!isEmpty()) { 
              return stackArray[top--];
         }

        if (top < maxSize /4 ) {
             resize(maxSize /2);
             return pop();
        } else {
             System.out.println("The stack is already empty");
             return -1;
        }
    }

   
    public int peek() {
        if (!isEmpty()) { 
             return stackArray[top]; 
        } else {
            System.out.println("The stack is empty, cant peek");
            return -1;
        }
    }

    private void resize(int newSize) {
         int[] transferArray = new int[newSize];

         for (int i = 0; i < stackArray.length; i++) {
             transferArray[i] = stackArray[i];
             stackArray = transferArray;
         }
         maxSize = newSize;
    }

    
     public boolean isEmpty() {
         return (top == -1);
     }

     
     public boolean isFull() {
        return (top + 1 == maxSize);
     }

    
     public void makeEmpty() { 
         top = -1; 
         
     }

     public static void main(String args[]) {
         stack myStack = new stack(2);
         myStack.push(6);
         myStack.push(24);
         myStack.push(8);
         myStack.push(12);
         myStack.push(2);
         
         System.out.println("even numbers");
         System.out.println(myStack.isEmpty());
         System.out.println(myStack.isFull()); 
         System.out.println(myStack.peek()); 
         System.out.println(myStack.pop()); 
         System.out.println(myStack.pop());
         System.out.println(myStack.pop());
         System.out.println(myStack.pop());
         System.out.println(myStack.pop());
         
    }
}
