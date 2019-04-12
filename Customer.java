import java.util.*;
import java.text.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 * Letak data costumer
 *
 * @author Sandyka Gunnisyah Putra
 * @version 1.5
 */

public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String email, String username, String password, Calendar birthDate)
    {
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        id = DatabaseCustomer.getLastCustomerID() + 1;
        this.birthDate=birthDate;
    }
    
    /**
     * Constructor with different parameter for objects of class Customer
     */
    public Customer(String name, String email, String username, String password, int id, int year, int month, int dayOfMonth)
    {
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        this.id=id;
        birthDate = new GregorianCalendar();
        birthDate.set(Calendar.YEAR, year);
        birthDate.set(Calendar.MONTH, month-1); // 11 = december
        birthDate.set(Calendar.DAY_OF_MONTH, dayOfMonth); // christmas eve
        //Agak copas dari http://tutorials.jenkov.com/java-date-time/java-util-calendar.html
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getEmail()
    {
        // put your code here
        return email;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getUsername()
    {
        // put your code here
        return username;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getPassword()
    {
        // put your code here
        return password;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        // put your code here
        return id;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Calendar getBirthDate()
    {
        // put your code here
        return birthDate;
    }
    /*
    public static void test()
    {
        Customer cus1 = new Customer("Daika", "Daika@sama", "Balabala", "1sampai6", 5, new GregorianCalendar(1995,5,5));
        Customer cus2 = new Customer("Daika", "Daika@sama", "Balabala", "1sampai6", 5, new GregorianCalendar(1995,5,5));
        Customer cus3 = new Customer("Daika", "Daika@sama", "Balabala", "1sampai6", 5, new GregorianCalendar(1995,5,5));
        
        cus1.setEmail("e.t.d@");
        cus2.setEmail("Ee_.td@ui.ac.id");
        cus3.setEmail("Sandyka.modul5@netlab.com");
        System.out.println(cus1.getEmail());
        System.out.println(cus2.getEmail());
        System.out.println(cus3.getEmail());
        
        cus1.setPassword("Netlab2019");
        cus2.setPassword("Netlab");
        cus3.setPassword("netlab2019");
        System.out.println(cus1.getPassword());
        System.out.println(cus2.getPassword());
        System.out.println(cus3.getPassword());
        
        Calendar cal = cus.getBirthDate();
        //System.out.printf("Birth date: %d %s %d", cal.get(Calendar.DATE), cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US), cal.get(Calendar.YEAR));
        System.out.println("Birth date: " + cal.get(Calendar.DATE) + " " + cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US) + " " + cal.get(Calendar.YEAR));
        
    }*/
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setName(String name)
    {
        // put your code here
        this.name = name;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setEmail(String email)
    {
        // put your code here
        final String REGEX = "(\\w|&|\\*|_|~)+(\\.?(\\w|&|\\*|_|~))*@(\\w)+((\\.?|-?)(\\w+))*";
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(email);
        if (m.matches() == true){
            this.email = email;
        }
        else{
            this.email = null;
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setUsername(String username)
    {
        // put your code here
        this.username = username;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setPassword(String password)
    {
        // put your code here
        final String REGEX = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)\\w{6,}";
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(password);
        if (m.matches() == true){
            this.password = password;
        }
        else{
            this.password = null;
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setId(int id)
    {
        // put your code here
        this.id = id;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setBirthDate(Calendar birthDate)
    {
        // put your code here
        this.birthDate = birthDate;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setBirthDate(int year, int month, int dayOfMonth)
    {
        // put your code here
        birthDate.set(Calendar.YEAR, year);
        birthDate.set(Calendar.MONTH, month-1); // 11 = december
        birthDate.set(Calendar.DAY_OF_MONTH, dayOfMonth); // christmas eve
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        // put your code here
        return ("Nama : " + name + "\nEmail : " + email + "\nUsername : " + username + "\nPassword : " + password + "\nID : " + id + "\nTanggal Lahir : " + birthDate.getTime());
    }
    
}
