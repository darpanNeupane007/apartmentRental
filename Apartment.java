
/**
 * This is the VideoCd class which displays the description and name as an output..
 * Date:2014/06/04
 * @author (darpan neupane) 
 */
public class Apartment
{
   public String description;
   public String customerName;

 /**
 * 
 */
public Apartment(String Newdescription)
{
       description=Newdescription;
       customerName="";
}
/**
 * Get method for returning customer name
 */
   public String getcustomerName()
   {
       return this.customerName;
   }
/**
 * Get method for returning information
 */
   
   public String getdescription()
   {
       return this.description;   
    }
/**
 * 
 */
   public void setCustomerName(String name)
{
  customerName=name;

}
public void displayDescription()
{
    System.out.println("Description:"+description);
      if (customerName.equals(""))
    {
     System.out.println("Custumer name"+customerName);   
    }
}

            
   }

  



