import java.util.ArrayList;
import java.lang.reflect.Array;

public class Plane{
    private PlaneSeat[] seat;
    private int numEmptySeat;

    public Plane(){
        seat = new PlaneSeat[12];
        numEmptySeat = 12;

        for (int i = 0; i < 12; i++){
            seat[i] = new PlaneSeat(i+1);
        }
    }

    private PlaneSeat[] sortSeats(){
        ArrayList <PlaneSeat> sort = new ArrayList<>();
        for(int i = 0; i < seat.length; i++){ //array.length to get the array length attribute
            if(seat[i].isOccupied()) {
                sort.add(seat[i]);
            }
        }
        for(int i = 0; i < sort.size(); i++) {
            for(int j = 0; j < sort.size() - 1; j++) {
                if (sort.get(j).getCustomerID() > sort.get(j + 1).getCustomerID()) { //sort based on customerID
                    PlaneSeat temp = sort.get(j);
                    sort.set(j, sort.get(j+1));
                    sort.set(j+1,temp);
                }
            }
        }
        return sort.toArray(new PlaneSeat[sort.size()]); //converts array list to an array of size sort
    }

    public void showNumEmptySeats(){
        System.out.printf("There are %d empty seats \n", numEmptySeat);
    }

    public void showEmptySeats(){
        //method to display the list of empty seats
        System.out.println("The following seats are empty: ");
        for (PlaneSeat seat:seat){
          if (! seat.isOccupied()){
              System.out.println("SeatID " + seat.getSeatID());
            }
        }
    }
    public void showAssignedSeat(boolean bySeatId){
        /*
         *method to display the assigned seats with seat id and customer id
         *if bySeatId is true, the order will be by seatID, else order is
         *by customerID
         */
        ArrayList<PlaneSeat> assignedSeat = new ArrayList<>();
        System.out.println("The seat assignment are as follows: ");
        if (bySeatId){ //ascend by seatID
            for (PlaneSeat seat:seat){
                if (seat.isOccupied()){
                    assignedSeat.add(seat);
                }
            }
 
        } else {
            PlaneSeat[] sortedSeats = sortSeats(); //sorts seat based on customer ID
            for (PlaneSeat seat:sortedSeats){ //goes by customerID
                if (seat.isOccupied()){
                    assignedSeat.add(seat);
                }
            }
        }

        for (PlaneSeat seat : assignedSeat){
            System.out.println("SeatID " + seat.getSeatID() + " assigned to customer ID " + seat.getCustomerID());
        }
    }
    public void assignSeat(int seatId, int cust_id){
        //a method that assigns a customer ID to an empty seat. 
        if (seat[seatId-1].isOccupied()){
            System.out.println("Seat already assigned to a customer");
            return;
        } else {
            seat[seatId - 1].assign(cust_id);
            numEmptySeat--;
            System.out.println("Seat Assigned!");
        }
    }
    public void unAssignSeat(int seatId){
        //a method that unassigns a seat
        seat[seatId-1].unAssign();
        numEmptySeat++;
    }
}
