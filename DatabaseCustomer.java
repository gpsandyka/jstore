
/**
 * Tempat database pelanggan.
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.5
 * @since 09-04-2019
 */
public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private Customer listCustomer[];
    
    /**
     * Untuk menambah pengsuplai
     * 
     * @param customer
     * @return boolean
     */
    public boolean addCustomer(Customer customer)
    {
        // put your code here
        return false;
    }
    
    /**
     * Untuk menghapus pengsuplai
     * 
     * @param customer
     * @return boolean
     */
    public void removeCustomer(Customer customer)
    {
        // put your code here
    }
    
    /**
     * Untuk mengembalikan pengsuplai
     * 
     * @return Customer
     */
    public Customer getCustomer()
    {
        // put your code here
        return listCustomer[0];
    }
    
    /**
     * Untuk mengembalikan daftar pengsuplai
     * 
     * @return String[]
     */
    public Customer[] getListCustomer()
    {
        // put your code here
        return listCustomer;
    }
}
