import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 스택 선언 및 생성
        Stack<Integer> stack = new Stack<>();
        // 횟수 변수
        int n = Integer.parseInt(st.nextToken());

        // n 만큼 반복
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());

            // num == 0 일 때
            if (num == 0){
                // 스택에서 요소를 뺌
                stack.pop();
                // 스택에 요소를 넣음
            } else {
                stack.push(num);
            }
        }

        int total = 0;

        // 스택이 빌 때까지 반복
        while(!stack.empty()){
            int num = stack.pop();
            total += num;
        }
        System.out.print(total);
    }
}