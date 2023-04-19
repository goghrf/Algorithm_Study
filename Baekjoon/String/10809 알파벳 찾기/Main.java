import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] alphabet = new int[26];

        Arrays.fill(alphabet, -1);

        String s = sc.next();

        for (int i = 0; i<s.length(); i++){
            if (alphabet[s.charAt(i)-97] == -1){
                alphabet[s.charAt(i)-97] = i;
            } else {
                continue;
            }

        }

        for (int i = 0; i<alphabet.length; i++){
            System.out.print(alphabet[i]+" ");
        }

    }
}