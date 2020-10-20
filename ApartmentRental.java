
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
/**
 * This is the class for GUI of the system.
 * 
 * @author (darpan neupane)
 * @version(2.0)
 */
public class ApartmentRental implements ActionListener
{
    private ArrayList<Apartment>apartmentList;//defining a array list
    
    private Container contentPane;// defining a contentPane
    
    private JFrame frame;// defining a JFrame
    
    private JTextField txtdes;//defining text fields
    private JTextField txtdp;
    private JTextField txtdr;
    private JTextField txtarea;
    private JTextField txtprice;
    private JTextField txtnoOfBedRoom;
    private JTextField txtnoOfBathRoom;
    private JTextField txtcustomerName;
    private JTextField txtdateOfHire;
    private JTextField txtdateOfVacant;
    private JTextField txtnumberOfDays;
   private JTextField txtApartmentNo;
    /**
     * it is a main method
     */
    public static void main(String[]args){
       ApartmentRental ApartmentRental = new ApartmentRental();
    }
    /**
     * it is a constructor
     */
    public ApartmentRental()
    {
        
        apartmentList= new ArrayList<Apartment>();
        createApartmentRental();
    }
    /**
     * making the GUI
     */
    private  void createApartmentRental()
    {
       JFrame frame=new JFrame("Apartment Rental Company");//creating new object of JFrame
       Container cp =frame.getContentPane();//getting content pane
       frame.setLayout(null);//setting layout to null
        
        JLabel lbldes=new JLabel("Description");//creating new objects for JLabel
        cp.add(lbldes);
        lbldes.setBounds(20,20,150,25);//adding label to content pane
        
        txtdes=new JTextField(20);//creating new object of JTextField
        cp.add(txtdes);//adding text field to content pane
        txtdes.setBounds(20,40,150,25);//adjusting the place of text fields
        
 
        
       JLabel lbldp=new JLabel("down payment");
        cp.add(lbldp);
        lbldp.setBounds(180,20,150,25);
        
        txtdp=new JTextField(20);
        cp.add(txtdp);
        txtdp.setBounds(180,40,150,25);
        
        JLabel lbldr=new JLabel("Daily rate");
        cp.add(lbldr);
        lbldr.setBounds(340,20,150,25);
        
        txtdr=new JTextField(20);
        cp.add(txtdr);
        txtdr.setBounds(340,40,150,25);
        
        JButton btnApartmentToRent = new JButton("Add Apartment To Rent");
        cp.add(btnApartmentToRent);
        btnApartmentToRent.setBounds(500,40,170,25);
        btnApartmentToRent.addActionListener(this);
        
        JLabel lblarea=new JLabel("area");
        cp.add(lblarea);
        lblarea.setBounds(120,70,150,25);
        
         txtarea=new JTextField(10);
        cp.add(txtarea);
        txtarea.setBounds(105,90,60,25);
       
        
        JLabel lblprice=new JLabel("price");
        cp.add(lblprice);
        lblprice.setBounds(20,70,150,25);
        
        txtprice=new JTextField(10);
        cp.add(txtprice);
        txtprice.setBounds(20,90,60,25);
       
        
        JLabel lblnoOfBedRoom=new JLabel("No.of Bed Room");
        cp.add(lblnoOfBedRoom);
        lblnoOfBedRoom.setBounds(180,70,150,25);
        
        txtnoOfBedRoom=new JTextField(20);
        cp.add(txtnoOfBedRoom);
        txtnoOfBedRoom.setBounds(180,90,150,25);
        
        JLabel lblnoOfBathRoom=new JLabel("No.Of Bath Room");
        cp.add(lblnoOfBathRoom);
        lblnoOfBathRoom.setBounds(340,70,150,25);
        
        txtnoOfBathRoom=new JTextField(20);
        cp.add(txtnoOfBathRoom);
        txtnoOfBathRoom.setBounds(340,90,150,25);
        
         JButton btnApartmentToSell = new JButton("Add Apartment To Sell");
        cp.add(btnApartmentToSell);
        btnApartmentToSell.setBounds(500,90,170,25);
        btnApartmentToSell.addActionListener(this);
        
         JLabel lblcustomerName=new JLabel("customer");
        cp.add(lblcustomerName);
        lblcustomerName.setBounds(20,120,150,25);
        
        txtcustomerName=new JTextField(20);
        cp.add(txtcustomerName);
        txtcustomerName.setBounds(20,140,150,25);
        
         JLabel lbldateOfHire=new JLabel("date of hire");
        cp.add(lbldateOfHire);
        lbldateOfHire.setBounds(180,120,150,25);
        
        txtdateOfHire=new JTextField(20);
        cp.add(txtdateOfHire);
        txtdateOfHire.setBounds(180,140,150,25);
        
         JLabel lbldateOfVacant=new JLabel("date of vacant");
        cp.add(lbldateOfVacant);
        lbldateOfVacant.setBounds(340,120,150,25);
        
        txtdateOfVacant=new JTextField(20);
        cp.add(txtdateOfVacant);
        txtdateOfVacant.setBounds(340,140,150,25);
        
         JLabel lblnumberOfDays=new JLabel("no of days");
        cp.add(lblnumberOfDays);
        lblnumberOfDays.setBounds(500,120,150,25);
        
        txtnumberOfDays=new JTextField(20);
        cp.add(txtnumberOfDays);
        txtnumberOfDays.setBounds(500,140,150,25);
        
        
        JLabel lblApartmentNo = new JLabel("Apartment No.");
        cp.add(lblApartmentNo);
        lblApartmentNo.setBounds(20,170,150,25);
        txtApartmentNo = new JTextField(20);
        cp.add(txtApartmentNo);
        txtApartmentNo.setBounds(20,190,150,25);
       
        JButton btnRentAnApartment = new JButton("Rent an Apartment");
        cp.add(btnRentAnApartment);
        btnRentAnApartment.setBounds(180,190,150,25);
        btnRentAnApartment.addActionListener(this);
        
        JButton btnSellAnApartment = new JButton("Sell an Apartment");
        cp.add(btnSellAnApartment);
        btnSellAnApartment.setBounds(510,190,150,25);
        btnSellAnApartment.addActionListener(this);
        
         JButton btnReturnAnApartment = new JButton("Return an Apartment");
        cp.add(btnReturnAnApartment);
        btnReturnAnApartment.setBounds(340,190,160,25);
        btnReturnAnApartment.addActionListener(this);
        
         JButton btnDisplayAll = new JButton("Display All");
        cp.add(btnDisplayAll);
        btnDisplayAll.setBounds(180,230,150,25);
        btnDisplayAll.addActionListener(this);
        
        JButton btnClear = new JButton("Clear");
        cp.add(btnClear);
        btnClear.setBounds(340,230,150,25);
       btnClear.addActionListener(this);
        
      /**
     * paking the frame
     */  
         frame.pack();
      /**
     * making the GUI visible
     */
        frame.setVisible(true);
     /**
     * defining the size of the layouts
     */
        frame.setSize(700,300);
        
     /**
     * disabling the resizable functions
     */
        frame.setResizable(false);
       
        
    
    }
     /**
     * it is for the Action Listner
     */
     public void actionPerformed(ActionEvent event){
        String command = event.getActionCommand();
        
        if(command.equals("Add Apartment To Rent")){
           btnApartmentToRent();
        }
        else if(command.equals("Add Apartment To Sell")){
            btnApartmentToSell();
            
        }
        
       else if (command.equals("Rent an Apartment")){
             btnRentAnApartment();
            }
            
       else if(command.equals("Return an Apartment")){
           btnReturnAnApartment();
        }
       else if(command.equals("Sell an Apartment")){
           btnSellAnApartment();
        }
        else if(command.equals("Display All")){
            btnDisplayAll();
        }
        else if(command.equals("Clear")){
            btnClear();
        }     
     
}
public void btnApartmentToRent(){
      /**
     * trying to catch method to handle exceptions
     */
     try{
         String description = txtdes.getText();//getting text from the text field
         int downPayment = Integer.parseInt(txtdp.getText());//getting text from the field and converting into integer
         int dailyRate = Integer.parseInt(txtdr.getText());//getting text from the text field and converting it into integer
         
         ApartmentToRent apartmentRent = new ApartmentToRent(description,downPayment,dailyRate);
         apartmentList.add(apartmentRent);
         
         JOptionPane.showMessageDialog(frame," Apartment has successfully added to Rent");//dialouge box
        }
        
     catch(NumberFormatException me){
         JOptionPane.showMessageDialog(frame,"Format Error!!");//exception error message
        }
     
     catch(NullPointerException np){
         JOptionPane.showMessageDialog(frame,"Error!!");
        }  
    }
    public void btnApartmentToSell(){
        /**
     * trying  to handle the exceptions
     */
       try{
           String description = txtdes.getText();
           int price = Integer.parseInt(txtprice.getText());
           int area = Integer.parseInt(txtarea.getText());
           int noOfBedRoom = Integer.parseInt(txtnoOfBedRoom.getText());
           int noOfBathRoom = Integer.parseInt(txtnoOfBathRoom.getText());
           
           ApartmentToSell apartment = new ApartmentToSell(description,price,area,noOfBedRoom,noOfBathRoom);
           apartmentList.add(apartment);
           JOptionPane.showMessageDialog(frame,"Apartment is successfully added to sell");
        }
        catch(NumberFormatException me){
            JOptionPane.showMessageDialog(frame,"Format Error!!");
        }
        catch(NullPointerException np){
            JOptionPane.showMessageDialog(frame,"Error!!");
        }
    }
     public void btnRentAnApartment(){
        try{
            int ApartmentNo = Integer.parseInt(txtApartmentNo.getText());
            String customerName = txtcustomerName.getText();
            String dateOfHire = txtdateOfHire.getText();
            String dateOfVacant = txtdateOfVacant.getText();
            int numberOfDays = Integer.parseInt(txtnumberOfDays.getText());
          if (ApartmentNo>=apartmentList.size()){
              JOptionPane.showMessageDialog(frame,"Invalid!!noPlease enter a valid VCD.");
            }
            else{
                
                ApartmentToRent btnRentAnApartment = (ApartmentToRent)apartmentList.get(ApartmentNo);
                btnRentAnApartment.rentOut(customerName,dateOfHire,dateOfVacant,numberOfDays);
                JOptionPane.showMessageDialog(frame,"Apartment is Rented");
            }
        }
        
     /**
     * exceptions
     */
       catch(NumberFormatException me){
           JOptionPane.showMessageDialog(frame,"Format Error!!");
        }
        catch(ArrayIndexOutOfBoundsException ae){
            JOptionPane.showMessageDialog(frame,"Error!!");
        }
        catch (NullPointerException ne){
            JOptionPane.showMessageDialog(frame,"Error!!");
    }
        
}

 public void btnReturnAnApartment(){
     try{
         int ApartmentNo = Integer.parseInt(txtApartmentNo.getText());
         
         if(ApartmentNo>=apartmentList.size()){
             JOptionPane.showMessageDialog(frame,"Invaild!!.....Please Enter a Valid apartmentNo.");
            }
            
            else{
                Apartment apartment= apartmentList.get(ApartmentNo);
                ApartmentToRent ApartmentReturn = (ApartmentToRent)apartmentList.get(ApartmentNo);
                ApartmentReturn.Return();
                
                JOptionPane.showMessageDialog(frame,"Apartment is returned back");
            }
        }
        catch(NumberFormatException me){
            JOptionPane.showMessageDialog(frame,"Format Error!!");
        }
        catch(ArrayIndexOutOfBoundsException ae){
            JOptionPane.showMessageDialog(frame,"INVALID!!...apartmentNo.");
        }
        catch(NullPointerException ne){
            JOptionPane.showMessageDialog(frame,"Error!!");
        }
}
  public void btnSellAnApartment(){
      try{
          String customerName = txtcustomerName.getText();
          int ApartmentNo = Integer.parseInt(txtApartmentNo.getText());
          
          if(ApartmentNo>=apartmentList.size()){
              JOptionPane.showMessageDialog(frame,"InValid!!....Please Enter a Valid apartmentNo.");
            }
            
            else{
                Apartment apartment=apartmentList.get(ApartmentNo);
                ApartmentToSell ApartmentSell = (ApartmentToSell)apartmentList.get(ApartmentNo);
                ApartmentSell.selling(customerName);
                
                JOptionPane.showMessageDialog(frame,"Apartment Sold");
            }
        }
        catch(NumberFormatException me){
            JOptionPane.showMessageDialog(frame,"Format Error!!");
        }
         catch(ArrayIndexOutOfBoundsException ae){
            JOptionPane.showMessageDialog(frame,"INVALID!!...apartmentNo.");
        }
        
        catch(NullPointerException ne){
            JOptionPane.showMessageDialog(frame,"Error!!");
        }
}
public void btnDisplayAll(){
      /**
     * calling the display method from apartmnt class
     */
    for(int x=0; x<=apartmentList.size(); x++){
            Apartment value =apartmentList.get(x);
            value.displayDescription();
       
    }
}
 public void btnClear(){
      /**
     * setting all the text fields to null
     */
        txtdes.setText("");
        txtdr.setText("");
        txtarea.setText("");
        txtprice.setText("");
        txtnoOfBedRoom.setText("");
        txtnoOfBathRoom.setText("");
        txtcustomerName.setText("");
        txtdateOfHire.setText("");
        txtdateOfVacant.setText("");
        txtnumberOfDays.setText("");
        txtApartmentNo.setText("");
    }
}
