package calculator;

import java.util.Scanner;

public class CalcDriver {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int num1;
        int num2;
        String operator;

        System.out.println("Give me a number");
        num1 = userInput.nextInt();
        System.out.println("Please enter another number");
        num2 = userInput.nextInt();
        System.out.println("Pick an operator add, subtract, multiply, divide, square");
        operator = userInput.next();

        Calculator calculator = new Calculator();

        if (operator.equalsIgnoreCase("add")) {
            System.out.println(calculator.add(num1, num2));
        } else if (operator.equalsIgnoreCase("subtract")) {
            System.out.println(calculator.subtract(num1, num2));
        } else if (operator.equalsIgnoreCase("multiply")) {
            System.out.println(calculator.multiply(num1, num2));
        } else if (operator.equalsIgnoreCase("divide")) {
            System.out.println(calculator.multiply(num1, num2));
        } else if (operator.equalsIgnoreCase("square")) {
            System.out.println(calculator.square(num1, num2));
        }
        // System.out.println(calculator.square(num1, num2));

        System.out.println("Now for some trig AKA Magic: ");
        MagicCalculator magiccalc = new MagicCalculator();
        System.out.println("Tangent: " + magiccalc.findTangent(2));
        System.out.println("Cosine: " + magiccalc.findCosine(2));
        System.out.println("Sine: " + magiccalc.findSine(2));
        System.out.println("Factorial: " + magiccalc.findFactorial(2));

        userInput.close();
    }
}
