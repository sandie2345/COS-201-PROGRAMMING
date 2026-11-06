import java.util.Scanner;

public class AverageCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// Get student name
System.out.print("Enter student name: ");
String name = input.nextLine();

// Get the three scores
System.out.print("Enter score 1: ");
double score1 = input.nextDouble();

System.out.print("Enter score 2: ");
double score2 = input.nextDouble();

System.out.print("Enter score 3: ");
double score3 = input.nextDouble();

// Calculate total and average
double total = score1 + score2 + score3;
double average = total / 3; // Java knows to use decimals because total is a double

// Print the results
System.out.println(" ");
System.out.println("--- STUDENT RESULT ---");
System.out.println("Student Name: " + name);
System.out.println("Total Score: " + total);
System.out.println("Average Score: " + average);

input.close();
}
}

