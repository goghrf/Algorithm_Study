import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[10];

        int n = Integer.parseInt(st.nextToken());

        while(n > 0){

            arr[n%10] += 1;

            n = n/10;

        }

        double k = (double)((arr[6] + arr[9])/(double)2);

        arr[6] = (int)Math.round(k);

        arr[9] = arr[6];

        Arrays.sort(arr);

        System.out.print(arr[9]);

    }
}