import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        chanceCount = Integer.parseInt(st.nextToken());
        trapCount = Integer.parseInt(st.nextToken());
        int[][] chance = new int[chanceCount][2];
        int[][] trap = new int[trapCount][2];
        for (int i = 0; i < chanceCount; i++) {
            st = new StringTokenizer(br.readLine());
            chance[i][0] = Integer.parseInt(st.nextToken());
            chance[i][1] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < trapCount; i++) {
            st = new StringTokenizer(br.readLine());
            trap[i][0] = Integer.parseInt(st.nextToken());
            trap[i][1] = Integer.parseInt(st.nextToken());
        }
        int answer = bfs(chance, trap, 1, 100);
        sb.append(answer).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    static int chanceCount;
    static int trapCount;
    static int[] moveCount;


    private static int bfs(int[][] chance, int[][] trap, int start, int goal) {
        //변동되는사항
        //주사위
        //함정
        //찬스
        // 주사위 -> 함정 || 찬스
        // for 주사위{
        //      for 찬스{
        //          if(현재 위치 == 찬스[0]){
        //              현재 위치 = 찬스[1]
        //          }
        //      }
        //  for 함정{
        //  }
        //  if(각종 범위가 일치했다면){
        //      현재위치 = 최근위치 + 주사위
        //      주사위 count ++;
        //  }
        // }
        //  if ( 현재위치 == 타겟){
        //      return 주사위 던진 횟수
        //  }
        moveCount = new int[start+goal];
        final int[] dice = {1, 2, 3, 4, 5, 6};
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(start);
        while (!queue.isEmpty()) {
            Integer current = queue.poll();
            for (int i = 0; i < 6; i++) {
                int move = current + dice[i];
                for (int j = 0; j < chance.length; j++) {
                    if (move == chance[j][0]) {
                        move = chance[j][1];
                    }
                }
                for (int j = 0; j < trap.length; j++) {
                    if (move == trap[j][0]) {
                        move = trap[j][1];
                    }
                }

                if (move >= 0 && move <= 100 && moveCount[move] == 0) {
                    moveCount[move] = moveCount[current] + 1;
                    queue.add(move);
                }
            }
            if (current == goal) {
                return moveCount[goal];
            }
        }
        return -1;

    }

}
