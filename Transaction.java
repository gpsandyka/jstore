
/**
 * Letak transaksi berlangsung
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.0
 * @since 28-02-2019
 */
public class Transaction
{
    
    /**
     * Untuk memesan barang yang baru
     *
     * @param supplier
     */
    public static void orderNewItem(Supplier supplier)
    {
        Item barang = new Item(1, "Aghanim's Scepter", 9999, ItemStatus.New, 4200, ItemCategory.Stationery, supplier);
        
        Database_Item.addItem(barang);
        
        Invoice pembelian = new Invoice(1, barang, "06-03-2019 00:27", 4200);
        
        barang.setStatus(ItemStatus.New);
        
        pembelian.setInvoiceStatus(InvoiceStatus.Paid);
        
        barang.setStatus(ItemStatus.Sold);
        
        System.out.println("===Order New Item===");
        pembelian.printData();
        barang.printData();
    }
    
    /**
     * Untuk memesan barang yang bekas
     *
     * @param supplier
     */
    public static void orderSecondItem(Supplier supplier)
    {
        Item barang = new Item(1, "Aghanim's Scepter", 9999, ItemStatus.New, 4200, ItemCategory.Stationery, supplier);
        
        Database_Item.addItem(barang);
        
        Invoice pembelian = new Invoice(1, barang, "06-03-2019 00:27", 4200);
        
        barang.setStatus(ItemStatus.Second);
        
        pembelian.setInvoiceStatus(InvoiceStatus.Paid);
        
        barang.setStatus(ItemStatus.Sold);
        
        System.out.println("===Order Second Item===");
        pembelian.printData();
        barang.printData();
    }
    
    /**
     * Untuk memesan barang yang Refurbished
     *
     * @param supplier
     */
    public static void orderRefurbishedItem(Supplier supplier)
    {
        Item barang = new Item(1, "Aghanim's Scepter", 9999, ItemStatus.New, 4200, ItemCategory.Stationery, supplier);
        
        Database_Item.addItem(barang);
        
        Invoice pembelian = new Invoice(1, barang, "06-03-2019 00:27", 4200);
        
        barang.setStatus(ItemStatus.New);
        
        pembelian.setInvoiceStatus(InvoiceStatus.Paid);
        
        barang.setStatus(ItemStatus.Refurbished);
        
        System.out.println("===Order Refurbished Item===");
        pembelian.printData();
        barang.printData();
    }
    
    /**
     * Untuk menjual barang dan lunas
     *
     * @param item
     */
    public static void sellItemPaid(Item item)
    {
        Invoice pembelian = new Invoice(1, item, "06-03-2019 00:27", 4200);
        
        pembelian.setInvoiceStatus(InvoiceStatus.Paid);
        
        item.setStatus(ItemStatus.Sold);
        
        System.out.println("===Sell Item Paid===");
        pembelian.printData();
    }
    
    /**
     * Untuk menjual barang dan belum lunas
     *
     * @param item
     */
    public static void sellItemUnpaid(Item item)
    {
        Invoice pembelian = new Invoice(1, item, "06-03-2019 00:27", 4200);
        
        pembelian.setInvoiceStatus(InvoiceStatus.Unpaid);
        
        item.setStatus(ItemStatus.Sold);
        
        System.out.println("===Sell Item Unpaid===");
        pembelian.printData();
    }
    
    /**
     * Untuk menjual barang yang di install
     *
     * @param item
     */
    public static void sellItemInstallment(Item item)
    {
        Invoice pembelian = new Invoice(1, item, "06-03-2019 00:27", 4200);
        
        pembelian.setInvoiceStatus(InvoiceStatus.Installment);
        
        item.setStatus(ItemStatus.Sold);
        
        System.out.println("===Sell Item Installment===");
        pembelian.printData();
    }
}
