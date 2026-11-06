import java.util.Scanner;

public class SimpleCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// Get the first number
System.out.print("Enter the first number: ");
double num1 = input.nextDouble();

// Get the second number
System.out.print("Enter the second number: ");
double num2 = input.nextDouble();

// Calculate the answers
double sum = num1 + num2;
double difference = num1 - num2;
double product = num1 * num2;

// Print the answers
System.out.println("Sum: " + sum);
System.out.println("Difference: " + difference);
System.out.println("Product: " + product);

// Check for zero before dividing so the program doesn't crash
if (num2 != 0) {
double quotient = num1 / num2;
System.out.println("Quotient: " + quotient);
} else {
System.out.println("Cannot divide by zero!");
}

input.close();
}
}