import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        String[] files = new String[n];

        for (int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            files[i] = st.nextToken();
        }

        String result = files[0];

        for (int i = 1; i<n; i++){

            for (int j = 0; j<result.length(); j++){

                String test = files[i];

                if (test.charAt(j) == result.charAt(j)){
                    continue;
                } else {
                    result = result.substring(0,j) + '?' + result.substring(j+1);
                }
            }
        }

        System.out.print(result);
    }
}