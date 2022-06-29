class SbiBank extends Bank1{

   // @Override
   public void getIntrest(double intrest){
     
	 System.out.println("the sbi bank");
	 intrest = intrest+2.4;
	 
	 super.getIntrest(intrest);

}
}