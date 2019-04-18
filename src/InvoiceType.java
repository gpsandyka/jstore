/**
 * Enumerasi tipe Invoice
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.0
 * @since 21-03-2019
 */
public enum InvoiceType
{
    Buy("Buy"), Sell("Sell");
        
    private String tipe;
    
    InvoiceType(String tipe)
    {
        this.tipe = tipe;
    }
    
    public String toString()
    {
        return tipe;
    }
}