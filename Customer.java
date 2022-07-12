class Customer{

     OrderDTO[] dtos;
	 
	 int index;
	 
	 public Customer(int size){
		 dtos = new OrderDTO[size];
		 System.out.println("Customer const created");
	 }
	 
	 public boolean creatOrder(OrderDTO dto){
		 System.out.println("inside creatOrder");
		 boolean isAdded = false ;
		 if(dto != null && dto.getName()!=null){
			 this.dtos[index++] = dto;
			 isAdded = true;
			System.out.println("Customer detail added"); 
		 }
		 else{
			 System.out.println("can not order  without customer detail");
		 }
		 
		 return isAdded;
		 
		 
	 }
	 
	 public void getOrder(){
		 System.out.println("inside getOrderDetails()");
		 
		 for (int i=0 ; i<dtos.length ;i++){
			 System.out.println(dtos[i].getId()+" "+dtos[i].getName()+" "+dtos[i].getOrderedDate()+" "+dtos[i].getAddress());
		 }
		 
	
	 }
	 
}