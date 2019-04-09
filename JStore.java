import java.util.Calendar;

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
        /*
        Transaction.orderNewItem(headset);
        Transaction.sellItemPaid(headset);
        Transaction.sellItemUnpaid(headset);
        Transaction.sellItemInstallment(headset);
        */
    }
}
