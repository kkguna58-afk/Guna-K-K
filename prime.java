import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enthe the Number");
        int n=sc.nextInt();
        
        System.out.print(prime(n));
       
    }
    static String prime (int k)
    {
        if(k<2)
        {
            return ("not prime");
        }
        for(int i = 2;i<k;i++){
            if(k%i == 0){
                return ("not prime");
    }
        }
    return ("prime");
}
}
