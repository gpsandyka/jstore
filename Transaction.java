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
    public static void orderNewItem(Item item)
    {
        Invoice belibayar = new Buy_Paid(1, item, 1);  
       
        if(belibayar instanceof Sell_Paid){
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else {
            System.out.println("Salah, Invoice Type bukan Sell _Paid");
        }
        
        System.out.println("===Order New Item===");
        item.toString();
        belibayar.toString();
    }
    
    /**
     * Untuk memesan barang yang bekas
     *
     * @param supplier
     */
    public static void orderSecondItem(Item item)
    {
        Invoice belibayar = new Buy_Paid(1, item, 1);  
       
        if(belibayar instanceof Sell_Paid){
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else {
            System.out.println("Salah, Invoice Type bukan Sell _Paid");
        }
        
        System.out.println("===Order Second Item===");
        item.toString();
        belibayar.toString();
    }
    
    /**
     * Untuk memesan barang yang Refurbished
     *
     * @param supplier
     */
    public static void orderRefurbishedItem(Item item)
    {
        Invoice belibayar = new Buy_Paid(1, item, 1);  
       
        if(belibayar instanceof Sell_Paid){
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else {
            System.out.println("Salah, Invoice Type bukan Sell _Paid");
        }
        
        System.out.println("===Order Refurbished Item===");
        item.toString();
        belibayar.toString();
    }
    
    /**
     * Untuk menjual barang dan lunas
     *
     * @param item
     */
    public static void sellItemPaid(Item item, Customer customer)
    {
        Invoice jualbayar = new Sell_Paid(1, item, 1, customer);  
       
        System.out.println("===Sell Item Paid===");
        item.toString();
        jualbayar.toString();
    }
    
    /**
     * Untuk menjual barang dan belum lunas
     *
     * @param item
     */
    public static void sellItemUnpaid(Item item, Customer customer)
    {
        Invoice jualtakbayar = new Sell_Unpaid(1, item, 1, customer);  
       
        System.out.println("===Sell Item Unpaid===");
        item.toString();
        jualtakbayar.toString();;
    }
    
    /**
     * Untuk menjual barang yang di install
     *
     * @param item
     */
    public static void sellItemInstallment(Item item, Customer customer)
    {
        Invoice jualinstall = new Sell_Installment(1, item, 1, 6, customer);  
       
        System.out.println("===Sell Item Installment===");
        item.toString();
        jualinstall.toString();
    }
}
