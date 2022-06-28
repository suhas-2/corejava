class SavingsAccount extends BankAccount{

   double interestRate;
   
 public SavingsAccount(double interestRate){
	 ////super method will be called by compiler
	 this.interestRate=interestRate;	 
 } 
 
 ////calculate periodic interest
 public double periodicInterest(){
	   double interest = getBalance() * interestRate/100;
	   deposit(interest);  ///as interest is added to the amount so in deposit we add so usedeposit to add interestto amount
	 return interest;
 }


}