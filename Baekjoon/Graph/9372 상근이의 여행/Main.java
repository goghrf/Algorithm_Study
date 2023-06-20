import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static LinkedList<Integer>[] list;

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i<T; i++) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            list = new LinkedList[n+1];

            boolean[] visited = new boolean[n+1];

            for (int j=1; j<=n; j++) {
                list[j] = new LinkedList<>();
            }

            for (int k = 0; k<m; k++) {

                int v1 = sc.nextInt();
                int v2 = sc.nextInt();
                list[v1].add(v2);
                list[v2].add(v1);
            }

            System.out.println(n-1);
        }
    }
}