public class PlaneSeat implements Comparable<Object>{
    private int seatId;
    private boolean assigned;
    private int customerId = 0;

    public PlaneSeat(int seat_id) {
        this.seatId = seat_id;
    }
    public int getSeatID() {
        return seatId;
    }

    public int getCustomerID() {
        return customerId;
    }
    
    public boolean isOccupied() {
        return assigned;
    }

    public void assign(int cust_id) {
        this.customerId = cust_id;
        this.assigned = true;
    }

    public void unAssign() {
        customerId = 0;
        assigned = false;
    }
    public int compareTo(Object newPlaneSeat) {
        if (newPlaneSeat instanceof PlaneSeat) {

            PlaneSeat seat = (PlaneSeat) newPlaneSeat;
            if (this.getCustomerID() > seat.getCustomerID()) {
                return 1;
            } else if (this.getCustomerID()< seat.getCustomerID()) {
                return -1;
            }
        }
        return 0;
    }
}