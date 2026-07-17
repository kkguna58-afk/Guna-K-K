import java.util.*;
public class sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        int count =0;
        while(n>0)
        {
           // int h=n%10;
            count = count+1;
            n  = n/10;
        }
        System.out.println("Sum of the Number:"+count);
    }
}
