class ShowRoom2{

int id;
static String name;                          // static member    sop(ShowRoom2.name + " "+ ShowRoom.noOfBranches)
static int noOfBranches;
String location;
long contactNo;                              // instance member    sop(show.ShowRoom2id

public ShowRoom2(){

  System.out.println("Showroom Object is created");
  }
  
  public static void main(String a[]){
  
  ShowRoom2 show = new ShowRoom2();
  show.id = 12;
  show.name = "puma";
  show.noOfBranches = 56;
  show.location = "church street";
  show.contactNo = 8789654213L;
  
  System.out.println("Showroom id is " +show.id);
  System.out.println("Showroom name is " +show.name);
  System.out.println("no of branches is " +show.noOfBranches);
  System.out.println("location of showroom  is " +show.location);
  System.out.println("Showroom contact no is " +show.contactNo);
  
  
  ShowRoom2 show1 = new ShowRoom2();
  show1.id = 13;
  show1.name = "puma";
  show1.noOfBranches = 56;
  show1.location = "MG ROAD";
  show1.contactNo = 23654789544L;
  
  System.out.println("Showroom id is " +show1.id);
  System.out.println("Showroom name is " +show1.name);
  System.out.println("no of branches is " +show1.noOfBranches);
  System.out.println("location of showroom  is " +show1.location);
  System.out.println("Showroom contact no is " +show1.contactNo);
  }
  }
  
  