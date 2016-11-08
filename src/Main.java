import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declare objects
        Scanner scanner;
        Integer num1;
        Integer num2;
        String operation;
        Integer solution;
       /* Integer one;
        Integer two;
        Integer three;
        Integer four;
        Integer five;
        Integer six;
        Integer seven;
        Integer eight;
        Integer nine;
        Integer ten;


        one = 1;
        two = 2;
        three = 3;
        four = 4;
        five = 5;
        six = 6;
        seven = 7;
        eight = 8;
        nine = 9;
        ten = 10;
*/


        // Read inputs
        scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        num2 = scanner.nextInt();

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

         System.out.println("I got u fam, the answer is " + solution);

    }
}
