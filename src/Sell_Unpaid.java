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
    private boolean isActive;


    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        // initialise instance variables
        super(item);
        this.customer = customer;
        dueDate = dueDate.getInstance();
        dueDate.add(Calendar.DAY_OF_MONTH, 1); 
        isActive = true;
        /*
        super.setId(id);
        super.setItem(item);
        super.setDate(date);
        super.setTotalItem(totalItem);
        super.setTotalPrice(totalPrice);
        */
        
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
        String temp = "ID : " + super.getId()
                + "', " + "Price total = '" + super.getTotalPrice()
                + "', " + "Customer ID = '" + this.customer.getId()
                + "', " + "Customer name = '" + this.customer.getName()
                + "', " + "Status = '" + INVOICE_STATUS
                + "', " + "Items: '";

        for (int id : getItem()) {
            if (DatabaseItem.getItemFromID(id) != null) {
                temp += "\n{ " + "Item ID: '" + DatabaseItem.getItemFromID(id).getId()
                        + "', " + "Name: " + DatabaseItem.getItemFromID(id).getName()
                        + "', " + "Price: " + DatabaseItem.getItemFromID(id).getPrice()
                        + "', " + "Category: " + DatabaseItem.getItemFromID(id).getCategory()
                        + "', " + "Supplier: " + DatabaseItem.getItemFromID(id).getSupplier().getName() + "'}";
            }
        }

        return temp;
        
        /*
        return  "ID = "+getId()+
                "\nItem = "+getItem()+
                "\nAmount = "+getTotalItem()+
                "\nBuyDate = "+getDate().getTime()+
                "\nPrice = "+getItem().getPrice()+
                "\nPrice Total = "+getTotalPrice()+
                "\nSupplier ID : "+getItem().getSupplier().getId()+
                "\nSupplier Name = "+getItem().getSupplier().getName()+
                "\nCustomer ID = "+getCustomer().getId()+
                "\nCustomer Name : "+getCustomer().getName()+
                "\nStatus = UNPAID"+
                "\nDue Date = "+getDueDate().getTime()+
                "\nIf payment is not received by Due Date, transaction will be canceled.";*/
        
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
    }
}
