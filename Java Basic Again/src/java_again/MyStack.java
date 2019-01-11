package java_again;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MyStack {
    public static void main(String[] args) {
        
        Stack stack;
        System.out.println("Enter stack element capacity: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        try {
            stack = new Stack(num);
            for (int i = 0; i < num; i++) {
                System.out.println("Enter a value to push: ");
                int pushNum = input.nextInt();
                stack.push(pushNum);
            }
            stack.display();
            stack.pop(3);
            stack.display();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Stack {

    private int top, size, capacity;
    private int[] array;

    public Stack(int capacity) throws Exception {
        if (capacity < 1) {
            throw new Exception("Capacity can't less than 1\n");
        } else {
            this.capacity = capacity;
            array = new int[capacity];
            size = 0;
            top = -1;
        }
    }

    void push(int value) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("stack is overflow\n");
        } else {
            array[++top] = value;
            size++;
        }
    }

    private boolean isFull() {
        if (capacity == size) {
            return true;
        } else {
            return false;
        }
    }

    void pop(int value) throws Exception {
        if (isEmpty()) {
            throw new Exception("stack is underflow\n");
        }
        else {
            top--;
            size--;
        }
    }
    
    private boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
     void display() {
        if(isEmpty()) {
            throw new NoSuchElementException("stack is empty");
        }
        else {
            System.out.println("stack is: ");
            for(int i=0; i<=top; i++) {
                System.out.println(array[i] + "\t");
            }
            System.out.println("");
        }
    }
}
