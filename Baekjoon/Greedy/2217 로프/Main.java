import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] rope = new int[N];
        int[] total = new int[N];

        for (int i = 0; i<N; i++){
            rope[i] = sc.nextInt();
        }

        Arrays.sort(rope);

        for (int i = 1; i<=N; i++){
            total[i-1] = rope[N-i] * i;
        }

        Arrays.sort(total);

        System.out.print(total[N-1]);

    }
}