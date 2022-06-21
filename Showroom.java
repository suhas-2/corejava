class ShowRoom{

// states or variable or properties or fields

String name;
int noOfEmployees;
String address;
long contactNo;

public static void main(String a[])
{

// className ref variable = new ClassName

 ShowRoom show = new ShowRoom();
 show.name = "suhas";
 show.noOfEmployees = 56;
 show.contactNo = 45678890l;
 show.address = "rajajingar";
 
 System.out.println("Showroom name is " +show.name);
System.out.println("no of emplyess in Showroom " +show.noOfEmployees);
System.out.println("showroom contact no is " +show.contactNo);
System.out.println("address os showroom is " +show.address);
}
}