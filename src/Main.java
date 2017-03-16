import java.util.Scanner;

public class Main {

    private static final String EXIT_CODE_STRING = "exit";
    private static final int EXIT_CODE_NUMBER = -1;

    public static void main(String[] args) {
        // Declare objects
        final Scanner scanner;
        String num1 = "";
        String num2 = "";
        int int1 = -1;
        int int2 = -1;
        String operation;
        Integer solution;

        scanner = new Scanner(System.in);

        // Validating input
        while (int1 < 0) {

            // Reading input and assigning it to a variable
            num1 = readInput(scanner, "Enter 1st number (integers 1-10 only): ");

            // Translating string into an integer
            int1 = translateInput(num1);
        }

      // Reading operation input
        operation = readInput(scanner,"Enter operation (plus, minus, times, or divided by): ");

        // Translates natural language to symbol
        operation = translateOperation(operation);

        // Validating input
        while (!validateOperation(operation)) {

            // Reads operation input
            operation = readInput(scanner,"Enter operation (plus, minus, times, or divided by); ");

            // Translates natural language to symbol
            operation = translateOperation(operation);
        }

        while (int2 < 0) {

            // Reading 2nd string input
            num2 = readInput(scanner, "Enter 2nd number(integers 1-10 only): ");

            // Translating to an integer
            int2 = translateInput(num2);
        }

        // Calculate solution
        System.out.println();
        solution = calcSolution(operation, int1, int2);

        // Print solution
        System.out.println("I got u fam, " + num1 + " " + operation + " " + num2 + " equals " + solution);
    }

    private static String readInput(Scanner scanner, String message) {
        System.out.print(message);

        String input;
        input = scanner.nextLine();
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
        } else if(input.equalsIgnoreCase(EXIT_CODE_STRING)) {
            System.exit(EXIT_CODE_NUMBER);
        } else {
            System.out.println("Sorry, only integers up to 10 please! I don't understand [" + input + "]! Please retry!");
        }
        return -1;
    }

    private static Integer calcSolution(String operation, Integer int1, Integer int2) {
        if (operation.equals("+")) {
            return int1 + int2;
        } else if (operation.equals("-")) {
            return int1 - int2;
        } else if (operation.equals("*")) {
            return int1 * int2;
        } else if (operation.equals("/")) {
            return int1 / int2;
     /*   } else if (operation.equals("^")) {
            return int1 * int1; */
        } else {
            System.out.println("Error! [" + operation + "] is invalid!");
            return -1;
        }
    }

    private static boolean validateOperation(String operation) {
        if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/") && !operation.equals("^")) {
            return false;
        } else {
            return true;
        }
    }

    private static String translateOperation(String input) {
        if (input.equalsIgnoreCase("plus")) {
            return "+";
        } else if (input.equalsIgnoreCase("minus")) {
            return "-";
        } else if (input.equalsIgnoreCase("times")) {
            return "*";
        } else if (input.equalsIgnoreCase("multiplied by")) {
            return "*";
        } else if(input.equalsIgnoreCase("divided by")) {
            return "/";
        } else if(input.equalsIgnoreCase("over")) {
            return "/";
        } else if(input.equalsIgnoreCase("to the power of")) {
            return "^";
        } else if (input.equalsIgnoreCase("exponent")) {
            return "^";
        } else if (input.equalsIgnoreCase(EXIT_CODE_STRING)) {
            System.exit(EXIT_CODE_NUMBER);
        } else {
            System.out.println("Sorry! I don't understand this [" + input + "]! Please retry! ");
        }
        return "no";
    }

 /*   private static Integer calcExponent(String input, Integer int1, Integer int2) {
        if (int2 = 1) {
            return int1;

        }
    } */

  /*  private static String translateSolution(Integer solution) {
        if (solution == 1) {
            return "one";
        } else if (solution == 2) {
            return "two";
        } else if (solution == 3) {
            return "three";
        } else if (solution == 4) {
            return "four";
        } else if (solution == 5) {
            return "five";
        } else if (solution == 6) {
            return "six";
        } else if (solution == 7) {
            return "seven";
        } else if (solution == 8) {
            return "eight";
        } else if (solution == 9) {
            return "nine";
        } else if (solution == 10) {
            return "ten";
        } else {
            return solution.toString();
        }
    } */
}
