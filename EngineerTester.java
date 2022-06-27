class EngineerTester{

public static void main(String a[]){
   
   CivilEngg civil = new CivilEngg();
   civil.problemSolving();
   System.out.println("======================================");
   
    CsEngg cs = new CsEngg();
    cs.problemSolving();
	System.out.println("======================================");
   
    EcEngg ec = new EcEngg();
    ec.problemSolving();
	System.out.println("======================================");
   
    EeEngg ee = new EeEngg();
    ee.problemSolving();
	System.out.println("======================================");
   
    MechanicalEngg mech = new MechanicalEngg();
    mech.problemSolving();

 }

}