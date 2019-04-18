import java.util.*;
/**
 * Invoice penjualan dan pemasangan
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.5
 * @since 21-03-2019
 */
public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS=InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Installment(ArrayList<Integer> item, Customer customer)
    {
        // initialise instance variables
        super(item);
        this.installmentPeriod = installmentPeriod;
        this.customer = customer;
        this.isActive = true;
        //this.installmentPrice = (int)(totalPrice*1.02/installmentPeriod);
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
     * Untuk mengembalikan periode installment
     * 
     * @return int
     */
    public int getInstallmentPeriod()
    {
        // put your code here
        return installmentPeriod;
    }
    
    /**
     * Untuk mengembalikan harga installment
     * 
     * @return int
     */
    public int getInstallmentPrice()
    {
        // put your code here
        return installmentPrice;
    }

    /**
     * Untuk mengembalikan harga installment
     * 
     * @return int
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
     * Untuk mengatur harga installment
     * 
     */
    public void setInstallmentPrice()
    {
        // put your code here
        this.installmentPrice = (int)((super.getTotalPrice())*1.02/installmentPeriod);
    }
    
    /**
     * Untuk mengatur harga installment
     * 
     */
    public void setTotalPrice()
    {
        // put your code here
        //super.setTotalPrice(installmentPrice*installmentPeriod);
    }
    
    /**
     * Untuk mengatur harga installment
     * 
     */
    public void setCustomer()
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
                "\nInstallment Price = "+getInstallmentPrice()+
                "\nSupplier ID : "+getItem().getSupplier().getId()+
                "\nSupplier Name = "+getItem().getSupplier().getName()+
                "\nCustomer ID : "+getCustomer().getId()+
                "\nCustomer Name = "+getCustomer().getName()+
                "\nStatus = INSTALLMENT"+
                "\nInstallment Period = "+getInstallmentPeriod()+ " days"+
                "\nSell success."; */
        
        /*
        System.out.println("===INVOICE===");
        System.out.println("ID : " + super.getId());
        System.out.println("Date : " + super.getDate());
        System.out.println("Item : " + (super.getItem()).getName());
        System.out.println("Total Item : " + super.getTotalItem());
        System.out.println("Total Harga : " + super.getTotalPrice());
        System.out.println("Status : " + INVOICE_STATUS);
        System.out.println("Harga Instalasi : " + installmentPrice);
        */
    }
}
