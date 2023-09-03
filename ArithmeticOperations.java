public class ArithmeticOperations {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method to add two double numbers
    public double add(double a, double b) {
        return a + b;
    }
    
    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }
    
    // Method to subtract two double numbers
    public double subtract(double a, double b) {
        return a - b;
    }
    
    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Method to multiply two double numbers
    public double multiply(double a, double b) {
        return a * b;
    }
    
    // Method to divide two integers
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
    
    // Method to divide two double numbers
    public double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Error: Division by zero!");
            return 0.0;
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        ArithmeticOperations calculator = new ArithmeticOperations();
        
        System.out.println("Addition (int): " + calculator.add(5, 3));
        System.out.println("Addition (double): " + calculator.add(5.5, 3.3));
        
        System.out.println("Subtraction (int): " + calculator.subtract(8, 4));
        System.out.println("Subtraction (double): " + calculator.subtract(8.8, 4.4));
        
        System.out.println("Multiplication (int): " + calculator.multiply(6, 2));
        System.out.println("Multiplication (double): " + calculator.multiply(6.6, 2.2));
        
        System.out.println("Division (int): " + calculator.divide(10, 2));
        System.out.println("Division (double): " + calculator.divide(10.0, 2.0));
    }
}
