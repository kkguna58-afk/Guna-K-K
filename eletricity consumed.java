import java.util.*;
public class main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int number=sc.nextInt();
    
    switch (number) {
        case 1:
            System.out.println("Appliences:fan");
            System.out.println("unit consumed=1");
            System.out.println("Eletricity consumed="+1*8);
            break;
        case 2:
            System.out.println("Appliences:Television");
            System.out.println("unit consumed=2");
            System.out.println("Eletricity consumed="+2*8);
            break;
        case 3:
            System.out.println("Appliences:Air conditioner");
            System.out.println("unit consumed=5");
            System.out.println("Eletricity consumed="+5*8);
            break;
        case 4:
            System.out.println("Appliences:Refridgerator");
            System.out.println("unit consumed=3");
            System.out.println("Eletricity consumed="+3*9);
            break;
        default:
            System.out.println("No appliences");
    }
    }
}
