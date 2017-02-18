import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declare objects
        Scanner scanner;
        String num1;
        String num2;
        int int1 = -1;
        int int2 = -1;
        String operation;
        Integer solution;

        scanner = new Scanner(System.in);

        while (int1 < 0) {
            // Reading input and assigning it to a variable
            num1 = readInput(scanner, "Enter 1st number: ");

            // Translating string into an integer
            int1 = translateInput(num1);
        }

        // Reading operation input
        operation = readInput(scanner,"Enter operation (+, -, *, or /); ");
        if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
            System.out.print("Sorry, operation not valid! Use +, -, *, or /");
            return;
        }

        // Reading 2nd string input
        num2 = readInput(scanner, "Enter 2nd number: ");

        // Translating to an integer
        int2 = translateInput(num2);
        if (int2 == -1) {
            return;
        }

        // Calculate solution
        System.out.println();
        solution = calcSolution(operation, int1, int2);

        // Print solution
        System.out.println("I got u fam, " + int1 + operation + int2 + " is " + solution);
    }

    private static String readInput(Scanner scanner, String message) {
        System.out.print(message);

        String input;
        input = scanner.next();
        return input;
    }

    private static Integer translateInput(String input) {
        if(input.equalsIgnoreCase("one")) {
            return 1;
        } else if(input.equalsIgnoreCase("two")) {
            return 2;
        } else if(input.equalsIgnoreCase("three")) {
            return 3;
        } else if(input.equalsIgnoreCase("four")) {
            return 4;
        } else if(input.equalsIgnoreCase("five")) {
            return 5;
        } else if(input.equalsIgnoreCase("six")) {
            return 6;
        } else if(input.equalsIgnoreCase("seven")) {
            return 7;
        } else if(input.equalsIgnoreCase("eight")) {
            return 8;
        } else if(input.equalsIgnoreCase("nine")) {
            return 9;
        } else if(input.equalsIgnoreCase("ten")) {
            return 10;
        } else {
            System.out.println("Sorry, only integers up to 10 please! I don't understand [" + input + "]! Please retry!");
            return -1;
        }
    }

    private static Integer calcSolution(String operation, Integer int1, Integer int2) {
        if (operation.equals("+")) {
            return int1 + int2;
        }  else if (operation.equals("-")) {
            return int1 - int2;
        }  else if (operation.equals("*")) {
            return int1 * int2;
        } else if (operation.equals("/")) {
            return int1 / int2;
        } else {
            System.out.println("Error! [" + operation + "] is invalid!");
            return -1;
        }
    }

   /* private static String validateOperation(String operation) {
        if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
            System.out.print("Sorry, operation not valid! Use +, -, *, or /");
            return operation;
    }
    */
}
