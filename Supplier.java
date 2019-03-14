
/**
 * Tempat pengsuplai.
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.0
 * @since 28-02-2019
 */
public class Supplier
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor for objects of class Supplier
     */
    public Supplier(int id, String name, String email, String phoneNumber, Location location)
    {
        // initialise instance variables
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    /**
     * Untuk mengembalikan id
     * 
     * @return id
     */
    public int getId()
    {
        // put your code here
        return id;
    }

    /**
     * Untuk mengembalikan nama
     * 
     * @return String
     */
    public String getName()
    {
        // put your code here
        return name;
    }

    /**
     * Untuk mengembalikan email
     * 
     * @return String
     */
    public String getEmail()
    {
        // put your code here
        return email;
    }

    /**
     * Untuk mengembalikan nomor telepon
     * 
     * @return int
     */
    public String getPhoneNumber()
    {
        // put your code here
        return phoneNumber;
    }

    /**
     * Untuk mengembalikan alamat
     * 
     * @return Location
     */
    public Location getLocation()
    {
        // put your code here
        return location;
    }

    /**
     * Untuk mengupdate variabel id
     * 
     * @param id
     */
    public void setId(int id)
    {
        // put your code here
        this.id = id;
    }

    /**
     * Untuk mengupdate variabel nama
     * 
     * @param name
     */
    public void setName(String name)
    {
        // put your code here
        this.name = name;
    }

    /**
     * Untuk mengupdate variabel email
     * 
     * @param email
     */
    public void setEmail(String email)
    {
        // put your code here
        this.email = email;
    }

    /**
     * Untuk mengupdate variabel nomor telepon
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber)
    {
        // put your code here
        this.phoneNumber = phoneNumber;
    }

    /**
     * Untuk mengupdate variabel alamat
     * 
     * @param Location
     */
    public void setLocation(Location location)
    {
        // put your code here
        this.location = location;
    }
    
    /**
     * Untuk print data-data yang penting
     * 
     */
    public void printData()
    {
        System.out.println("===SUPPLIER===");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Location : " + location.getCity() + ", " + location.getProvince());
    }
}
