import java.util.Random;
import java.util.Scanner;
/**
 * Operates like a convience store
 * 
 * @author Andon Shkurti
 * @version 3/11/15
 */
public class Cashier  {
    public static void main(String args []) {
        System.out.println("\nWelcome to the CS-140 Store");
        System.out.println("\n------------------------------------");
        Scanner in = new Scanner(System.in);
        Random customer = new Random();
        int num, nums, quantity, j, i ;
        double price;
        String product;
        int random = (int) ((Math.random() + 0.25) * 4);
        for ( i = 1; i <= random; i++) {
            Invoice invoice = new Invoice();
            System.out.println("\nNow serving customer #" + i + " of " + random); 
            // Asks user how many products they have
            System.out.print("\nHow many different products do you have?: ");
            num = in.nextInt();
               for (j=1; j<= num; j++) {
                    
                    // Asks user for the product they have
                    System.out.print("\nEnter the product name: ");
                    product = in.next();
                    System.out.print("\nEnter the price: ");
                    price = in.nextDouble();
                    Invoice.addToInvoice(product, price);
                    System.out.print("\nHow many " + product + " did you buy? Please enter the quantity: ");
                    quantity = in.nextInt();
                    Product p1 = new Product(product, price);
            }
            System.out.println("\nHere is your invoice information: ");
            System.out.println("\n-----------------------");//invoice
            System.out.println("Invoice num: " + i);
            System.out.println(invoice);
            System.out.println("Total invoice amount: " + Invoice.getTotal());
            
        }
        System.out.println("\nCS  140 store is closed today");
        System.out.println("We served " + (i-1) + " customers tody");
        System.out.println("Our sales amount for the day is " + Invoice.getTotal());
        
        
    }
}