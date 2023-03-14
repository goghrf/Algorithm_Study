package BinaryResearch.BJ2512;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class First {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 지방의 수 N 선언
        int[] request = new int[N]; // 예산 요청 배열 request 선언

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i< request.length; i++){    // 배열 request에 요소 입력 받음
            request[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(request);   // 배열 request를 오름차순으로 정렬

        st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());   // 국가 예산 총액

        int result = 0; // 결과값을 넣을 변수 선언
        int start = 0;  // 이분탐색을 위한 시작
        int end = request[N-1]; // 이분탐색을 위한 끝

        while(end-start >= 0){

            int sum = 0;    // 지방의 예산 책정의 총합
            int mid = (start+end)/2;    // 이분탐색을 위한 중간지점

            for (int i : request){  // i엔 request의 원소가 차례대로 들어감
                if (i <= mid){  // request의 원소가 mid보다 작으면
                    sum += i;
                } else {    // request의 원소가 mid보다 크면
                    sum += mid;
                }
            }
            if (sum > M){   // 총합이 국가 예산 총액보다 클 경우
                end = mid - 1;  // end를 mid-1로 하고 범위를 절반으로 축소
            } else {
                start = mid + 1;    // start를 mid+1로 하고 범위를 절반으로 축소
                result = Math.max(result, mid); // result와 mid 중 더 큰 값을 넣음
            }
        }
        System.out.print(result);
    }
}
