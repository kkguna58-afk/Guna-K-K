import java.util.Scanner;

public class stackjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter stack size: ");
        int size = sc.nextInt();
        int[] stack = new int[size];
        int top = -1;
        int choice;
        do {
            System.out.println("\n1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.display");
            System.out.println("5.exit");
            System.out.print("enter the choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (top == size - 1) {
                        System.out.println("stack overflow");
                    } else {
                        System.out.print("enter value: ");
                        int value = sc.nextInt();
                        stack[++top] = value;
                        System.out.println(value + " inserted");
                    }
                    break;
                case 2:
                    if (top == -1) {
                        System.out.println("stack underflow");
                    } else {
                        System.out.println(stack[top] + " removed");
                        top--;
                    }
                    break;
                case 3:
                    if (top == -1) {
                        System.out.println("stack is empty");
                    } else {
                        System.out.println("top element = " + stack[top]);
                    }
                    break;
                case 4:
                    if (top == -1) {
                        System.out.println("stack is empty");
                    } else {
                        System.out.println("stack elements:");
                        for (int i = top; i >= 0; i--) {
                            System.out.println(stack[i]);
                        }
                    }
                    break;
                case 5:
                    System.out.println("program ended");
                    break;
                default:
                    System.out.println("invalid choice");
            }
        } while (choice != 5);
        sc.close();
    }
}
