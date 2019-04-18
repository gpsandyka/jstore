import java.util.*;
/**
 * Tempat database item.
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.0
 * @since 28-02-2019
 */
public class DatabaseItem
{
    // instance variables - replace the example below with your own
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList();
    private static int LAST_ITEM_ID = 0;

    /**
     * Untuk menambah item
     * 
     * @param item
     * @return boolean
     */
    public static ArrayList<Item> getItemDatabase()
    {
        // put your code here
        return ITEM_DATABASE;
    }
    
    /**
     * Untuk menambah item
     * 
     * @param item
     * @return boolean
     */
    public static int getLastItemId()
    {
        // put your code here
        return LAST_ITEM_ID;
    }
    
    /**
     * Untuk menambah item
     * 
     * @param item
     * @return boolean
     */
    public static boolean addItem (Item item) throws ItemAlreadyExistsException
    {
        // put your code here
        for (Item item2 : ITEM_DATABASE) {
            if (item2.getName() == item.getName() && item2.getStatus() == item.getStatus() && item2.getSupplier() == item.getSupplier() && item2.getCategory() == item.getCategory()) {
                throw new ItemAlreadyExistsException(item);
                //return false; //Pertanda item duplikat
            }
        }
        ITEM_DATABASE.add(item); //Jika bisa keluar for, pertanda tidak ada item duplikat
        LAST_ITEM_ID = item.getId();
        return true;
    }
    
    /**
     * Untuk menambah item
     * 
     * @param item
     * @return boolean
     */
    public static Item getItemFromID(int id)
    {
        // put your code here
        for (Item item : ITEM_DATABASE) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
    
    /**
     * Untuk menambah item
     * 
     * @param item
     * @return boolean
     */
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        // put your code here
        ArrayList<Item> temp = new ArrayList();
        for (Item item : ITEM_DATABASE) {
            if (item.getSupplier() == supplier) {
                temp.add(item);
            }
        }
        if (temp.size() > 0) { //Jika ada isinya
            return temp;
        }
        else {
            return null;
        }
    }
    
    /**
     * Untuk menambah item
     * 
     * @param item
     * @return boolean
     */
    public static ArrayList<Item> getItemFromCategory(ItemCategory category)
    {
        // put your code here
        ArrayList<Item> temp = new ArrayList();
        for (Item item : ITEM_DATABASE) {
            if (item.getCategory() == category) {
                temp.add(item);
            }
        }
        if (temp.size() > 0) { //Jika ada isinya
            return temp;
        }
        else {
            return null;
        }
    }
    
    /**
     * Untuk menambah item
     * 
     * @param item
     * @return boolean
     */
    public static ArrayList<Item> getItemFromStatus(ItemStatus status)
    {
        // put your code here
        ArrayList<Item> temp = new ArrayList();
        for (Item item : ITEM_DATABASE) {
            if (item.getStatus() == status) {
                temp.add(item);
            }
        }
        if (temp.size() > 0) { //Jika ada isinya
            return temp;
        }
        else {
            return null;
        }
    }

    /**
     * Untuk menghapus item
     * 
     * @param item
     * @return boolean
     */
    public static boolean removeItem(int id) throws ItemNotFoundException
    {
        // put your code here
        for (Item item : ITEM_DATABASE) {
            if (item.getId() == id) {
                ITEM_DATABASE.remove(item);
                return true;
            }
        }
        throw new ItemNotFoundException(id);
        //return false;
    }
}
