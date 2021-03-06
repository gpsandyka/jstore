import java.util.*;
/**
 * Invoice penjualan dan dibayar
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.5
 * @since 21-03-2019
 */
public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS=InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        // initialise instance variables
        super(item);
        this.customer = customer;
        isActive = false;
        /*
        super.setId(id);
        super.setItem(item);
        super.setDate(date);
        super.setTotalItem(totalItem);
        super.setTotalPrice(totalPrice);
        */
        
    }

    /**
     * Untuk mengembalikan customer
     * 
     * @return Customer
     */
    public Customer getCustomer()
    {
        // put your code here
        return customer;
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
     * Untuk memasukkan customer
     * 
     * @param customer
     */
    public void setCustomer(Customer customer)
    {
        // put your code here
        this.customer = customer;
    }
    
    /**
     * Untuk print data-data yang penting
     * 
     */
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
                "\nCustomer ID : "+getCustomer().getId()+
                "\nCustomer Name = "+getCustomer().getName()+
                "\nStatus = PAID"+
                "\nSell success.";
                */
        
        /*
        System.out.println("===INVOICE===");
        System.out.println("ID : " + super.getId());
        System.out.println("Date : " + super.getDate());
        System.out.println("Item : " + (super.getItem()).getName());
        System.out.println("Total Item : " + super.getTotalItem());
        System.out.println("Total Harga : " + super.getTotalPrice());
        System.out.println("Status : " + INVOICE_STATUS);
        */
    }
}
