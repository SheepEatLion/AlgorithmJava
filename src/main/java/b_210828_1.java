import java.util.*;
public class b_210828_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        // 1 2 4, 8 16 32
        for(int i = 0; i < n; i++){
            for(int j=0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // 3, 1 1 2 3, 1 2 1 2, 1 3 2 3
        int k = sc.nextInt();
        for(int l = 0; l < k; l++){
            int sum = 0;
            int y1 = sc.nextInt();
            int x1 = sc.nextInt();
            int y2 = sc.nextInt();
            int x2 = sc.nextInt();
            for(int y = y1-1; y < y2; y++){
                for(int x = x1-1; x < x2; x++){
                    sum += arr[y][x];
                }
            }
            System.out.println(sum);
        }
    }
}
