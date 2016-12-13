import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declare objects
        Scanner scanner;
        String num1;
        String num2;
        Integer int1;
        Integer int2;
        String operation;
        Integer solution;

        // Read inputs
        scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        num1 = scanner.next();

        if(num1.equalsIgnoreCase("one")) {
            int1 = 1;
        } else if(num1.equalsIgnoreCase("two")) {
            int1 = 2;
        } else if(num1.equalsIgnoreCase("three")) {
            int1 = 3;
        } else if(num1.equalsIgnoreCase("four")) {
            int1 = 4;
        } else if(num1.equalsIgnoreCase("five")) {
            int1 = 5;
        } else if(num1.equalsIgnoreCase("six")) {
            int1 = 6;
        } else if(num1.equalsIgnoreCase("seven")) {
            int1 = 7;
        } else if(num1.equalsIgnoreCase("eight")) {
            int1 = 8;
        } else if(num1.equalsIgnoreCase("nine")) {
            int1 = 9;
        } else if(num1.equalsIgnoreCase("ten")) {
            int1 = 10;
        } else {
            System.out.println("Sorry, only integers up to 10 please! I don't understand [  num1  ]!");
            return;
        }

        System.out.print("Enter operation (+, -, *,or /) ");
        operation = scanner.next();

        System.out.print("Enter 2nd number: ");
        num2 = scanner.next();

        if (num2.equals("one")) {
            int2 = 1;
        } else if (num2.equalsIgnoreCase("two")) {
            int2 = 2;
        } else if(num2.equalsIgnoreCase("three")) {
            int2 = 3;
        } else if(num2.equalsIgnoreCase("four")) {
            int2 = 4;
        } else if(num2.equalsIgnoreCase("five")) {
            int2 = 5;
        } else if(num2.equalsIgnoreCase("six")) {
            int2 = 6;
        } else if(num2.equalsIgnoreCase("seven")) {
            int2 = 7;
        } else if(num2.equalsIgnoreCase("eight")) {
            int2 = 8;
        } else if(num2.equalsIgnoreCase("nine")) {
            int2 = 9;
        } else if(num2.equalsIgnoreCase("ten")) {
            int2 = 10;
        } else {
            System.out.println("Sorry, only integers up to 10 please! I don't understand [ num2 ]!");
            return;
        }


        System.out.println();
        // solution = 999;

        if (operation.equals("+")) {
            solution = int1 + int2;
        }  else if (operation.equals("-")) {
            solution = int1 - int2;
        }  else if (operation.equals("*")) {
             solution = int1 * int2;
         } else if (operation.equals("/")) {
             solution = int1 / int2;
         } else {
            System.out.println("Error! [" + operation + "] is invalid!");
            return;
         }

         System.out.println("I got u fam, " + int1 + operation + int2 + " is " + solution);

    }
}
