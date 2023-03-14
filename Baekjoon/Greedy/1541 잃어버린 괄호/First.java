package Greedy.BJ.BJ1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String sequence = st.nextToken();
        long total = 0;
        int firstM = sequence.indexOf("-");

        if(firstM != -1){
            String mess1 = sequence.substring(0, firstM);
            String mess2 = sequence.substring(firstM+1, sequence.length());

            st = new StringTokenizer(mess1, "+");

            while(st.hasMoreTokens()){
                total += Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(mess2, "+|-");

            while(st.hasMoreTokens()){

                total -= Integer.parseInt(st.nextToken());
            }
        } else {
            st = new StringTokenizer(sequence, "+");
            while(st.hasMoreTokens()){

                total = total + Integer.parseInt(st.nextToken());
            }
        }
        System.out.print(total);
    }
}
