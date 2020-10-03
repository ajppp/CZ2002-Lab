import java.util.Arrays;

public class Plane {
    private PlaneSeat[] seat;
    private PlaneSeat[] sortedSeat;
	private int numEmptySeat;

	public Plane() {
		seat = new PlaneSeat[12];
        numEmptySeat = 12;
        
        for (int i=0; i<seat.length; i++) {
        	seat[i] = new PlaneSeat(i+1);
        }
	}
	
	private PlaneSeat[] sortSeats() {
		sortedSeat = new PlaneSeat[12];
		for (int i=0; i<seat.length; i++) {
			sortedSeat[i] = seat[i];
		}
		Arrays.sort(sortedSeat);
		return sortedSeat;
	}
	
	public void showNumEmptySeats() {
		System.out.println("There are " + numEmptySeat + " empty seats.");
	}
	
	public void showEmptySeats() {
		System.out.println("The following seats are empty: ");	
		for (int i=0; i<seat.length; i++) {
			if (!seat[i].isOccupied()) {
				System.out.println("SeatID " + seat[i].getSeatID());
			}
		}
		
	}
	
	public void showAssignedSeat(boolean bySeatId) {
		System.out.println("Seat assignments: ");
		
		if (bySeatId) {
			for (int i=0; i<seat.length; i++) {
				if (seat[i].isOccupied()) {
					System.out.println("SeatID " + seat[i].getSeatID() + " assigned to CustomerID " + seat[i].getCustomerID());
				}
			}
		}
		else {
			sortSeats();
			for (int i=0; i<sortedSeat.length; i++) {
				if (sortedSeat[i].isOccupied()) {
					System.out.println("SeatID " + sortedSeat[i].getSeatID() + " assigned to CustomerID " + sortedSeat[i].getCustomerID());
				}
			}
		}	
	}
	
	public void assignSeat(int cust_id, int seatId) {
		for (int i=0; i<seat.length; i++) {
			
			if (seat[i].getSeatID() == seatId) {
				if (seat[i].isOccupied()) {
					System.out.println("Seat already assigned to a customer.");
				}
				else {
					seat[i].assign(cust_id);
					numEmptySeat--;
					System.out.println("Seat Assigned!");
				}
			}
		}
	}
	
	public void unAssignSeat(int seatId) {
		for (int i = 0; i < seat.length; i++) {
            if (seat[i].getSeatID() == seatId) {
                if (seat[i].isOccupied()) {
                    seat[i].unAssign();
                    numEmptySeat++;
                    System.out.println("Seat Unassigned!");
                } 
                else {
                    System.out.println("Seat not occupied.");
                }
            }
		}
	}

}