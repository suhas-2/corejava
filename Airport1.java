class Airport{


    TerminalDTO[] terminals ;
	int index;
	
	public Airport(int size){
	  terminals = new TerminalDTO[size];
      System.out.println("The Airport constructor is created");	  
	
	}
	public boolean createTerminal(TerminalDTO terminal){
	
	
	    System.out.println("Inside the createTerminal()");
		boolean isAdded = false;
		
		if(terminal != null && terminal.getId() != 0) {
		    
			this.terminals[index++] = terminal;
			isAdded = true;
			System.out.println("The terminals detail are saved");
		} else {
		   System.out.println("The terminals are not saved");
		
		}
	       System.out.println("the createTerminal() is ended");
	   return isAdded;
	}
	
	public void getTerminalDetails(){
	
	     
		 for(int i=0; i<terminals.length; i++){
		    
			  System.out.println(terminals[i].getId()+"  "+terminals[i].getName()+"  "+terminals[i].getNoOfLoadingBridges()+"  "+terminals[i].getNoOfDepartureGates()+"  "+terminals[i].getNoOfCheckinCounters());
		 
		 }
	     
	}

    public boolean updateTerminalNameById(){
		System.out.println("Inside updateTerminalNameById()");
		boolean updateName = false;
		for(int i=0; i<terminals.length){
			if(terminals[i].getId == id){
				terminals.setName(name);
			  updateName	= true;
			}
			else{
				
			}
		}
		return updateName;
	}

}