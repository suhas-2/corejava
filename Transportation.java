class Transportation{
  
        String transType;
        int noOfSeats;
 static String startingPoint = "Vajrhalli";
 static String endPoint = "Yeshwanthpur";
 
 public Transportation(){
	 System.out.println("object is created");
 }
 
 public Transportation( String transType,int noOfSeats ){
	 this();
  this.transType =transType;                //    purpose of this   when same variable name
 this.noOfSeats = noOfSeats;
  //   instance = parameter
                                                              
                    // this keyword is used to avoid ambiguity between instance and parameter variable.
			       // this keyword help compiler to point to instance variables.
 }         
 public static void main(String a[]){       
 
 Transportation trans = new Transportation("Metro",60);
 System.out.println(trans.transType+" No of seats is-- "+trans.noOfSeats);
 
 Transportation trans1 = new Transportation("Bus",50);
 System.out.println(trans1.transType+" No of seats is -- "+trans1.noOfSeats);
 
 System.out.println(Transportation.startingPoint+" to "+Transportation.endPoint);
 }
 }
 
 
 
  