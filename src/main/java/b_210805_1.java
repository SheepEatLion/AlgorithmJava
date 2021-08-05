import java.util.*;

public class b_210805_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, sum = 0;
        for (i=0; i<5; i++){
            int temp = sc.nextInt();
            sum += (temp * temp);
        }
        System.out.println(sum % 10);
    }
}
