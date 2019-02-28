
/**
 * Tempat item.
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.0
 * @since 28-02-2019
 */
public class Item
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int stock;
    private int price;
    private String category;
    private Supplier supplier;

    /**
     * Constructor for objects of class Item
     */
    public Item(int id, String name, int stock, int price, String category, Supplier supplier)
    {
        /* setiap dari line ini bermaksud untuk mengupdate
         * setiap variabel yang dimasukkan ke dalam
         * variabel private di dalam class ini
         */
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.category = category;
        this.supplier = supplier;
        
    }
    
    /**
     * Constructor for objects of class Item
     */
    public int getId()
    {
        // untuk mengembalikan nilai id
        return id;
    }
    
    /**
     * Untuk mengembalikan nama
     * 
     * @return String
     */
    public String getName()
    {
        // put your code here
        return name;
    }

    /**
     * Untuk mengembalikan stock
     * 
     * @return int
     */
    public int getStock()
    {
        // put your code here
        return stock;
    }

    /**
     * Untuk mengembalikan harga
     * 
     * @return int
     */
    public int getPrice()
    {
        // put your code here
        return price;
    }

    /**
     * Untuk mengembalikan kategori
     * 
     * @return String
     */
    public String getCategory()
    {
        // put your code here
        return category;
    }

    /**
     * Untuk mengupdate variabel id
     * 
     * @param id
     */
    public void setId(int id)
    {
        // put your code here
        this.id = id;
    }

    /**
     * Untuk mengupdate variabel name
     * 
     * @param name
     */
    public void setName(String name)
    {
        // put your code here
        this.name = name;
    }

    /**
     * Untuk mengupdate variabel stock
     * 
     * @param stock
     */
    public void setStock(int stock)
    {
        // put your code here
        this.stock = stock;
    }
    
    /**
     * Untuk mengupdate variabel harga
     * 
     * @param price
     */
    public void setPrice(int price)
    {
        // put your code here
        this.price = price;
    }

    /**
     * Untuk mengupdate variabel kategori
     * 
     * @param category
     */
    public void setCategory(String category)
    {
        // put your code here
        this.category = category;
    }
    
    /**
     * Untuk print nama
     */
    public void printData()
    {
        System.out.println(name);
    }
}
