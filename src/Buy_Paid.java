import java.util.*;
/**
 * Invoice pembelian dan dibayar
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.0
 * @since 21-03-2019
 */
public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE=InvoiceType.Buy;
    private InvoiceStatus INVOICE_STATUS=InvoiceStatus.Paid;
    private boolean isActive;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(ArrayList<Integer> item)
    {
        // initialise instance variables
        super(item);
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
     * Untuk print data-data yang penting
     * 
     */
    public String toString()
    {
        String temp = "ID : " + super.getId()
                + "', " + "Price total = '" + super.getTotalPrice()
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
                "\nStatus = PAID"+
                "\nBuy success.";
                */
        /*
        System.out.println("===INVOICE=== \nID : " + super.getId() + "\nDate : " + super.getDate() + "\nItem : " + (super.getItem()).getName());
        System.out.println("Total Item : " + super.getTotalItem());
        System.out.println("Total Harga : " + super.getTotalPrice());
        System.out.println("Status : " + INVOICE_STATUS);
        */
    }
}
