
/**
 * Enumerasi status item
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.0
 * @since 14-03-2019
 */
public enum ItemStatus
{
    New("New"), Second("Second"), Refurbished("Refurbished"), Sold("Sold");
        
    private String status;
    
    ItemStatus(String status)
    {
        this.status = status;
    }
    
    public String toString()
    {
        return status;
    }
}
