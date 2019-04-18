
/**
 * Enumerasi status invoice
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.0
 * @since 14-03-2019
 */
public enum InvoiceStatus
{
    Paid("Paid"), Unpaid("Unpaid"), Installment("Installment");
        
    private String status;
    
    InvoiceStatus(String status)
    {
        this.status = status;
    }
    
    public String toString()
    {
        return status;
    }
}
