import java.util.*;

class solution {

    public int solution(String t, String p) {

        int length = p.length();
        int result = 0;
        int start = 0;
        int end = length;
        
        for (int i = 0; i<t.length()-p.length()+1; i++){

            String strNumber = t.substring(start, end);
            Long longNumber = Long.parseLong(strNumber);

            if (longNumber <= Long.parseLong(p)){
                result++;
            }

            start++;
            end++;

        }
        return result;
    }
}
