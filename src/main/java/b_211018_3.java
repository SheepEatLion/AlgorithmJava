import java.util.Scanner;

public class b_211018_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true){
            int w = sc.nextInt();
            int h = sc.nextInt();
            if(w == 0 && h == 0){
                break;
            } else {
                int[][] graph = new int[h][w];

                for(int i = 0; i < h; i++){
                    for(int j = 0; j < w; j++){
                        graph[i][j] = sc.nextInt();
                    }
                }
                //4963
                boolean[][] visited = new boolean[h][w];
                int cnt = 0;
                for(int x = 0; x < w; x++){
                    for(int y = 0; y < h; y++){
                        if(graph[y][x] == 1 && !visited[y][x]){
                            dfs(x, y, graph, visited, h, w);
                            cnt++;
                        }
                    }
                }
                System.out.println(cnt);
            }
        }

    }
    public static Integer dfs(int _x, int _y, int[][] graph, boolean[][] visited, int h, int w){
        int[][] dxdy = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};
        // 이미 방문한 적이 있는 위치면 종료
        if(visited[_y][_x]){
            return null;
        } else {
            visited[_y][_x] = true;
        }
        for(int[] d: dxdy){
            if(_y+d[1] >= 0 && _y+d[1] < h && _x+d[0] >= 0 && _x+d[0] < w && graph[_y+d[1]][_x+d[0]] == 1){
                dfs(_x+d[0], _y+d[1], graph, visited, h, w);
            }
        }
        return null;
    }

}
