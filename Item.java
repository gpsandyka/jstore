
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
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;

    /**
     * Constructor for objects of class Item
     */
    public Item(int id, String name, int stock, ItemStatus status, int price, ItemCategory category, Supplier supplier)
    {
        /* setiap dari line ini bermaksud untuk mengupdate
         * setiap variabel yang dimasukkan ke dalam
         * variabel private di dalam class ini
         */
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.status = status;
        this.price = price;
        this.category = category;
        this.supplier = supplier;
        
    }
    
    /**
     * Untuk mengembalikan Id
     * 
     * @return int
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
    public ItemCategory getCategory()
    {
        // put your code here
        return category;
    }
    
    /**
     * Untuk mengembalikan status
     * 
     * @return String
     */
    public ItemStatus getStatus()
    {
        // put your code here
        return status;
    }
    
    /**
     * Untuk mengembalikan status
     * 
     * @return String
     */
    public Supplier getSupplier()
    {
        // put your code here
        return supplier;
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
    public void setCategory(ItemCategory category)
    {
        // put your code here
        this.category = category;
    }
    
    /**
     * Untuk mengupdate variabel status
     * 
     * @param category
     */
    public void setStatus(ItemStatus status)
    {
        // put your code here
        this.status = status;
    }
    
    /**
     * Untuk print data-data yang penting
     */
    public String toString()
    {
        return ("ID : " + id + "\nName : " + name + "\nStock : " + stock + "\nHarga : " + price + "\nCategory : " + category + "\nStatus : " + status + "\nSupplier : " + supplier.getName());
        /*
        System.out.println("===ITEM===");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Stock : " + stock);
        price
        System.out.println("Category : " + category);
        System.out.println("Status : " + status);
        System.out.println("Supplier : " + supplier.getName());
        */
    }
}
