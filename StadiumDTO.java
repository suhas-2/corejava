public class StadiumDTO{
    
	private String name;
	private int id;
	private int capacity;
	private String location;
	
	public StadiumDTO(){
	}
	
	public String getName(){
	
	     return name;
}
   public int getId(){

         return id;
}
   public int getCapacity(){
         
         return capacity;
}
    public String getLocation(){
         return location;
}
   public void setName(String name){
      this.name = name;
}
   public void setId(int id){
     this.id=id;
}
   public void setCapacity(int capacity){
     this.capacity = capacity;
}
    public void setLocation(String location){
     this.location = location;
}
}	 