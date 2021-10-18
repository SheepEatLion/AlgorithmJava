import java.util.Scanner;

public class b_211018_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 1){
            System.out.println(1);
        } else {
            int[] memo = new int[10010];
            memo[0] = 1;
            memo[1] = 1;
            memo[2] = 3;
            memo[3] = 5;
            //memo[4] = 11;

            for(int i = 4; i <= n; i++){
                memo[i] = memo[i-1] + memo[i-2] * 2;
                memo[i] %= 10007;
            }
            System.out.println(memo[n]);
        }
    }

}
