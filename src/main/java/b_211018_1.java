import java.util.Scanner;

public class b_211018_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 0 || n == 1){
            System.out.println(1);
        } else {
            int[] memo = new int[100];
            memo[0] = 1;
            memo[1] = 1;

            for(int i = 2; i <= n; i++){
                memo[i] = memo[i-1] + memo[i-2];
                memo[i] %= 10007;
            }
            System.out.println(memo[n]);
        }
    }

}
