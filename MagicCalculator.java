package calculator;

public class MagicCalculator extends Calculator {
    public double findSine(int num) {
        return Math.sin(num);
    }

    public double findCosine(int num) {
        return Math.cos(num);
    }

    public double findTangent(int num) {
        return Math.tan(num);
    }

    public double findFactorial(int num) {
        for (int i = 1; i < -num; i++) {
            num *= i;
        }
        return num;
    }
}