
/**
 * Write a description of class CreditCard here.
 * Creating a CreditCard class and following instructions of question
 * @author (Ronit Tamrakar)
 * @version (1.1)
 */
public class CreditCard extends BankCard//inherits from super class(BankCard class)
{//Declaring Variables
    private int CVCnumber;
    private double CreditLimit;
    private double InterestRate;
    private String ExpirationDate;
    private int GracePeriod;
    private boolean isGranted;
    
    public CreditCard(String ClientName,String ExpirationDate,String IssuerBank,String BankAccount,int BalanceAmount,int CVCnumber,double InterestRate,int CardId)//creating constructor with 8 parameters
    {
        super(ClientName,BankAccount,IssuerBank,CardId,BalanceAmount);//calling methods from super class
        super.setClientName(ClientName);//calling methods from super class
        this.CVCnumber=CVCnumber;
        this.InterestRate=InterestRate;
        this.ExpirationDate=ExpirationDate;
        this.isGranted=false;//assigning isGranted as false.
    }
    //Creating getter method for returning the value of attributes
    public int getCVCnumber()
    {
        return this.CVCnumber;
    }
    public double getInterestRate()
    {
        return this.InterestRate;
    }
    public double getCreditLimit()
    {
        return this.CreditLimit;
    }
    public String getExpirationDate()
    {
        return this.ExpirationDate;
    }
    public int getGracePeriod()
    {
        return this.GracePeriod;
    }
    public boolean getisGranted()
    {
        return this.isGranted;
    }
    //Creating setter method for mutating/updating the value
    public void setCreditLimit(double CreditLimit,int GracePeriod)
     { if(CreditLimit<= 2.5 * getBalanceAmount())//operates if it is satisfied
        {
            this.isGranted=true;
            this.CreditLimit=CreditLimit;
            this.GracePeriod=GracePeriod;
        }else//operates if condition is not satisfied
        {
            System.out.println("Insufficienr Balance.");
        }
    }
    public void cancelCreditCard ()
    {
        this.CVCnumber=0;
        this.GracePeriod=0;
        this.CreditLimit=0;
        this.isGranted=false;
        System.out.println("Your CreditCard is Cancelled");
    }
    @Override//inherits from super class and modifies as needed
    public void display()
    {
        if (this.isGranted==true){
            super.display();
            System.out.println("Credit Limit is"+this.getCreditLimit());
            System.out.println("CVC Number is"+this.getCVCnumber());
            System.out.println("Interest Rate is"+this.getInterestRate());
            System.out.println("Expiration Date is"+this.getExpirationDate());
            System.out.println("Grace Period is"+this.getGracePeriod());
        }else
        {
           System.out.println("Name is"+ getClientName()+".");
           System.out.println("Your IssuerBank is"+ getIssuerBank()+".");
           System.out.println("Your Account Number is"+getBankAccount()+".");
           System.out.println("Your Balance"+ getBalanceAmount()+".");
           System.out.println("Your CardId is"+ getCardId()+".");
        }
    }
}
