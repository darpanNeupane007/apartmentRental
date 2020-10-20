


    public class ApartmentToSell extends Apartment
{
    private int area;  
    private int price;
    private int totalBedRoom;
    private int totalBathRoom;
    private boolean sold;
 
  /**
   * Constructor for objects of class ApartmentToSell
   */
  public ApartmentToSell(String description,int area,int NewPrice,int NewtotalBedRoom,int NewtotalBathRoom)
    {
      super(description);
      price=NewPrice;
      totalBedRoom=NewtotalBedRoom;
      totalBathRoom=NewtotalBathRoom;
      sold=false;  
    } 
  
  /**
   * Get methods  for returning the values
   */
  public int getPrice()
  {
   return price;  
  }
  
  public int getTotalBedRoom()
  {
   return totalBedRoom;  
  }
  
  public int getTotalBathRoom()
  {
    return totalBathRoom;  
  }
  
  public boolean getsold()
  {
    return sold; 
  }
  
  /**
   * Set method for setting new values 
   */
  public void priceChange(int newPrice)
  {
        if(sold==true)
        {
            System.out.println("Sorry the apartment you are looking for is already sold. ");
            System.out.println("The price is fixed and unchangable");
        }
        else
        {
            price=newPrice;
            sold=true;
        }
  } 
  
  /**
   * Accepts the parameter value and initializes to its inatant variable 
   */
  public void selling(String NewCustomerName)
  {
        if (sold==false)
        {
           super.setCustomerName(NewCustomerName);
           sold=true;
        }
        else
        {
            System.out.println("The apartment you are looking for has already been sold."); 
        }
  }
    
  
    
    
}
