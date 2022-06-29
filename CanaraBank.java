class CanaraBank extends Bank1{
	
      @Override
	  public void getIntrest(double intrest){
	  
	  System.out.println("canara bank ");
	  intrest = intrest+1.5;
	  
	  super.getIntrest(intrest);
    
	}
}