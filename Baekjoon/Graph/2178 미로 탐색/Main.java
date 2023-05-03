import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int row;
    static int col;
    // 상하좌우 순서
    static int[] dirRow = {0,0, -1, 1};
    static int[] dirCol = {-1,1,0,0};
    static int[][] miro;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        visited = new boolean[row][col];
        miro = new int[row][col];

        for (int i = 0; i<row; i++){

            String str = br.readLine();
            for (int j = 0; j<col; j++){
                miro[i][j] = str.charAt(j) - '0';
            }
        }


        BFS(0,0);
        System.out.print(miro[row-1][col-1]);
    }

    static void BFS(int a, int b){

        visited[a][b] = true;
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] {a,b});
        
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int nowRow = now[0];
            int nowCol = now[1];

            for (int i = 0; i<4; i++){
                // 상하좌우 순서
                int nextRow = nowRow + dirRow[i];
                int nextCol = nowCol + dirCol[i];

                if (nextRow < 0 || nextCol < 0 || nextRow >= row || nextCol >= col){
                    continue;
                }
                if (visited[nextRow][nextCol] || miro[nextRow][nextCol] == 0){
                    continue;
                }

                queue.add(new int[]{nextRow, nextCol});
                miro[nextRow][nextCol] = miro[nowRow][nowCol] + 1;
                visited[nextRow][nextCol] = true;

            }
        }
    }
}