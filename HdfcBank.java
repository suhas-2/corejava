class HdfcBank extends Bank1
{
      @Override
     public void getIntrest(double intrest){
	     
		 System.out.println("hdfc bank is");
		 
		intrest = intrest+1.3;
		
		super.getIntrest(intrest);
	}
}
	           
      