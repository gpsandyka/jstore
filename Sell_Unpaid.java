import java.util.*;
/**
 * Invoice penjualan dan belum dibayar
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.5
 * @since 21-03-2019
 */
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS=InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;


    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Unpaid(int id, Item item, int totalItem, Customer customer)
    {
        // initialise instance variables
        super(id, item, totalItem);
        this.customer = customer;
        dueDate.getInstance();
        dueDate.add(Calendar.DAY_OF_MONTH, 1); 
        /*
        super.setId(id);
        super.setItem(item);
        super.setDate(date);
        super.setTotalItem(totalItem);
        super.setTotalPrice(totalPrice);
        */
        
    }

    
    /**
     * Untuk mengembalikan status invoice
     * 
     * @return String
     */
    public InvoiceStatus getInvoiceStatus()
    {
        // put your code here
        return INVOICE_STATUS;
    }
    
    /**
     * Untuk mengembalikan tipe invoice
     * 
     * @return String
     */
    public InvoiceType getInvoiceType()
    {
        // put your code here
        return INVOICE_TYPE;
    }
    
    /**
     * Untuk mengembalikan status invoice
     * 
     * @return String
     */
    public Customer getCustomer()
    {
	return customer;
    }
    
    /**
     * Untuk mengembalikan status invoice
     * 
     * @return String
     */
    public Calendar getDueDate()
    {
	return dueDate;
    }

    /**
     * Untuk mengembalikan status invoice
     * 
     * @return String
     */
    public void setCustomer(Customer customer)
    {
	this.customer = customer;
    }
    
    /**
     * Untuk mengembalikan status invoice
     * 
     * @return String
     */
    public void setDueDate(Calendar dueDate)
    {
	this.dueDate = dueDate;
    }
        
    /**
     * Untuk print data-data yang penting
     * 
     u// */
    public String toString()
    {
        /*
        System.out.println("===INVOICE===");
        System.out.println("ID : " + super.getId());
        System.out.println("Date : " + super.getDate());
        System.out.println("Item : " + (super.getItem()).getName());
        System.out.println("Total Item : " + super.getTotalItem());
        System.out.println("Total Harga : " + super.getTotalPrice());
        System.out.println("Status : " + INVOICE_STATUS);
        System.out.println("Due Date : " + dueDate);
        */
       return "";
    }
}
