class Seetha extends Bank1{

    @Override
    public void getIntrest(double intrest){
	    System.out.println("Seetha bank ");
		intrest = intrest+3.4;
		
		super.getIntrest(intrest);
}

}