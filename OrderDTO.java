class OrderDTO{

        public OrderDTO(){
			System.out.println("order const created");
		}
		
		private int id;
		private String name;
		private String orderedDate;
		private String address;
		
     public int getId(){
		 return id;
	 }
	 public void setId(int id){
		 this.id =id;
	 }
	 
	 public String getName(){
		 return name;
	 }
	 public void setName(String name){
		 this.name = name;
	 }
	 
	  public String getOrderedDate(){
		 return orderedDate;
	 }
	 public void setOrderedDate(String orderedDate){
		 this.orderedDate = orderedDate;
	 }
	 
	 public String getAddress(){
		 return address;
	 }
	 public void setAddress(String address){
		 this.address = address;
	 }
	 
	
		
}