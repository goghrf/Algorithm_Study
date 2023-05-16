import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] coin = new int[N+1];
        for (int i = N-1; i>=0; i--){
            coin[i] = sc.nextInt();
        }
        int count = 0;
        int i = 0;

        while (true) {

            if (K - coin[i] < 0) {
                i++;
            } else {
                K -= coin[i];
                count++;
            }
            if (K == 0){
                break;
            }
        }
        System.out.print(count);

    }
}