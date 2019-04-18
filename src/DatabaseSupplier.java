import java.util.*;
/**
 * Tempat database pengsuplai.
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.0
 * @since 28-02-2019
 */
public class DatabaseSupplier
{
    // instance variables - replace the example below with your own
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList();
    private static int LAST_SUPPLIER_ID = 0;
    
    /**
     * Untuk menambah pengsuplai
     * 
     * @param supplier
     * @return boolean
     */
    public static ArrayList<Supplier> getSupplierDatabase()
    {
        // put your code here
        return SUPPLIER_DATABASE;
    }
    
    /**
     * Untuk menambah pengsuplai
     * 
     * @param supplier
     * @return boolean
     */
    public static int getLastSupplierID()
    {
        // put your code here
        return LAST_SUPPLIER_ID;
    }
    
    /**
     * Untuk menambah pengsuplai
     * 
     * @param supplier
     * @return boolean
     */
    public static boolean addSupplier(Supplier supplier) throws SupplierAlreadyExistsException
    {
        // put your code here
        for (Supplier supp : SUPPLIER_DATABASE) {
            if (supp.getEmail() == supplier.getEmail() || supp.getPhoneNumber() == supplier.getPhoneNumber()) {
                throw new SupplierAlreadyExistsException(supplier);
                //return false; //Pertanda item duplik at
            }
        }
        SUPPLIER_DATABASE.add(supplier); //Jika bisa keluar for, pertanda tidak ada item duplikat
        LAST_SUPPLIER_ID = supplier.getId();
        return true;
    }
    
    
    /**
     * Untuk mengembalikan pengsuplai
     * 
     * @return Supplier
     */
    public static Supplier getSupplier(int id)
    {
        // put your code here
        for (Supplier supp : SUPPLIER_DATABASE) {
            if (supp.getId() == id) {
                return supp; //Pertanda item duplik at
            }
        }
        return null;
    }
    
    /**
     * Untuk menghapus pengsuplai
     * 
     * @param supplier
     * @return boolean
     */
    public static boolean removeSupplier(int id) throws SupplierNotFoundException
    {
        // put your code here
        for (Supplier supp : SUPPLIER_DATABASE) {
            if (supp.getId() == id) {
                for (Item item : DatabaseItem.getItemDatabase()) {
                    if (item.getSupplier() == supp) {
                        try {
                            DatabaseItem.removeItem(item.getId());
                        }
                        catch (ItemNotFoundException e) {

                        }
                    }
                }
                SUPPLIER_DATABASE.remove(supp); 
                return true;
            }
        }
        throw new SupplierNotFoundException(id);
        //return false;
    }
    
}
