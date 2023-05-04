import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i<9; i++){
            int n = sc.nextInt();
            list.add(n);
            sum += n;
        }
        Collections.sort(list);

        for (int i = 0; i<list.size()-1; i++) {
            for (int j = i+1; j<list.size(); j++){
                if (sum-(list.get(i)+ list.get(j)) == 100){
                    list.remove(j);
                    list.remove(i);
                    break;
                }
            }
            if(list.size()==7){
                break;
            }
        }
        for (int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}