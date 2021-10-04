import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class p_210827_2 {
    public static void main(String[] args) {
        int[][] maps = {{1, 0, 1, 1, 1, 1}, {1, 0, 1, 0, 1, 1}, {1, 0, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1}, {0, 0, 0, 0, 1, 1}};
        int Y = maps.length, X = maps[0].length;
        Point p = new Point();

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(Y-1, X-1));

        boolean[][] visited = new boolean[Y][X];
        int x = 0, y = 0, size = 0, cnt = 0;

        while(!queue.isEmpty()){
            size = queue.size();
            cnt++;
            for(int i=0; i<size; i++){
                p = queue.peek();
                x = p.x;
                y = p.y;
                queue.remove();
                if(visited[y][x]){
                    continue;
                }
                maps[y][x] = 0;
                visited[y][x] = true;
                if(x == 0 && y == 0){
                    System.out.println(cnt);
                    System.exit(0);
                }
                if(x-1 > -1 && maps[y][x-1] == 1){
                    queue.add(new Point(y, x-1));
                }
                if(x+1 < X && maps[y][x+1] == 1){
                    queue.add(new Point(y, x+1));
                }
                if(y-1 > -1 && maps[y-1][x] == 1){
                    queue.add(new Point(y-1, x));
                }
                if(y+1 < Y && maps[y+1][x] == 1){
                    queue.add(new Point(y+1, x));
                }
            }
        }

    }
}
