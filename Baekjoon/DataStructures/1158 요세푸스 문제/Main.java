import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i<=n; i++){
            queue.add(i);
        }

        int num = 0;
        int t = 0;

        int[] arr = new int[n];

        while(!queue.isEmpty()){

            num++;

            if (num == k){
                arr[t] = queue.poll();
                t++;
                num = 0;
            } else {
                int m = queue.poll();
                queue.add(m);
            }

        }
        System.out.print("<");
        for (int i = 0; i<n; i++){
            if (i<n-1){
                System.out.print(arr[i]+", ");
            } else {
                System.out.print(arr[i]+">");
            }
        }

    }
}