import java.util.*;
/**
 * Tempat Invoice.
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.1
 * @since 21-03-2019
 */
public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private ArrayList<Integer> item;
    private Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;
    
    private InvoiceStatus status;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(ArrayList<Integer> item)
    {
        // initialise instance variables
        id = DatabaseInvoice.getLastInvoiceID() + 1;
        this.item = item;
        //totalPrice = item.getPrice() * totalItem;
        date = date.getInstance();
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
    public ArrayList<Integer> getItem()
    {
        // put your code here
        return item;
    }

    /**
     * Untuk mengembalikan tanggal
     * 
     * @return String
     */
    public Calendar getDate()
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
     * Untuk mengembalikan status invoice
     * 
     * @return String
     */
    public abstract InvoiceStatus getInvoiceStatus();
    
    /**
     * Untuk mengembalikan tipe invoice
     * 
     * @return String
     */
    public abstract InvoiceType getInvoiceType();
    
    /**
     * Untuk mengembalikan tanda aktif
     * 
     * @return boolean
     */
    public boolean getIsActive()
    {
        // put your code here
        return isActive;
    }
    
    /**
     * Untuk mengembalikan pelanggan
     * 
     * @return Customer
     */
    public Customer getCustomer()
    {
        // put your code here
        return customer;
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
    public void setItem(ArrayList<Integer> item)
    {
        // put your code here
        this.item = item;
    }

    /**
     * Untuk mengupdate variabel date
     * 
     * @param date
     */
    public void setDate(Calendar date)
    {
        // put your code here
        this.date = date;
    }

    /**
     * Untuk mengupdate variabel harga total
     * 
     * @param totalPrice
     */
    public void setTotalPrice()
    {
        // put your code here
        for (int id : item) {
            totalPrice = totalPrice + DatabaseItem.getItemFromID(id).getPrice();
        }
    }
    
      
    /**
     * Untuk mengupdate variabel jumlah barang total
     * 
     * @param String
     */
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status;
    }
    
    /**
     * Untuk mengupdate variabel jumlah barang total
     * 
     * @param totalItem
     */
    public void setIsActive(boolean isActive)
    {
        // put your code here
        this.isActive = isActive;
    }
    
    /**
     * Untuk print data-data yang penting
     * 
     */
    public abstract String toString();
    /*
    {
        System.out.println("===INVOICE===");
        System.out.println("ID : " + id);
        System.out.println("Date : " + date);
        System.out.println("Item : " + item.getName());
        System.out.println("Total Item : " + totalItem);
        System.out.println("Total Harga : " + totalPrice);
        System.out.println("Status : Undefined"); //Seharusnya method ini tidak dijalankan karena setiap subclass telah meng override method ini
    }
    */
}
