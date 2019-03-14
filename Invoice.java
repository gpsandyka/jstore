
/**
 * Tempat Invoice.
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.0
 * @since 28-02-2019
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private Item item;
    private String date;
    private int totalPrice;
    private int totalItem;
    private InvoiceStatus status;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Item item, String date, int totalPrice)
    {
        // initialise instance variables
        this.id = id;
        this.item = item;
        this.date = date;
        this.totalPrice = totalPrice;
    }

    /**
     * Untuk mengembalikan id
     * 
     * @return int
     */
    public int getId()
    {
        // put your code here
        return id;
    }

    /**
     * Untuk mengembalikan item
     * 
     * @return Item
     */
    public Item getItem()
    {
        // put your code here
        return item;
    }

    /**
     * Untuk mengembalikan tanggal
     * 
     * @return String
     */
    public String getDate()
    {
        // put your code here
        return date;
    }
    
    /**
     * Untuk mengembalikan harga total
     * 
     * @return int
     */
    public int getTotalPrice()
    {
        // put your code here
        return totalPrice;
    }
    
    /**
     * Untuk mengembalikan jumlah barang total
     * 
     * @return int
     */
    public int getTotalItem()
    {
        // put your code here
        return totalItem;
    }
    
    /**
     * Untuk mengembalikan status invoice
     * 
     * @return String
     */
    public InvoiceStatus getInvoiceStatus()
    {
        // put your code here
        return status;
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
     * Untuk mengupdate variabel item
     * 
     * @param item
     */
    public void setItem(Item item)
    {
        // put your code here
        this.item = item;
    }

    /**
     * Untuk mengupdate variabel date
     * 
     * @param date
     */
    public void setDate(String date)
    {
        // put your code here
        this.date = date;
    }

    /**
     * Untuk mengupdate variabel harga total
     * 
     * @param totalPrice
     */
    public void setTotalPrice(int totalPrice)
    {
        // put your code here
        this.totalPrice = totalPrice;
    }
    
    /**
     * Untuk mengupdate variabel jumlah barang total
     * 
     * @param totalItem
     */
    public void setTotalItem(int totalItem)
    {
        // put your code here
        this.totalItem = totalItem;
    }
    
    /**
     * Untuk mengupdate variabel jumlah barang total
     * 
     * @param String
     */
    public void setInvoiceStatus(InvoiceStatus status)
    {
        // put your code here
        this.status = status;
    }
    
    /**
     * Untuk print data-data yang penting
     * 
     */
    public void printData()
    {
        System.out.println("===INVOICE===");
        System.out.println("ID : " + id);
        System.out.println("Date : " + date);
        System.out.println("Item : " + item.getName());
        System.out.println("Total Item : " + totalItem);
        System.out.println("Total Harga : " + totalPrice);
        System.out.println("Status : " + status);
    }
}
