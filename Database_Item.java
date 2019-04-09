
/**
 * Tempat database item.
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.0
 * @since 28-02-2019
 */
public class Database_Item
{
    // instance variables - replace the example below with your own
    private static Item listItem[];

    /**
     * Untuk menambah item
     * 
     * @param item
     * @return boolean
     */
    public static boolean addItem(Item item)
    {
        // put your code here
        listItem[0] = item;
        return true;
    }

    /**
     * Untuk menghapus item
     * 
     * @param item
     * @return boolean
     */
    public static boolean removeItem(Item item)
    {
        // put your code here
        listItem[0] = null;
        return true;
    }
    
    /**
     * Untuk mengembalikan item
     * 
     * @return Item
     */
    public static Item getItem()
    {
        // put your code here
        return listItem[0];
    }
    
    /**
     * Untuk mengembalikan daftar item
     * 
     * @return String[]
     */
    public Item[] getItemDatabase()
    {
        // put your code here
        return listItem;
    }
}
