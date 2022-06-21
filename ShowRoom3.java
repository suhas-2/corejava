class ShowRoom3{

       int id;
 String name="Puma";                          
static int noOfBranches = 56;
       String location;
       long contactNo;                              


  // parameterised constructor
  public ShowRoom3 (int showroomId, String loc , long cNo) // -- parameter
  {
  System.out.println(" Show romm object is created");
  id= showroomId;
  location = loc;
  contactNo = cNo;
  name = nme;
  }
  
  6
  
  // MAIN METHOD -- starting point
  public static void main(String a[])
  {
  
  // constructor are used to init instance variable in a class
  ShowRoom3 show = new ShowRoom3(1, "commercial street", 254787445l,); // -- arguments
  System.out.println(show.id+"  "+show.location+"  "+show.contactNo);
  ShowRoom3 show1 = new ShowRoom3(2, "e city", 8147901522l);
  System.out.println(show1.id+"  "+show1.location+"  "+show1.contactNo);
  
 System.out.println(showRoom3.name+"  "+ShowRoom3.noOfBranches);
  }
  }
  