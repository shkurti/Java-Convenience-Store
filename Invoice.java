/**
 * Represents an Invoice
 * 
 * @author Andon Shkurti
 * @version 3/11/15
 */
public class Invoice  {
    int number, quantity; // represents an invoice number
    static double  runningTotal; // represents the amount of running total
    static String invoice;// used to keep the information of the products
    static public String product;
    static public double price;
    
    /**
     * Will create the invoice
     */ 
     
    public Invoice () {
        
    }
    
    /**
     * Adds the products created to an invoice
     *  
     * @param the Invoice of the customer 
     */
    public static void addToInvoice(String product, double price) {
        product = product;
        price = price;
    }
    
    /**
     * Returns the total price for the product
     * 
     * @return the total price
     */
    public static double getTotal() {
        return runningTotal;
    }
    
    /**
     * Returns a printable representation of the invoice
     * 
     * @return a printable representation of the invoice 
     */
    public String toString() {
        return "Product: " + product + "  Price: $" + price + "  Quantity: " + quantity +
                "  Total Price: " + runningTotal;
    }
}