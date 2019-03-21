
/**
 * Invoice penjualan dan pemasangan
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.0
 * @since 21-03-2019
 */
public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS=InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Installment(int id, Item item, String date, int totalItem, int totalPrice, int installmentPeriod)
    {
        // initialise instance variables
        super(id, item, date, totalItem, totalPrice);
        this.installmentPeriod = installmentPeriod;
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
        this.installmentPrice = (int)(totalPrice*1.02/installmentPeriod);
    }
    
    /**
     * Untuk mengatur harga installment
     * 
     */
    public void setTotalPrice()
    {
        // put your code here
        super.setTotalPrice(installmentPrice*installmentPeriod);
    }
    
    /**
     * Untuk print data-data yang penting
     * 
     */
    public void printData()
    {
        System.out.println("===INVOICE===");
        System.out.println("ID : " + super.getId());
        System.out.println("Date : " + super.getDate());
        System.out.println("Item : " + (super.getItem()).getName());
        System.out.println("Total Item : " + super.getTotalItem());
        System.out.println("Total Harga : " + super.getTotalPrice());
        System.out.println("Status : " + INVOICE_STATUS);
        System.out.println("Harga Instalasi : " + installmentPrice);
    }
}
