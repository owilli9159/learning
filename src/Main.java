import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declare objects
        Scanner scanner;
        Integer num1;
        Integer num2;
        String operation;
//        Integer plusSolution;
//        Integer minusSolution;
//        Integer timesSolution;
//        Integer dividedSolution;
        Integer solution;

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
