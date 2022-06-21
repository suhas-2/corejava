class Trimmer{
static String brand = "Panasonic";
static double price = 5854.23;
static String colour = "Black";
static boolean isconnected;
public static void onoroff()
{
        System.out.println("onoroff");
        if(isconnected == false)
{
        isconnected = true;
        System.out.println("the brand name is" +brand);
        System.out.println("the trimmer price is" +price);
        System.out.println("the trimmer colour is" +colour);
        System.out.println("the washing machining is on");
}
        else if(isconnected == true)
{
         isconnected = false;
		 System.out.println("washing machine is turned off");
}
}
       public static void main(String a[]){
	   onoroff();
	   onoroff();
	   }
	   public static void increaseSpeed(){
	System.out.println("main method started");
          if(isConnected == true){
            System.out.println("Grinder is turned ON");
             if(currentSpeed <	maxSpeed){
				 currentSpeed = currentSpeed + 1;
				 System.out.println("the current speed is"+currentSpeed);
			 }
		  else{
			  System.out.println("Grinder max speed reached");
		  }
}
else{
	System.out.println("Turn on the grinder");
}
System.out.println("main method ended");
}

public static void decreaseSpeed(){
	System.out.println("main method started");
	if(isConnected == true){
		System.out.println("speaker is turned on");
		if(currentSpeed > minSpeed){
			currentSpeed = currentSpeed -1;
			System.out.println("the current Speed is:" +currentSpeed);
		}
		else{
			System.out.println("speaker reached min speed");
		}
	}
	else{
		System.out.println("turn on the grinder");
	}
	System.out.println("main method ended");
}
}
		 


