package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
	
	List<Building> listOfBuildings = new ArrayList<>();
	
	
	public void addBuilding(Building b){
		listOfBuildings.add(b);
	}
	
	
	public double calcProfits() {
		double ans =0;
		
		for(Building b : listOfBuildings) {
			ans += b.getProfit(); 
		}
		
		return ans;
	}

}
