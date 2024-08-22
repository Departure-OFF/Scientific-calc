import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        calc();
    }

    public static void calc() {
        Scanner sinput = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        double firstnum;
        double secondnum;
        String op = "";

        System.out.println(
                "Welcome to calc! Operations: +,-,*,/\n Scientific operations: sqrt=Square root, square, sin, cos, tan, nlog=natural log, expe=exponential e");

        System.out.print("Select an operation or type 'exit' to exit: ");
        op = sinput.nextLine();

        if (op.equals("+")) {
            System.out.print("Enter your first number: ");
            firstnum = input.nextDouble();
            System.out.print("Enter your second number: ");
            secondnum = input.nextDouble();
            System.out.println("The sum is: " + (firstnum + secondnum));
            calc();
        } else if (op.equals("-")) {
            System.out.print("Enter your first number: ");
            firstnum = input.nextDouble();
            System.out.print("Enter your second number: ");
            secondnum = input.nextDouble();
            System.out.println("The difference is: " + (firstnum - secondnum));
            calc();
        } else if (op.equals("*")) {
            System.out.print("Enter your first number: ");
            firstnum = input.nextDouble();
            System.out.print("Enter your second number: ");
            secondnum = input.nextDouble();
            System.out.println("The product is: " + (firstnum * secondnum));
            calc();
        } else if (op.equals("/")) {
            System.out.print("Enter your first number: ");
            firstnum = input.nextDouble();
            System.out.print("Enter your second number: ");
            secondnum = input.nextDouble();
            if (secondnum == 0) {
                System.out.println("Cannot divide by 0");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                calc();
                return;
            }

            System.out.println("The quotient is: " + (firstnum / secondnum));
            calc();

        } else if (op.equals("sqrt")) {
            System.out.print("Enter the number you would like to square root: ");
            firstnum = input.nextDouble();
            if (firstnum < 0) {
                System.out.println("Cannot root a negative number");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                calc();
                return;
            }
            System.out.println("The square root of " + firstnum + " is: " + Math.sqrt(firstnum));
            calc();

        } else if (op.equals("square")) {
            System.out.print("Enter the number you would like to square: ");
            firstnum = input.nextDouble();
            System.out.println("The square of " + firstnum + " is: " + Math.pow(firstnum, 2));
            calc();

        } else if (op.equals("sin")) {
            System.out.print("Enter the number you would like to sin: ");
            firstnum = input.nextDouble();
            System.out.println("The sin of " + firstnum + " is: " + Math.sin(firstnum));
            calc();
        } else if (op.equals("cos")) {
            System.out.print("Enter the number you would like to cos: ");
            firstnum = input.nextDouble();
            System.out.println("The cos of " + firstnum + " is: " + Math.cos(firstnum));
            calc();
        } else if (op.equals("tan")) {
            System.out.print("Enter the number you would like to tan: ");
            firstnum = input.nextDouble();
            System.out.println("The tan of " + firstnum + " is: " + Math.tan(firstnum));
            calc();
        } else if (op.equals("nlog")) {
            System.out.print("Enter the number you would like to natural log: ");
            firstnum = input.nextDouble();
            System.out.println("The natural log of " + firstnum + " is: " + Math.log(firstnum));
            calc();
        } else if (op.equals("expe")) {
            System.out.print("Enter the number to be the exponent for E: ");
            firstnum = input.nextDouble();
            System.out.println("The exponential e of " + firstnum + " is: " + Math.exp(firstnum));
            calc();
        } else if (op.equals("exit")) {
            System.exit(0);
        } else {
            System.out.print("Invalid Operation");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            calc();
            return;
        }

    }
}
