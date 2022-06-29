class KotakBank extends Bank1{
            
		public void getIntrest(double intrest){
		
		System.out.println("Kotak bank is");
		intrest = intrest+1.2;
		
		super.getIntrest(intrest);
 }

}