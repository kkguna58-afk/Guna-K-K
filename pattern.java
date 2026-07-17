public class pat {
    public static void main(String[] args){
        int n=5;
        int m=10;
        Pat(n);
        Pat(m);
        Pat(3);
        Pat(4);
    }
    static void Pat(int k)
    {
        for(int i=0;i<k;i++)
        {
            for(int j=i;j<k;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
