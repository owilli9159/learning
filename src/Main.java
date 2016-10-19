import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Suhhhhhhh dude!");
        System.out.println("Need some math help huh?");
        System.out.println("Enter 1st number:");
        int num1 = userinput.nextInt();
        System.out.println("Enter operation (+, -, x,or /)");
        String operation= userinput.next();
        System.out.println("Enter 2nd number:");
        int num2 = userinput.nextInt();
        if (operation.equals("+"))
            System.out.println("I got u fam, the answer is " + (num1 + num2));
        else if (operation.equals("-"))
            System.out.println("I got u fam, the answer is " + (num1 - num2));
        else if (operation.equals("x"))
            System.out.println("I got u fam, the answer is " + (num1 * num2));
        else if (operation.equals("/"))
            System.out.println("I got u fam, the answer is " + (num1 / num2));
        else
            System.out.println("Not gonna happen my dude");
    }
}