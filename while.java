public class while{
    public static void main(String[] args) {
        int i=1;
        while(i<=60){
            if(i%5==0&&i%3==0){
                System.out.println("fizz,buzz");
                i++;
            }else if(i%3==0){
                System.out.println("fizz");
                i++;
            }else if(i%5==0){
                System.out.println("buzz");
                i++;
            }else{
                System.out.println(i);
                i++;
            }
        }
    }
}
