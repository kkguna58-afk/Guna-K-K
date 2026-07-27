abstract class Payment{
    protected double amount;
    Payment(double amount){
        this.amount = amount;
    }

    abstract void pay();

    void receipt(){
        System.out.println("Receipt generated");
        System.out.println("Amount Paid: " + amount);
    }

    void showPaymentStatus(){
        System.out.println("Payment Successful");
    }
}

class UpiPayment extends Payment{
    private String upiId;
    UpiPayment(double amount, String upiId){
        super(amount);
        this.upiId = upiId;
    }

    void pay(){
        System.out.println("Processing UPI payment...");
        System.out.println("UPI ID: " + upiId);
    }
}

class CardPayment extends Payment{
    private String cardNumber;
    CardPayment(double amount, String cardNumber){
        super(amount);
        this.cardNumber = cardNumber;
    }

    void pay(){
        System.out.println("Processing card payment...");
        System.out.println("Card number: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
    }
}

class Main{
    public static void main(String[] args){
        Payment p1 = new UpiPayment(333.33, "gopi@oksbi");
        Payment p2 = new CardPayment(3030.30, "1122334455667788");
        p1.pay();
        p1.receipt();
        p1.showPaymentStatus();
        System.out.println();
        p2.pay();
        p2.receipt();
        p2.showPaymentStatus();
    }
}
 
