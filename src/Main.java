import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declare objects
        Scanner scanner;
        Integer num1;
        Integer num2;
        String operation;
        Integer solution;

        // Read inputs
        scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        num1 = scanner.nextInt();

        if(num1.equals("one")) {
            num1 = 1;
        } else if(num1.equals("two")) {
            num1 = 2;
        } else if(num1.equals("three")) {
            num1 = 3;
        } else if(num1.equals("four")) {
            num1 = 4;
        } else if(num1.equals("five")) {
            num1 = 5;
        } else if(num1.equals("six")) {
            num1 = 6;
        } else if(num1.equals("seven")) {
            num1 = 7;
        } else if(num1.equals("eight")) {
            num1 = 8;
        } else if(num1.equals("nine")) {
            num1 = 9;
        } else if(num1.equals("ten")) {
            num1 = 10;
        }

        System.out.print("Enter 2nd number: ");
        num2 = scanner.nextInt();

        if (num2.equals("one")) {
            num2 = 1;
        } else if (num2.equals("two")) {
            num2 = 2;
        } else if(num2.equals("three")) {
            num2 = 3;
        } else if(num2.equals("four")) {
            num2 = 4;
        } else if(num2.equals("five")) {
            num2 = 5;
        } else if(num2.equals("six")) {
            num2 = 6;
        } else if(num2.equals("seven")) {
            num2 = 7;
        } else if(num2.equals("eight")) {
            num2 = 8;
        } else if(num2.equals("nine")) {
            num2 = 9;
        } else if(num2.equals("ten")) {
            num2 = 10;
        }

        System.out.print("Enter operation (+, -, *,or /) ");
        operation = scanner.next();

        System.out.println();
        solution = 999;

        if (operation.equals("+")) {
            solution = num1 + num2;
        }  else if (operation.equals("-")) {
            solution = num1 - num2;
        }  else if (operation.equals("*")) {
             solution = num1 * num2;
         } else if (operation.equals("/")) {
             solution = num1 / num2;
         } else {
            System.out.println("Error! [" + operation + "] is invalid!");
            return;
         }

         System.out.println("I got u fam, " + num1 + operation + "is " + solution);

    }
}
