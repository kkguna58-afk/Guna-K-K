
import java.util.*;

public class SuperApp {

    static Scanner sc = new Scanner(System.in);

    static String username = "";
    static String password = "";
    static boolean loggedIn = false;

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println("         SUPER APP");
            System.out.println("====================================");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Open Super App");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    register();
                    break;

                case 2:
                    login();
                    break;

                case 3:

                    if (loggedIn) {
                        superMenu();
                    } else {
                        System.out.println("Please Login First.");
                    }
                    break;

                case 4:
                    System.out.println("Thank You...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

    }

    static void register() {

        System.out.println("\n========== REGISTER ==========");

        System.out.print("Enter Username : ");
        username = sc.nextLine();

        System.out.print("Enter Password : ");
        password = sc.nextLine();

        System.out.println("Registration Successful.");
    }

    static void login() {

        System.out.println("\n========== LOGIN ==========");

        System.out.print("Username : ");
        String user = sc.nextLine();

        System.out.print("Password : ");
        String pass = sc.nextLine();

        if (user.equals(username) && pass.equals(password)) {

            loggedIn = true;
            System.out.println("Login Successful.");

        } else {

            System.out.println("Invalid Username or Password.");

        }

    }

    static void superMenu() {

        int ch;

        do {

            System.out.println("\n==============================");
            System.out.println("        SUPER APP");
            System.out.println("==============================");
            System.out.println("1. Shopping");
            System.out.println("2. Food Order");
            System.out.println("3. Bus Booking");
            System.out.println("4. Bike Booking");
            System.out.println("5. Car Booking");
            System.out.println("6. Booking History");
            System.out.println("7. Logout");

            System.out.print("Enter Choice : ");

            ch = sc.nextInt();

            switch (ch) {

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
                    history();
                    break;

                case 7:
                    loggedIn = false;
                    System.out.println("Logged Out Successfully.");
                    break;

                default:
                    System.out.println("Invalid Choice.");

            }

        } while (loggedIn);

    }

    static String history = "";

    static void shopping() {

        sc.nextLine();

        System.out.println("\n========== SHOPPING ==========");

        System.out.print("Enter Customer Name : ");
        String customer = sc.nextLine();

        System.out.println("\nAvailable Products");
        System.out.println("1. Mobile      - ₹15000");
        System.out.println("2. Laptop      - ₹55000");
        System.out.println("3. Headphones  - ₹2000");
        System.out.println("4. Smart Watch - ₹5000");
        System.out.println("5. Dress       - ₹1200");

        System.out.print("\nChoose Product : ");
        int choice = sc.nextInt();

        String product = "";
        int price = 0;

        switch (choice) {

            case 1:
                product = "Mobile";
                price = 15000;
                break;

            case 2:
                product = "Laptop";
                price = 55000;
                break;

            case 3:
                product = "Headphones";
                price = 2000;
                break;

            case 4:
                product = "Smart Watch";
                price = 5000;
                break;

            case 5:
                product = "Dress";
                price = 1200;
                break;

            default:
                System.out.println("Invalid Product.");
                return;
        }

        System.out.print("Enter Quantity : ");
        int qty = sc.nextInt();

        int total = price * qty;

        String payment = paymentMethod();

        int orderId = (int) (Math.random() * 90000) + 10000;

        System.out.println("\n====================================");
        System.out.println("          SHOPPING BILL");
        System.out.println("====================================");
        System.out.println("Order ID      : SHOP" + orderId);
        System.out.println("Customer      : " + customer);
        System.out.println("Product       : " + product);
        System.out.println("Price         : ₹" + price);
        System.out.println("Quantity      : " + qty);
        System.out.println("------------------------------------");
        System.out.println("Total Amount  : ₹" + total);
        System.out.println("Payment Mode  : " + payment);
        System.out.println("Status        : Order Confirmed");
        System.out.println("====================================");

        history += "\nShopping : " + product + "  ₹" + total;
    }

    static String paymentMethod() {

        System.out.println("\nPayment Method");
        System.out.println("1. Cash");
        System.out.println("2. UPI");
        System.out.println("3. Card");

        System.out.print("Choose Payment : ");

        int pay = sc.nextInt();

        switch (pay) {

            case 1:
                return "Cash";

            case 2:
                return "UPI";

            case 3:
                return "Card";

            default:
                return "Cash";
        }

    }

    static void foodOrder() {

        sc.nextLine();

        System.out.println("\n========== FOOD ORDER ==========");

        System.out.print("Enter Customer Name : ");
        String customer = sc.nextLine();

        System.out.println("\n----------- MENU -----------");
        System.out.println("1. Pizza              ₹250");
        System.out.println("2. Burger             ₹150");
        System.out.println("3. Biryani            ₹220");
        System.out.println("4. Idly               ₹15");
        System.out.println("5. Dosa               ₹30");
        System.out.println("6. Chapathi           ₹20");
        System.out.println("7. Parotta            ₹20");
        System.out.println("8. Pongal             ₹40");
        System.out.println("9. Chicken Rice       ₹120");
        System.out.println("10. Chicken Noodles   ₹120");

        System.out.print("\nSelect Food : ");
        int choice = sc.nextInt();

        String food = "";
        int price = 0;

        switch (choice) {

            case 1:
                food = "Pizza";
                price = 250;
                break;

            case 2:
                food = "Burger";
                price = 150;
                break;

            case 3:
                food = "Biryani";
                price = 220;
                break;

            case 4:
                food = "Idly";
                price = 15;
                break;

            case 5:
                food = "Dosa";
                price = 30;
                break;

            case 6:
                food = "Chapathi";
                price = 20;
                break;

            case 7:
                food = "Parotta";
                price = 20;
                break;

            case 8:
                food = "Pongal";
                price = 40;
                break;

            case 9:
                food = "Chicken Rice";
                price = 120;
                break;

            case 10:
                food = "Chicken Noodles";
                price = 120;
                break;

            default:
                System.out.println("Invalid Choice.");
                return;
        }

        System.out.print("Enter Quantity : ");
        int qty = sc.nextInt();

        int total = qty * price;

        String payment = paymentMethod();

        int orderId = (int) (Math.random() * 90000) + 10000;

        System.out.println("\n====================================");
        System.out.println("           FOOD BILL");
        System.out.println("====================================");
        System.out.println("Order ID      : FOOD" + orderId);
        System.out.println("Customer      : " + customer);
        System.out.println("Food Item     : " + food);
        System.out.println("Price         : ₹" + price);
        System.out.println("Quantity      : " + qty);
        System.out.println("------------------------------------");
        System.out.println("Total Amount  : ₹" + total);
        System.out.println("Payment Mode  : " + payment);
        System.out.println("Order Status  : Confirmed");
        System.out.println("====================================");

        history += "\nFood : " + food + "₹" + total;
    }

    static void busBooking() {

        sc.nextLine();

        System.out.println("\n========== BUS BOOKING ==========");

        System.out.print("Enter Passenger Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Mobile Number : ");
        String mobile = sc.nextLine();

        System.out.print("Enter Source : ");
        String source = sc.nextLine();

        System.out.print("Enter Destination : ");
        String destination = sc.nextLine();

        System.out.print("Enter Number of Seats : ");
        int seats = sc.nextInt();

        int farePerSeat = 350;
        int totalFare = farePerSeat * seats;

        String payment = paymentMethod();

        int bookingId = (int) (Math.random() * 90000) + 10000;

        String busNumber = "TN55AB" + ((int) (Math.random() * 9000) + 1000);

        java.time.LocalDateTime now = java.time.LocalDateTime.now();

        java.time.format.DateTimeFormatter dtf = java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String dateTime = now.format(dtf);

        System.out.println("\n======================================");
        System.out.println("            BUS TICKET");
        System.out.println("======================================");
        System.out.println("Booking ID     : BUS" + bookingId);
        System.out.println("Passenger      : " + name);
        System.out.println("Mobile         : " + mobile);
        System.out.println("From           : " + source);
        System.out.println("To             : " + destination);
        System.out.println("Seats          : " + seats);
        System.out.println("Fare/Seat      : ₹" + farePerSeat);
        System.out.println("--------------------------------------");
        System.out.println("Total Fare     : ₹" + totalFare);
        System.out.println("Payment Mode   : " + payment);
        System.out.println("Date & Time    : " + dateTime);
        System.out.println("Bus Number     : " + busNumber);
        System.out.println("Status         : Booking Confirmed");
        System.out.println("======================================");

        history += "\nBus :" + source + " -> " + destination + "₹" + totalFare;
    }

    static void bikeBooking() {

        sc.nextLine();

        System.out.println("\n========== BIKE BOOKING ==========");

        System.out.print("Enter Customer Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Mobile Number : ");
        String mobile = sc.nextLine();

        System.out.print("Enter Pickup Location : ");
        String pickup = sc.nextLine();

        System.out.print("Enter Drop Location : ");
        String drop = sc.nextLine();

        System.out.print("Enter Distance (KM) : ");
        double distance = sc.nextDouble();

        double ratePerKm = 15;
        double totalFare = distance * ratePerKm;

        String payment = paymentMethod();

        int bookingId = (int) (Math.random() * 90000) + 10000;

        String bikeNumber = "TN55BK" + ((int) (Math.random() * 9000) + 1000);

        String[] drivers = {
                "Arun", "Karthik", "Vijay", "Praveen", "Ajith"
        };

        String driver = drivers[(int) (Math.random() * drivers.length)];

        java.time.LocalDateTime now = java.time.LocalDateTime.now();

        java.time.format.DateTimeFormatter dtf = java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String dateTime = now.format(dtf);

        System.out.println("\nSearching Bike...");
        System.out.println("Bike Assigned Successfully!");

        System.out.println("\n======================================");
        System.out.println("            BIKE RECEIPT");
        System.out.println("======================================");
        System.out.println("Booking ID     : BIKE" + bookingId);
        System.out.println("Customer       : " + name);
        System.out.println("Mobile         : " + mobile);
        System.out.println("Pickup         : " + pickup);
        System.out.println("Drop           : " + drop);
        System.out.println("Distance       : " + distance + " KM");
        System.out.println("Rate/KM        : ₹" + ratePerKm);
        System.out.println("--------------------------------------");
        System.out.println("Total Fare     : ₹" + totalFare);
        System.out.println("Payment Mode   : " + payment);
        System.out.println("Driver         : " + driver);
        System.out.println("Bike Number    : " + bikeNumber);
        System.out.println("Date & Time    : " + dateTime);
        System.out.println("Status         : Ride Confirmed");
        System.out.println("======================================");

        history += "\nBike : " + pickup + " -> " + drop + "  ₹" + totalFare;
    }

    static void carBooking() {

        sc.nextLine();

        System.out.println("\n========== CAR BOOKING ==========");

        System.out.print("Enter Customer Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Mobile Number : ");
        String mobile = sc.nextLine();

        System.out.print("Enter Pickup Location : ");
        String pickup = sc.nextLine();

        System.out.print("Enter Drop Location : ");
        String drop = sc.nextLine();

        System.out.print("Enter Distance (KM) : ");
        double distance = sc.nextDouble();

        double ratePerKm = 25;
        double totalFare = distance * ratePerKm;

        String payment = paymentMethod();

        int bookingId = (int) (Math.random() * 90000) + 10000;

        String carNumber = "TN55CR" + ((int) (Math.random() * 9000) + 1000);

        String[] drivers = {
                "Kumar", "Suresh", "Ravi", "Manoj", "Ganesh"
        };

        String driver = drivers[(int) (Math.random() * drivers.length)];

        java.time.LocalDateTime now = java.time.LocalDateTime.now();

        java.time.format.DateTimeFormatter dtf = java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String dateTime = now.format(dtf);

        System.out.println("\nSearching Car...");
        System.out.println("Car Assigned Successfully!");

        System.out.println("\n======================================");
        System.out.println("             CAR RECEIPT");
        System.out.println("======================================");
        System.out.println("Booking ID     : CAR" + bookingId);
        System.out.println("Customer       : " + name);
        System.out.println("Mobile         : " + mobile);
        System.out.println("Pickup         : " + pickup);
        System.out.println("Drop           : " + drop);
        System.out.println("Distance       : " + distance + " KM");
        System.out.println("Rate/KM        : ₹" + ratePerKm);
        System.out.println("--------------------------------------");
        System.out.println("Total Fare     : ₹" + totalFare);
        System.out.println("Payment Mode   : " + payment);
        System.out.println("Driver         : " + driver);
        System.out.println("Car Number     : " + carNumber);
        System.out.println("Date & Time    : " + dateTime);
        System.out.println("Status         : Ride Confirmed");
        System.out.println("======================================");

        history += "\nCar :" + pickup + " -> " + drop + "₹" + totalFare;
    }

    static void history() {

        System.out.println("\n======================================");
        System.out.println("          BOOKING HISTORY");
        System.out.println("======================================");

        if (history.isEmpty()) {

            System.out.println("No Orders or Bookings Found.");

        } else {

            System.out.println(history);

        }

        System.out.println("======================================");
    }

}
