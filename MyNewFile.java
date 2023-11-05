import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        char operator;
        double num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter two numbers: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

