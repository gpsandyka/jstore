import java.util.*;

/**
 * Tempat database pelanggan.
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.5
 * @since 09-04-2019
 */
public class    DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList();
    private static int LAST_CUSTOMER_ID = 0;
    
    /**
     * Untuk mengembalikan daftar pengsuplai
     * 
     * @return String[]
     */
    public static ArrayList<Customer> getCustomerDatabase()
    {
        // put your code here
        return CUSTOMER_DATABASE;
    }
    
    /**
     * Untuk mengembalikan daftar pengsuplai
     * 
     * @return String[]
     */
    public static int getLastCustomerID()
    {
        // put your code here
        return LAST_CUSTOMER_ID;
    }
    
    /**
     * Untuk menambah pengsuplai
     * 
     * @param customer
     * @return boolean
     */
    public static boolean addCustomer(Customer customer) throws CustomerAlreadyExistsException
    {
        // put your code here
        for (Customer cus : CUSTOMER_DATABASE) {
            if (cus.getUsername() == customer.getUsername() || cus.getEmail() == customer.getEmail()) {
                throw new CustomerAlreadyExistsException(customer);
                //return false; //Pertanda item duplik at
            }
        }
        CUSTOMER_DATABASE.add(customer); //Jika bisa keluar for, pertanda tidak ada item duplikat
        LAST_CUSTOMER_ID = customer.getId();
        return true;
    }
    
    /**
     * Untuk mengembalikan pengsuplai
     * 
     * @return Customer
     */
    public static Customer getCustomer(int id)
    {
        // put your code here
        for (Customer cus : CUSTOMER_DATABASE) {
            if (cus.getId() == id) {
                return cus;
            }
        }
        return null;
    }
    
    /**
     * Untuk menghapus pengsuplai
     * 
     * @param id
     * @return boolean
     */
    public static boolean removeCustomer(int id) throws CustomerNotFoundException
    {
        // put your code here
        for (Customer cus : CUSTOMER_DATABASE) {
            if (cus.getId() == id) {
                CUSTOMER_DATABASE.remove(cus);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
        //return false;
    }
}
