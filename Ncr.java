class Ncr{
public static void main(String a[]){

int factValue=fact(6)/(fact(4)*fact(6-4));
System.out.println(factValue);

}
public static int fact(int factNumber)
{
	System.out.println("invoked method started");
	System.out.println("parameter value" + factNumber);
     int f=1;
    for(int i=1;i<=factNumber;i++)
{
         f = f*i;
}
System.out.println("invoked method ended");

return f;
}
}
