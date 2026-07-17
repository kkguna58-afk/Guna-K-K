import java.util.*;
public class ifswitch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the student:");
        String student=sc.nextLine();
        System.out.println("Enter name of the subject:");
        String subject=sc.nextLine();
         System.out.println("Enter the student DOB:");
        int DOB=sc.nextInt();
        System.out.println("Enter the student Mark:");
        int Mark=sc.nextInt();


        if(Mark>=80){
            System.out.println("Grade A");
        }else if(Mark>=60){
            System.out.println("Grade B");
        }else{
            System.out.println("Student fail");
        }
        
    }
    
}
