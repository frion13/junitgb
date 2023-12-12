package task1;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public double calculateDiscount(double price, double percent ){
        if (price <= 0 || percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Некорректные входные данные");
        }

        double discount = price * (percent / 100);
        return price - discount;
    }
}
