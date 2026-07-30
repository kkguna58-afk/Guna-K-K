public class Pattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

    
          if (i >= 3) {
                for (int j = 1; j <= 2; j++) {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= 2; k++) {
                System.out.print("*");
                if (k < 2) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
