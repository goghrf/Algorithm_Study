import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    static int[] arr;
    static int[] result;
    static boolean[] visited;
    static int N, M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        result = new int[M];
        visited = new boolean[N];

        for (int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        DFS(0);
        System.out.print(sb);
    }

    public static void DFS(int k){

        if (k == M) {
            for (int i = 0; i<M; i++){
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i< N; i++){
            if (!visited[i]){
                visited[i] = true;
                result[k] = arr[i];
                DFS(k+1);
                visited[i] = false;
            }
        }
    }
}
