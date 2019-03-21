
/**
 * Invoice penjualan dan belum dibayar
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.0
 * @since 21-03-2019
 */
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS=InvoiceStatus.Unpaid;
    private String dueDate;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Unpaid(int id, Item item, String date, int totalItem, int totalPrice, String dueDate)
    {
        // initialise instance variables
        super(id, item, date, totalItem, totalPrice);
        this.dueDate = dueDate;
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
     * Untuk mengembalikan tanggal
     * 
     * @return String
     */
    public String getDueDate()
    {
        // put your code here
        return dueDate;
    }
    
    /**
     * Untuk print data-data yang penting
     * 
     u// */
    public void printData()
    {
        System.out.println("===INVOICE===");
        System.out.println("ID : " + super.getId());
        System.out.println("Date : " + super.getDate());
        System.out.println("Item : " + (super.getItem()).getName());
        System.out.println("Total Item : " + super.getTotalItem());
        System.out.println("Total Harga : " + super.getTotalPrice());
        System.out.println("Status : " + INVOICE_STATUS);
        System.out.println("Due Date : " + dueDate);
    }
}