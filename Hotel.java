import java.util.*;
class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rooms = {101, 102, 103, 104, 105};
        while (true) 
            {
            System.out.println("\nEnter option:");
            System.out.println("1. Display available rooms");
            System.out.println("2. Book a room");
            System.out.println("3. Cancel a room");
            System.out.println("4. Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Available rooms:");
                    System.out.println("101");
                    System.out.println("102");
                    System.out.println("104");
                    System.out.println("Non-available rooms:");
                    System.out.println("105");
                    System.out.println("103");
                    System.out.println("since,they are not available better not to book,yeah Thank you");
                    break;
                case 2:
                    System.out.println("Enter room number to book:");
                    int bookRoom = sc.nextInt();
                    System.out.println("Your room number " + bookRoom + " is booked.");
                    System.out.println("Thank you for registering. Have a great day!");
                    break;
                case 3:
                    System.out.println("Enter room number to cancel:");
                    int cancelRoom = sc.nextInt();
                    System.out.println("Your room number " + cancelRoom + " is cancelled.");
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    sc.close();
                    return;
                default:
                    System.out.println("Oops! Invalid option. Please try again.");
                    break;
            }
        }
    }
}