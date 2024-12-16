import java.util.Scanner;

class Cab {
    private String cabType;
    private double baseFare;
    private double farePerKm;

    public Cab(String cabType, double baseFare, double farePerKm) {
        this.cabType = cabType;
        this.baseFare = baseFare;
        this.farePerKm = farePerKm;
    }

    public double calculateFare(double distance) {
        return baseFare + (farePerKm * distance);
    }

    public String getCabType() {
        return cabType;
    }
}

public class OnlineCabBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Cab mini = new Cab("Mini", 50, 10);
        Cab sedan = new Cab("Sedan", 100, 15);
        Cab suv = new Cab("SUV", 200, 20);

    
        System.out.println("Available Cab Options:");
        System.out.println("1. Mini (Base Fare: 50, Fare per Km: 10)");
        System.out.println("2. Sedan (Base Fare: 100, Fare per Km: 15)");
        System.out.println("3. SUV (Base Fare: 200, Fare per Km: 20)");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        Cab selectedCab;

        switch (choice) {
            case 1:
                selectedCab = mini;
                break;
            case 2:
                selectedCab = sedan;
                break;
            case 3:
                selectedCab = suv;
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Mini.");
                selectedCab = mini;
        }

        System.out.print("Enter distance to travel (in km): ");
        double distance = scanner.nextDouble();

        
        double fare = selectedCab.calculateFare(distance);

        System.out.println("\nBooking Summary:");
        System.out.println("Cab Type: " + selectedCab.getCabType());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: Rs. " + fare);

        System.out.println("\nThank you for booking with us!");
        scanner.close();
    }
}