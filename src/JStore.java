import java.util.*;

/**
 * Tempat fungsi utama JStore
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.0
 * @since 28-02-2019
 */
public class JStore
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
        // initialise instance variables
    }

    /**
     * Letak dari program utama JStore
     *
     */
    public static void main (String[] args)
    {
        Location rumah = new Location("Bandung", "Jawa Barat", "Home Sweet Home~");
        try {
            DatabaseSupplier.addSupplier(new Supplier("Sandyka Gunnisyah Putra", "sandyka.gunnisyah@ui.ac.id", "082240862188", rumah));
            DatabaseSupplier.addSupplier(new Supplier("Gunnisyah Putra", "sandyka.gunnisyah@ui.ac.i", "08224086218", rumah));
            DatabaseSupplier.addSupplier(new Supplier("Putra", "sandyka.gunnisyah@ui.ac", "0822408621", rumah));

            DatabaseCustomer.addCustomer(new Customer("Daika", "Daika@sama", "DaikaNyan", "Daidaidai", 1998, 5, 5));
            DatabaseCustomer.addCustomer(new Customer("Daik", "Daika@Nyan", "DaikaNya", "Daidaidai", 1998, 5, 5));
            DatabaseCustomer.addCustomer(new Customer("Dai", "Daika@san", "DaikaNy", "Daidaidai", 1998, 5, 5));

            DatabaseItem.addItem(new Item("Headset Razor", ItemStatus.New, 500000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(1)));
            DatabaseItem.addItem(new Item("Headset Razor", ItemStatus.New, 500000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(2)));
            DatabaseItem.addItem(new Item("Headset Razor", ItemStatus.New, 500000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(3)));
            DatabaseItem.addItem(new Item("Headset Raz", ItemStatus.New, 2000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(1)));

            ArrayList<Integer> item = new ArrayList<>();

            item.add(1);
            item.add(2);

            DatabaseInvoice.addInvoice(new Sell_Paid(item,DatabaseCustomer.getCustomer(1)));
            DatabaseInvoice.addInvoice(new Sell_Unpaid(item,DatabaseCustomer.getCustomer(2)));
            DatabaseInvoice.addInvoice(new Sell_Installment(item,DatabaseCustomer.getCustomer(3)));

        }
        catch (SupplierAlreadyExistsException e){
            System.out.println("Supplier duplikat oy");
        }
        catch (CustomerAlreadyExistsException e1) {
            System.out.println("Customer duplikat oy");
        }
        catch (ItemAlreadyExistsException e2) {
            System.out.println("Item duplikat oy");
        }
        catch (InvoiceAlreadyExistsException e3) {
            System.out.println("Invoice duplikat oy");
        }

        System.out.println("========== EXCEPTION TESTING ==============");

        System.out.println("========== ItemAlreadyExistsException ==============");
        try {
            DatabaseItem.addItem(new Item("Headset Razor", ItemStatus.New, 500000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(2)));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e.getExMessage());
        }
        System.out.println("========== ItemNotFoundException ==============");
        try {
            DatabaseItem.removeItem(9999);
        }
        catch (ItemNotFoundException e){
            System.out.println(e.getExMessage());
        }
        System.out.println("========== SupplierAlreadyExistsException ==============");
        try {
            DatabaseSupplier.addSupplier(new Supplier("Gunnisyah Putra", "sandyka.gunnisyah@ui.ac.i", "08224086218", rumah));
        }
        catch (SupplierAlreadyExistsException e){
            System.out.println(e.getExMessage());
        }
        System.out.println("========== SupplierNotFoundException ==============");
        try {
            DatabaseSupplier.removeSupplier(9999);
        }
        catch (SupplierNotFoundException e){
            System.out.println(e.getExMessage());
        }
        System.out.println("========== InvoiceAlreadyExistsException ==============");
        try {
            ArrayList<Integer> item = new ArrayList<>();

            item.add(1);
            item.add(2);

            DatabaseInvoice.addInvoice(new Sell_Paid(item,DatabaseCustomer.getCustomer(1)));
        }
        catch (InvoiceAlreadyExistsException e){
            System.out.println(e.getExMessage());
        }
        System.out.println("========== InvoiceNotFoundException ==============");
        try {
            DatabaseInvoice.removeInvoice(9999);
        }
        catch (InvoiceNotFoundException e){
            System.out.println(e.getExMessage());
        }
        System.out.println("========== CustomerDoesntHaveActiveException ==============");
        try {
            DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(1)); //Customer 1 hanya memiliki Invoice Sell Paid dimana isActive == false
        }
        catch (CustomerDoesntHaveActiveException e){
            System.out.println(e.getExMessage());
        }
        System.out.println("========== CustomerAlreadyExistsException ==============");
        try {
            DatabaseCustomer.addCustomer(new Customer("Daik", "Daika@Nyan", "DaikaNya", "Daidaidai", 1998, 5, 5));
        }
        catch (CustomerAlreadyExistsException e){
            System.out.println(e.getExMessage());
        }
        System.out.println("========== CustomerNotFoundException ==============");
        try {
            DatabaseCustomer.removeCustomer(9999);
        }
        catch (CustomerNotFoundException e){
            System.out.println(e.getExMessage());
        }



        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("========== Result ==============");
        System.out.println("========== Supplier ==============");

        for (Supplier supp : DatabaseSupplier.getSupplierDatabase()) {
            System.out.println(supp);
        }

        System.out.println("========== Customer ==============");
        

        for (Customer cus : DatabaseCustomer.getCustomerDatabase()) {
            System.out.println(cus);
        }

        System.out.println("========== Item ==============");
        

        for (Item item : DatabaseItem.getItemDatabase()) {
            System.out.println(item);
        }

        System.out.println("========== Invoice ==============");

        for (Invoice inv : DatabaseInvoice.getInvoiceDatabase()) {
            System.out.println(inv);
        }
        
        /*
         * 
        Location rumah = new Location("Bandung", "Jawa Barat", "Home Sweet Home~");
        Supplier suplai = new Supplier(1606906023, "Sandyka Gunnisyah Putra", "sandyka.gunnisyah@ui.ac.id", "082240862188", rumah);
        Item headset = new Item(1, "Headset Razor", 9999, ItemStatus.New, 500000, ItemCategory.Electronics, suplai);
        Customer cus = new Customer("Daika", "Daika@sama", "DaikaNyan", "Daidaidai", 1, 1998, 5, 5);
        Invoice bp = new Buy_Paid(1, headset, 1);
        Invoice sp = new Sell_Paid(2, headset, 2, cus); 
        Invoice si = new Sell_Installment(3, headset, 3, 3, cus);
        Invoice su = new Sell_Unpaid(4, headset, 4, cus);
         
        System.out.println("=================");
        System.out.println(rumah.toString());
        System.out.println("=================");
        System.out.println(suplai.toString());
        System.out.println("=================");
        System.out.println(headset.toString());
        System.out.println("=================");
        System.out.println(cus.toString());
        System.out.println("=================");
        System.out.println(bp.toString());
        System.out.println("=================");
        System.out.println(sp.toString());
        System.out.println("=================");
        System.out.println(si.toString());
        System.out.println("=================");
        System.out.println(su.toString());
        System.out.println("=================");
        
        Transaction.orderNewItem(headset);
        Transaction.sellItemPaid(headset);
        Transaction.sellItemUnpaid(headset);
        Transaction.sellItemInstallment(headset);*/
        
    }
}
