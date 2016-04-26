import java.util.Scanner;

public class Building{
	
	int floors;
	int rooms;
	int area;
	Scanner scnr = new Scanner(System.in);
	
	
	public int getfloor(){
		System.out.println ("Enter the number of floors");
		int floor = scnr.nextInt();
		return floor;
		
	};
	
	public int getroom(){
		System.out.println ("Enter number of rooms");
		int room = scnr.nextInt();
		return room;
		
	};	
	
	public int getarea(){
		int area = scnr.nextInt();
		return area;
		
	};
	
}