import java.util.*;
public class array{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]marks={70,80,90,85,95};
        int num=sc.nextInt();
        for(int i=0;i<marks.length;i++)
        {
         if(marks[i]==num)
         {
             System.out.print("number found");
             return;
         }
        }
        System.out.println("number not found");
    }
    }
