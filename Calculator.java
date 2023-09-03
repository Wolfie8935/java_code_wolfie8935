// Package 1: com.mycompany.mathoperations
package com.mycompany.mathoperations;

public class Addition {
    public static int add(int a, int b) {
        return a + b;
    }
}

// Package 2: com.mycompany.mathoperations
package com.mycompany.mathoperations;

public class Subtraction {
    public static int subtract(int a, int b) {
        return a - b;
    }
}

// Package 3: com.mycompany.mathoperations
package com.mycompany.mathoperations;

public class Multiplication {
    public static int multiply(int a, int b) {
        return a * b;
    }
}

// Package 4: com.mycompany.mathoperations
package com.mycompany.mathoperations;

public class Division {
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

// Main Program
import com.mycompany.mathoperations.*;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + Addition.add(num1, num2));
        System.out.println("Subtraction: " + Subtraction.subtract(num1, num2));
        System.out.println("Multiplication: " + Multiplication.multiply(num1, num2));
        System.out.println("Division: " + Division.divide(num1, num2));
    }
}
