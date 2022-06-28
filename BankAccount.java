class BankAccount
{
    double amount;
  
  /* public static void main(String a[])
   {
     System.out.println("the main method started");
	 deposit(18000.00);
	 withdraw(15215.00);
	 totalAmount();
	
	 deposit(20000.00);
	 withdraw(10000.00);
	 totalAmount();
	 
	 deposit(30000.00);
	 withdraw(7000);
	 totalAmount();
	 
	 deposit(45000);
	 withdraw(30000);
	 totalAmount();
	 
	 deposit(15000);
	 withdraw(11000);
	 totalAmount();
	 
	 deposit(58000);
	 withdraw(45000);
	 totalAmount();
	 
	 deposit(80000);
	 withdraw(59000);
	 totalAmount();
	 
	 deposit(12000);
	 withdraw(5695);
	 totalAmount();
	 
	 deposit(18968);
	 withdraw(19875);
	 totalAmount();
	 
	 deposit(23689);
	 withdraw(16555);
	 totalAmount();
   
   }*/
   
  public double deposit(double amt)
  
  {
   System.out.println("invoke Deposit()");
   System.out.println("Amount to be deposited "+ amt);
   System.out.println("Amount before deposit "+ amount);
   amount = amount + amt;
   System.out.println("The amount after deposit "+ amount);
   System.out.println("deposit method ended");
   
   return amount;
  }
  
  public double withdraw(double withd)
  {
    System.out.println("invoke withdraw()");
	System.out.println(" amount to be withdraw "+ withd);
	System.out.println("the Amount before withdraw "+ amount);
	amount = amount - withd;
	System.out.println(" The Total Balance is "+ amount);
    System.out.println(" withdraw method ended ");

   return amount;	
  }
  
  
 public double getBalance()
 {
	
	 System.out.println("The Total balance "+ amount);
	 return amount;
 }
 
 public void transfer(double tAmount, BankAccount other){
	  
	  if(tAmount <= amount)
	  {
		  withdraw(tAmount);
		  other.deposit(tAmount);
	  }
	  
	  else
	  {
		  System.out.println("The insifficient balance");
	  }
	 
 }
}