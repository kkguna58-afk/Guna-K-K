public class notcommonelement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1 = { 6, 7, 8, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    count = count + 1;
                }
            }
            if (count == 0) {
                System.out.println(arr[i] + "");
            }
        }
    }
}
