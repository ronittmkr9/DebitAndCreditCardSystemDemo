
/**
 * Write a description of class DebitCard here.
 * Creating a  DebitCard class and following instruction given on question
 * @author (Ronit Tamrakar)
 * @version (1.1)
 */
public class DebitCard extends BankCard//inherits from super class
{//Declaring variables
   private int PINnumber;
   private int WithdrawalAmount;
   private String dateOfWithdrawal;
   private boolean hasWithdrawn;
   private int CardId;
   
   public DebitCard(int BalanceAmount,int CardId, String BankAccount, String IssuerBank, String clientName, int pinNumber)//Creating constructor with 6parameters
   {
       super(clientName, BankAccount,IssuerBank,CardId,BalanceAmount);//calling from parent class
       super.setClientName(clientName);
       this.hasWithdrawn=false;//Assigning hasWithdrawn as false
       this.PINnumber=pinNumber;
   }
   //getter method
   public String getDateOfWithdrawal()
   {
       return this.dateOfWithdrawal;
   }
   public int getPinNumber()
   {
       return this.PINnumber;
   }
   public int getCardId()
   {
       return this.CardId;
   }
   public int getWithdrawalamount()
   {
       return this.WithdrawalAmount;
   }
   public boolean getHasWithdrawn()
   {
       return this.hasWithdrawn;
   }
   //setter method
   public void setWithdrawalAmount(int withdrawalAmount)
   {
       this.WithdrawalAmount=withdrawalAmount;
   }
   public void Withdraw(String dateOfWithdrawal,int PINnumber,int WithdrawalAmount, int CardId)
   {
       if (PINnumber==this.PINnumber && CardId == this.CardId)//functions only if condition is satisfied
        {
            if(WithdrawalAmount<=super.getBalanceAmount())
            {
                this.hasWithdrawn=true;
                System.out.println("You have withdrawn Rs."+WithdrawalAmount+" .");
                this.WithdrawalAmount=WithdrawalAmount;
                this.dateOfWithdrawal=dateOfWithdrawal;
                super.setBalanceAmount(getBalanceAmount()-WithdrawalAmount);
                System.out.println("Your new Balance is Rs."+getBalanceAmount());
            }
            else{
                System.out.println("Your Balance is insufficient.");
            }
        }
        else//functions if condition is not satisfied
        {
           System.out.println("Incorrect Credentials") ;
        }
   }
   @Override//inherit from superclass and modifying behaviour as needed
   public void display()
   {
       if(this.hasWithdrawn==true)
       {
           super.display();
           System.out.println("Withdrawn Date is"+getDateOfWithdrawal()+".");
           System.out.println("Your Pin Number is"+getPinNumber()+".");
           System.out.println("Withdrawal Amount is Rs."+getWithdrawalamount()+".");
           
       }
       else{
           System.out.println("Your Balance is Rs."+getBalanceAmount()+".");
        }
    }   

}
