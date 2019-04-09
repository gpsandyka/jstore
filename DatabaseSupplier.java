
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
    private Supplier listSupplier[];
    
    /**
     * Untuk menambah pengsuplai
     * 
     * @param supplier
     * @return boolean
     */
    public boolean addSupplier(Supplier supplier)
    {
        // put your code here
        return true;
    }
    
    /**
     * Untuk menghapus pengsuplai
     * 
     * @param supplier
     * @return boolean
     */
    public void removeSupplier(Supplier supplier)
    {
        // put your code here
    }
    
    /**
     * Untuk mengembalikan pengsuplai
     * 
     * @return Supplier
     */
    public Supplier getSupplier()
    {
        // put your code here
        return listSupplier[0];
    }
    
    /**
     * Untuk mengembalikan daftar pengsuplai
     * 
     * @return String[]
     */
    public Supplier[] getListSupplier()
    {
        // put your code here
        return listSupplier;
    }
}
