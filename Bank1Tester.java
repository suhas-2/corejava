class Bank1Tester{

   public static void main(String a[]){


        Bank1 hdfc = new HdfcBank();
        hdfc.getIntrest(5.0);

        Bank1 kotak = new KotakBank();
        kotak.getIntrest(5.0);

        Bank1 canara = new CanaraBank();
        canara.getIntrest(5.0);

        Bank1 seetha = new Seetha();
        seetha.getIntrest(5.0);

        Bank1 sbi = new SbiBank();
		sbi.getIntrest(5.0);
}
}
        		