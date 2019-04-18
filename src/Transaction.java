import java.util.*;
/**
 * Letak transaksi berlangsung
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.4
 * @since 21-03-2019
 */
public class Transaction
{
    
    /**
     * Untuk memesan barang yang baru
     *
     * @param supplier
     */
    public static void orderNewItem(ArrayList<Integer> item)
    {
        Invoice belibayar = new Buy_Paid(item);
        try {DatabaseInvoice.addInvoice(belibayar);}
        catch (InvoiceAlreadyExistsException e) {}
       
        if(belibayar instanceof Sell_Paid){
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else {
            System.out.println("Salah, Invoice Type bukan Sell _Paid");
        }
        
        System.out.println("===Order New Item===");
        belibayar.toString();
    }
    
    /**
     * Untuk memesan barang yang bekas
     *
     * @param supplier
     */
    public static void orderSecondItem(ArrayList<Integer> item)
    {
        Invoice belibayar2 = new Buy_Paid(item);
        try {DatabaseInvoice.addInvoice(belibayar2);}
        catch (InvoiceAlreadyExistsException e) {}

        if(belibayar2 instanceof Sell_Paid){
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else {
            System.out.println("Salah, Invoice Type bukan Sell _Paid");
        }
        
        System.out.println("===Order Second Item===");
        belibayar2.toString();
    }
    
    /**
     * Untuk memesan barang yang Refurbished
     *
     * @param supplier
     */
    public static void orderRefurbishedItem(ArrayList<Integer> item)
    {
        Invoice belibayar3 = new Buy_Paid(item);
        try {DatabaseInvoice.addInvoice(belibayar3);}
        catch (InvoiceAlreadyExistsException e) {}
       
        if(belibayar3 instanceof Sell_Paid){
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else {
            System.out.println("Salah, Invoice Type bukan Sell _Paid");
        }
        
        System.out.println("===Order Refurbished Item===");
        belibayar3.toString();
    }
    
    /**
     * Untuk menjual barang dan lunas
     *
     * @param item
     */
    public static void sellItemPaid(ArrayList<Integer> item, Customer customer)
    {
        Invoice jualbayar = new Sell_Paid(item, customer);
        try {DatabaseInvoice.addInvoice(jualbayar);}
        catch (InvoiceAlreadyExistsException e) {}
       
        System.out.println("===Sell Item Paid===");
        jualbayar.toString();
    }
    
    /**
     * Untuk menjual barang dan belum lunas
     *
     * @param item
     */
    public static void sellItemUnpaid(ArrayList<Integer> item, Customer customer)
    {
        Invoice jualtakbayar = new Sell_Unpaid(item, customer);
        try {DatabaseInvoice.addInvoice(jualtakbayar);}
        catch (InvoiceAlreadyExistsException e) {}
       
        System.out.println("===Sell Item Unpaid===");
        jualtakbayar.toString();;
    }
    
    /**
     * Untuk menjual barang yang di install
     *
     * @param item
     */
    public static void sellItemInstallment(ArrayList<Integer> item, Customer customer)
    {
        Invoice jualinstall = new Sell_Installment(item, customer);
        try {DatabaseInvoice.addInvoice(jualinstall);}
        catch (InvoiceAlreadyExistsException e) {}
       
        System.out.println("===Sell Item Installment===");
        jualinstall.toString();
    }
    
    /**
     * Untuk menjual barang yang di install
     *
     * @param item
     */
    public static boolean finishTransaction(Invoice invoice)
    {
        if (invoice.getInvoiceStatus() == InvoiceStatus.Unpaid || invoice.getInvoiceStatus() == InvoiceStatus.Installment) {
            for (Invoice temp : DatabaseInvoice.getInvoiceDatabase()) {
                if (temp == invoice) {
                    temp.setIsActive(false);
                    invoice.setIsActive(false);
                    System.out.println(temp.getIsActive());
                    return true;
                }
            }
        }
        return false;
       
    }
    
    /**
     * Untuk menjual barang yang di install
     *
     * @param item
     */
    public static boolean cancelTransaction(Invoice invoice)
    {
        if (invoice.getInvoiceStatus() == InvoiceStatus.Unpaid || invoice.getInvoiceStatus() == InvoiceStatus.Installment) {
            for (Invoice temp : DatabaseInvoice.getInvoiceDatabase()) {
                if (temp == invoice) {
                    try {DatabaseInvoice.removeInvoice(temp.getId());}
                    catch (InvoiceNotFoundException e) {}
                    return true;
                }
            }
        }
        return false;
    }
}
