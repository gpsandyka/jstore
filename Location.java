
/**
 * Tempat alamat.
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.0
 * @since 28-02-2019
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String description;
    private String city;

    /**
     * Constructor for objects of class Location
     */
    public Location(String city, String province, String description)
    {
        // initialise instance variables
        this.province = province;
        this.city = city;
        this.description = description;
    }

    /**
     * Untuk mengembalikan nama provinsi
     * 
     * @return String
     */
    public String getProvince()
    {
        // put your code here
        return province;
    }
    
    /**
     * Untuk mengembalikan nama kota
     * 
     * @return String
     */
    public String getCity()
    {
        // put your code here
        return city;
    }
    
    /**
     * Untuk mengembalikan deskripsi
     * 
     * @return String
     */
    public String getDescription()
    {
        // put your code here
        return description;
    }
    
    /**
     * Untuk mengupdate variabel nama provinsi
     * 
     * @param province
     */
    public void setProvince(String province)
    {
        // put your code here
        this.province = province;
    }
    
    /**
     * Untuk mengupdate variabel nama kota
     * 
     * @param city
     */
    public void setCity(String city)
    {
        // put your code here
        this.city = city;
    }
    
    /**
     * Untuk mengupdate variabel deskripsi
     * 
     * @param description
     */
    public void setDescription(String description)
    {
        // put your code here
        this.description = description;
    }
    
    /**
     * Untuk print nama provinsi
     * 
     */
    public void printData()
    {
        System.out.println(province);
    }
}
