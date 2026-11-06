import java.util.Scanner;

public class ItemCost {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// Get item name
System.out.print("Enter item name: ");
String itemName = input.nextLine();

// Get quantity
System.out.print("Enter quantity: ");
int quantity = input.nextInt();

// Get unit price
System.out.print("Enter unit price: ");
double unitPrice = input.nextDouble();

// Calculate total cost
double totalCost = quantity * unitPrice;

// Print the results
System.out.println(" ");
System.out.println("--- PURCHASE SUMMARY ---");
System.out.println("Item Name: " + itemName);
System.out.println("Quantity: " + quantity);
System.out.println("Unit Price: " + unitPrice);
System.out.println("Total Cost: " + totalCost);

input.close();
}
}
