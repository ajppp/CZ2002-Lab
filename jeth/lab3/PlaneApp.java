import java.util.Scanner;

public class PlaneApp{
    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);
        Plane plane = new Plane();


        do{
            System.out.println(" ");
            System.out.println("Perform the following methods:");
            System.out.println("1: Show the number of empty seats");
            System.out.println("2: Show the list of empty seats");
            System.out.println("3: Show the list of customers together with their seat numbers in the order of the seat numbers");
            System.out.println("4: Show the list of customers together with their seat numbers in the order of the customer ID");
            System.out.println("5: Assign a customer to a seat");
            System.out.println("6: Remove a seat assignment");
            System.out.println("7: quit");
            System.out.println(" ");
            System.out.println("Enter the number of your choice: ");
            System.out.println(" ");

            choice = sc.nextInt();

                switch(choice){
                    case 1:
                        plane.showNumEmptySeats();
                        break;
                    
                    case 2:
                        plane.showEmptySeats();
                        break;

                    case 3:
                        plane.showAssignedSeat(true);
                        break;

                    case 4:
                        plane.showAssignedSeat(false);
                        break;

                    case 5:
                        System.out.println("Assigning Seat .. ");
                        System.out.print("Please enter SeatID: ");
                        int seatId = sc.nextInt();
                        System.out.print("Please enter Customer ID: ");
                        int custId = sc.nextInt();
                        plane.assignSeat(seatId, custId);
                        break;

                    case 6:
                        System.out.print("Enter SeatID to unassign customer from: ");
                        seatId = sc.nextInt();
                        plane.unAssignSeat(seatId);
                        System.out.println("Seat Unassigned!");
                        break; 
                }
            } while (choice < 7);

        sc.close();
    }
}
