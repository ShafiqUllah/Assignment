package lab4.practice2;

public class Admin {
	// implement

	Department[] listOfDep ;
	public Admin(Department[] listOfDep) {
		super();
		this.listOfDep = listOfDep;
	}

	public String hourlyCompanyMessage() throws EmptyQueueException {
		StringBuilder sb = new StringBuilder();
		for(Department dep: listOfDep) {
			
			sb.append( format(dep.getName(), dep.nextMessage()));
			
		}
		
		return sb.toString();
	}

	public String format(String name, String msg) {
		return name +": "+ msg +"\n";
	}

}
