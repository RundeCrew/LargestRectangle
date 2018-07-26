import java.util.ArrayList;

public class Rectangle2 {

	public static void main(String[] args) {

			
	// Step 1: create array list
	ArrayList<Rectangle> roomNames = new ArrayList<>();
	Rectangle sunRoom = new Rectangle(42,19);
	Rectangle snugRoom = new Rectangle(67,28);
	Rectangle cornerRoom = new Rectangle(12,25);
	
	roomNames.add(sunRoom);
	roomNames.add(snugRoom);
	roomNames.add(cornerRoom);

	double max = 0.0;
	for (int i = 0 ; i < roomNames.size(); i++) {
		if (roomNames.get(i).getRoomSqFt() > max) {
			max = roomNames.get(i).getRoomSqFt();
			}	
		}
	System.out.println(max);
	
	double min = Double.MAX_VALUE;
	for (int i = 0 ; i < roomNames.size(); i++) {
		if (roomNames.get(i).getRoomSqFt() < min) {
			min = roomNames.get(i).getRoomSqFt();
		}	
	}
	System.out.println(min);
}
}
