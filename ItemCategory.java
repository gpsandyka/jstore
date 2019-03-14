
/**
 * Enumerasi kategori item
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.0
 * @since 14-03-2019
 */
public enum ItemCategory
{
    Electronics("Electronics"), Furniture("Furniture"), Stationery("Stationery");
        
    private String category;
    
    ItemCategory(String category)
    {
        this.category = category;
    }
    
    public String toString()
    {
        return category;
    }
}
