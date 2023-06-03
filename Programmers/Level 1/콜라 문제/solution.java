import java.util.*;

class solution {

    public int solution(int a, int b, int n) {

        int total = 0;
        int bottle = n;

        while(bottle/a > 0) {

            int x = bottle / a;
            int y = bottle % a;

            total += x * b;

            bottle = (x * b) + y;

        }

        return total;
    }
}
