import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 테스트 케이스
        int T = Integer.parseInt(st.nextToken());

        for(int i = 0; i<T; i++){

            st = new StringTokenizer(br.readLine());

            int R = Integer.parseInt(st.nextToken());

            String S = st.nextToken();
            // 문자열을 한 문자씩 잘라서 배열에 넣음
            String[] strArray = S.split("");

            // 배열의 요소 for문
            for (String s : strArray){
                for (int j = 0; j<R; j++){
                    System.out.print(s);
                }
            }

            System.out.println();

        }
    }
}