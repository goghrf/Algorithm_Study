import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // 배열 정렬
        Arrays.sort(arr);

        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}