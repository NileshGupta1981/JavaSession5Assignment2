public class Description extends Building {
	
	public static void main (String args[]){
		Description desc1 = new Description();
		Description desc2 = new Description();
		
		System.out.println ("Enter the details of building 1");
		int floor1 = desc1.getfloor();
		int room1= desc1.getroom();
		int area1 = desc1.getroom();
		System.out.println ("Enter the details of building 2");		
		int floor2 = desc2.getfloor();
		int room2= desc2.getroom();
		int area2 = desc2.getroom();
		
		System.out.println ("Number of floors in building 1 is: "+floor1);
		System.out.println ("Number of rooms in building 1 is: "+room1);
		System.out.println ("Area of building 1 is: "+area1);
		
		System.out.println ("Number of floors in building 2 is: "+floor2);
		System.out.println ("Number of rooms in building 2 is: "+room2);
		System.out.println ("Area of building 2 is: "+area2);
		
		
		
	}
	
	
	
	
}