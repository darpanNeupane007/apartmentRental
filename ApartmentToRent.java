
public class ApartmentToRent extends Apartment
{
    private String dateOfHire;
    private String dateOfVacant;
    private int downPayment;
    private int numberOfDays;
    private int dailyRate;
    private int totalRent;
    private boolean onLoan;
    public ApartmentToRent(String Newdescription,int NewdownPayment,int NewdailyRate)

      {  super(Newdescription);
        downPayment=NewdownPayment;
        NewdailyRate=NewdailyRate;
        numberOfDays=0;
        totalRent=0;
        dateOfHire="";
        dateOfVacant="";
        onLoan=false;
    
    }
    public int getDailyRate()
      {
        return dailyRate;  
      }
    public int getDownPayment()
      {
        return downPayment; 
      }
     public String getDateOfHire()
    {
        return dateOfHire;
    }

     public String getDateOfVacant()
     {
        return dateOfVacant;  
     }
     
    
      
      public int getNumberOfDays()
      {
        return numberOfDays;  
      }
      
      
       
      public int getTotalRent()
      {
        return totalRent;  
      }
      
      public boolean getLoan()
      {
        return onLoan;    
      }   
      /**
        * Set method for setting new values
        */
       public void setDownPayment(int dp)
      
      {
        downPayment=dp;
      }
    
      public void  setDailyRate(int dr)
      {
        dailyRate=dr;
      }
      
       /**
        * methods takes the parameter values for initializing the variable to rent apartment
        */
       public void rentOut (String New_customer_Name,String new_date_of_hire,String new_date_of_vacant,int new_number_of_days)
     {
          if(onLoan==true)
            {
                   System.out.println("Sorry..the apartment you are looking for is currently not available");
                   System.out.println("Date of vacant = "+dateOfVacant);
             }
      
            else
            {
                   super.setCustomerName(New_customer_Name);    
                   dateOfHire=new_date_of_hire;
                   dateOfVacant=new_date_of_vacant;
                   onLoan=true;
                   totalRent=downPayment+dailyRate*numberOfDays;
                   numberOfDays=new_number_of_days;
             } 
    }
    
     /**
      * Methods for making the Apartment available to the housing company
      */
     public void Return()
     {
         if(onLoan==true)
         {
           super.setCustomerName("");
           numberOfDays=0;
           dateOfHire="";
           dateOfVacant="";
           onLoan=false;
         }
         else
         {
          System.out.println("The videoCD you are looking for is available");   
         }
         
         
    }
    
     /**
      * Prints the description and total rent collected
      */
     public void displayDescription()
    {
        System.out.println("Description of apartment: "+super.getdescription());
        System.out.println("Total rent: "+getTotalRent());
        
    }
    
     /**
      * Displays the details of rent colected as well as outputs down payment and daily rate,
      * prints the date of hire,date of vacant and number of days the apartment taken
      */
     public void display_Description()
    {
        super.displayDescription();
        System.out.println("Down payment: "+downPayment);
        System.out.println("Daily rate: "+dailyRate);
        if(onLoan==true)
        {
            System.out.println("Date of hire: "+dateOfHire);
            System.out.println("Date Of vacant: "+dateOfVacant);
            System.out.println("Number of days: "+numberOfDays);
        }
    } 
     
}  
    

