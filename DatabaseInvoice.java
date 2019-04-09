
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
    private Invoice listInvoice[];
    
    /**
     * Untuk menambah pengsuplai
     * 
     * @param invoice
     * @return boolean
     */
    public boolean addInvoice(Invoice invoice)
    {
        // put your code here
        return false;
    }
    
    /**
     * Untuk menghapus pengsuplai
     * 
     * @param invoice
     * @return boolean
     */
    public void removeInvoice(Invoice invoice)
    {
        // put your code here
    }
    
    /**
     * Untuk mengembalikan pengsuplai
     * 
     * @return Invoice
     */
    public Invoice getInvoice()
    {
        // put your code here
        return listInvoice[0];
    }
    
    /**
     * Untuk mengembalikan daftar pengsuplai
     * 
     * @return String[]
     */
    public Invoice[] getListInvoice()
    {
        // put your code here
        return listInvoice;
    }
}
