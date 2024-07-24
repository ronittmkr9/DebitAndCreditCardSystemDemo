
/**
 * Write a description of class BankCard here.
 * Creating a BankCard Class and and following instructons of question
 * @author (Ronit Tamrakar)
 * @version (1.1)
 */
public class BankCard//class created
{
   //Declaring variables
   private String ClientName;
   private int CardId;
   private String BankAccount;
   private String IssuerBank;
   private int BalanceAmount;
   
   public BankCard( String ClientName,String BankAccount, String IssuerBank, int CardId, int BalanceAmount){
       this.ClientName=ClientName;
       this.CardId=CardId;
       this.BalanceAmount=BalanceAmount;
       this.IssuerBank=IssuerBank;
       this.BankAccount=BankAccount;
   }//creating constructor with 4 parameters and setting ClientName empty.
   //Creating setter method which sets or updates value of variable.
   public void setClientName(String ClientName)
   {
       this.ClientName=ClientName;
   }
   public void setBalanceAmount(int BalanceAmount)
   {
       this.BalanceAmount=BalanceAmount;
   }
   public String getClientName()//Creating getter method
   {
       return this.ClientName;
   }
   public int getCardId()
   {
       return this.CardId;
   }
   public int getBalanceAmount()
   {
       return this.BalanceAmount;
   }
   public String getIssuerBank()
   {
       return this.IssuerBank;
   }
   public String getBankAccount()
   {
       return this.BankAccount;
   }
   public void display()//Displaying data with annotation.
   {
       if(this.ClientName.equals(""))
       {
           System.out.println("Please Enter Your Name");//prints
       }else{
           System.out.println("Name is"+ getClientName()+".");
           System.out.println("Your IssuerBank is"+ getIssuerBank()+".");
           System.out.println("Your Account Number is"+getBankAccount()+".");
           System.out.println("Your Balance"+ getBalanceAmount()+".");
           System.out.println("Your CardId is"+ getCardId()+".");
       }
   }

}
