import java.util.Scanner;

public class helloapp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n==============================");
            System.out.println("       SUPER APP");
            System.out.println("==============================");
            System.out.println("1. Shopping");
            System.out.println("2. Food Order");
            System.out.println("3. Bus Booking");
            System.out.println("4. Bike Booking");
            System.out.println("5. Car Booking");
            System.out.println("6. Exit");
            System.out.println("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    shopping();
                    break;

                case 2:
                    foodOrder();
                    break;

                case 3:
                    busBooking();
                    break;

                case 4:
                    bikeBooking();
                    break;

                case 5:
                    carBooking();
                    break;

                case 6:
                    System.out.println("Thank You for using Super App.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);
    }

    static void shopping() {

        System.out.println("\n---- Shopping ----");
        System.out.println("1. Mobile - ₹15000");
        System.out.println("2. Laptop - ₹55000");
        System.out.println("3. Headphones - ₹2000");
        System.out.println("4. Dress-₹1000 ");
        System.out.println("Choose Product: ");
        int item = sc.nextInt();

        switch (item) {
            case 1:
                System.out.println("Mobile Ordered Successfully.");
                break;

            case 2:
                System.out.println("Laptop Ordered Successfully.");
                break;

            case 3:
                System.out.println("Headphones Ordered Successfully.");
                break;
            case 4:
                System.out.println("Dress Ordered Successfully.");
            default:
                System.out.println("Invalid Product.");
        }
    }

    static void foodOrder() {

        System.out.println("\n---- Food Order ----");
        System.out.println("1. Pizza - ₹250");
        System.out.println("2. Burger - ₹150");
        System.out.println("3. Biryani - ₹220");
        System.out.println("4.Idly-₹15");
        System.out.println("5.Dosa-₹30");
        System.out.println("6.chapathi-₹20");
        System.out.println("7.parotta-₹20");
        System.out.println("8.pongal-₹40");
        System.out.println("9.chicken Rice-₹120");
        System.out.println("10.chicken Noodles-₹120");
        System.out.println("Select Food: ");
        int food = sc.nextInt();

        switch (food) {
            case 1:
                System.out.println("Pizza Ordered.");
                break;

            case 2:
                System.out.println("Burger Ordered.");
                break;

            case 3:
                System.out.println("Biryani Ordered.");
                break;
            case 4:
                System.out.println("Idly Ordered.");
                break;
            case 5:
                System.out.println("Dosa Ordered.");
                break;
            case 6:
                System.out.println("Chapathi Ordered.");
                break;
            case 7:
                System.out.println("Parotta Ordered.");
                break;
            case 8:
                System.out.println("pongal Ordered.");
                break;
            case 9:
                System.out.println("Chicken Rice Ordered.");
                break;
            case 10:
                System.out.println("chicken Noodles Ordered.");
                break;

            default:
                System.out.println("Invalid Choice.");
        }
    }

    static void busBooking() {

        System.out.println("\n---- Bus Booking ----");

        sc.nextLine();

        System.out.println("Enter Source: ");
        String source = sc.nextLine();

        System.out.println("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.println("Number of Seats: ");
        int seats = sc.nextInt();

        System.out.println("\nBus Booked Successfully");
        System.out.println(source + " -> " + destination);
        System.out.println("Seats : " + seats);
    }

    static void bikeBooking() {

        System.out.println("\n---- Bike Booking ----");

        sc.nextLine();

        System.out.println("Pickup Location: ");
        String pickup = sc.nextLine();

        System.out.println("Drop Location: ");
        String Drop = sc.nextLine();

        System.out.println("\nSearching Bike...");

        System.out.println("Bike Assigned.");
        System.out.println("Driver: Arun");
        System.out.println("Bike Number: TN55AB1234");
    }

    static void carBooking() {

        System.out.println("\n---- Car Booking ----");

        sc.nextLine();

        System.out.println("Pickup Location: ");
        String pickup = sc.nextLine();

        System.out.println("Drop Location: ");
        String drop = sc.nextLine();

        System.out.println("\nSearching Car...");

        System.out.println("Car Assigned.");
        System.out.println("Driver: Kumar");
        System.out.println("Car Number: TN55CD5678");
    }
}