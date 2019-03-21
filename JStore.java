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
        
        rumah.printData();
        suplai.printData();
        
        Transaction.orderNewItem(headset);
        Transaction.sellItemPaid(headset);
        Transaction.sellItemUnpaid(headset);
        Transaction.sellItemInstallment(headset);
    }
}
