package substitution_principle;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Building b1 = new Building();
		Office off1 = new Office();
//		build(b1);
//		build(off1);
		
		List<Building> buildings = new ArrayList<>();
		buildings.add(new Building());
		buildings.add(new Office());
		printBuildings(buildings);
		
		List<Office> offices = new ArrayList<>();
		offices.add(new Office());
		offices.add(new Office());
		
	}
	
	public static void build(Building building) {
		System.out.println("Constructing a new " + building.toString());
	}
	
	public static void printBuildings(List<Building> buildings) {
		for (int i = 0; i < buildings.size(); i++) {
			System.out.println(i+1 + ": " + buildings.get(i).toString() );
		}
	}
	
	
}
