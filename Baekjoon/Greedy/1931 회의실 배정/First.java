package Greedy.BJ.BJ1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Meeting {

    int start;
    int end;

    public Meeting(){

    }

    public Meeting(int start, int end){
        this.start = start;
        this.end = end;
    }


}
public class First {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        Meeting[] meetings = new Meeting[N];

        for (int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            meetings[i] = new Meeting(start, end);
        }

        Arrays.sort(meetings, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                if(o1.end==o2.end){
                    return o1.start-o2.start;
                }
                return o1.end-o2.end;
            }
        });

        int count = 1;
        Meeting nowMeeting = meetings[0];

        for (int i = 1; i<N; i++){

            if (nowMeeting.end <= meetings[i].start){
                nowMeeting = meetings[i];
                count++;
            }
        }
        System.out.print(count);
    }
}
