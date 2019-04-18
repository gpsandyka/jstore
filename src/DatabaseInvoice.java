import java.util.*;

/**
 * Tempat database invoice.
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.5
 * @since 09-04-2019
 */
public class DatabaseInvoice
{
    // instance variables - replace the example below with your own
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList();
    private static int LAST_INVOICE_ID=0;
    
    /**
     * Untuk mengembalikan pengsuplai
     * 
     * @return Invoice
     */
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        // put your code here
        return INVOICE_DATABASE;
    }
    
    /**
     * Untuk mengembalikan daftar pengsuplai
     * 
     * @return String[]
     */
    public static int getLastInvoiceID()
    {
        // put your code here
        return LAST_INVOICE_ID;
    }
    
    /**
     * Untuk menambah pengsuplai
     * 
     * @param invoice
     * @return boolean
     */
    public static boolean addInvoice(Invoice invoice) throws InvoiceAlreadyExistsException
    {
        // put your code here
        for (Invoice inv : INVOICE_DATABASE) {
            if (inv.getItem().equals(invoice.getItem()) && inv.getCustomer() == invoice.getCustomer()) {
                throw new InvoiceAlreadyExistsException(invoice);
                //return false;
            }
        }
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID = invoice.getId();
        return true;
    }
          
    /**
     * Untuk menghapus pengsuplai
     * 
     * @param invoice
     * @return boolean
     */
    public static Invoice getInvoice(int id)
    {
        // put your code here
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id) { //Mendeteksi id setiap invoice yang ada di database
                return invoice;
            }
        }
        return null; //mengembalikan null apabila loop for tidak menemukannya
    }
    
       
    /**
     * Untuk menghapus pengsuplai
     * 
     * @param invoice
     * @return boolean
     */
    public static ArrayList<Invoice> getActiveOrder(Customer customer) throws CustomerDoesntHaveActiveException
    {
        // put your code here
        ArrayList<Invoice> temp = new ArrayList<>();
        for (Invoice invoice : INVOICE_DATABASE) {
            if ((invoice.getInvoiceStatus() == InvoiceStatus.Unpaid || invoice.getInvoiceStatus() == InvoiceStatus.Installment) && invoice.getIsActive() == true && invoice.getCustomer() == customer) { //Mendeteksi id setiap invoice yang ada di database
                temp.add(invoice);
            }
        }
        if (temp.size() > 0) {
            return temp;
        }
        else {
            throw new CustomerDoesntHaveActiveException(customer);
        }
    }
    
    /**
     * Untuk menghapus pengsuplai
     * 
     * @param invoice
     * @return boolean
     */
    public static boolean removeInvoice(int id) throws InvoiceNotFoundException
    {
        // put your code here
        // put your code here
        for (Invoice invoice2 : INVOICE_DATABASE) {
            if (invoice2.getId() == id) { //Mendeteksi id setiap invoice yang ada di database
                if (invoice2.getIsActive() == true) {
                    invoice2.setIsActive(false);
                }
                INVOICE_DATABASE.remove(invoice2);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
        //return false; //mengembalikan false apabila loop for tidak menemukannya
    }
}
