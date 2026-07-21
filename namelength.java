import java.util.*;
public class main {
    public static void main(String[] args) {
   String[]name={"anbu","ajay","abi","akash"};
   int[][]marks={{60,70,80,90,50},{53,64,75,85,55},
                 {97,89,99,79,68},{55,65,75,85,95}};
   for(int i=0;i<name.length;i++)
   {
       System.out.println("Name="+name[i]);
       double total=0;
       for(int j=0;j<marks[i].length;j++)
       {
           System.out.print(marks[i][j]+" ");
           total+=marks[i][j];
       }
       System.out.println();
       System.out.println("Average:"+(total/5)+"%");
       System.out.println();
   }
    }
}
