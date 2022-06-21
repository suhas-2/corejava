class Addition
{
       public static void main(String a[])
{
      int additionWithTwoNumbers = add(8, 5);
	  System.out.println(additionWithTwoNumbers);
	  
	  add(7,5,8);
	 
     
}

      public static int add(int a, int b)
       {
         return a+b;
       }
	    static void add(int a, int b, int c)
	   {
		   System.out.println( a+b+c);
	   }
	    
}
