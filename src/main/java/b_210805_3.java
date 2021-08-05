import java.util.*;
// 백준 15894번
public class b_210805_3 {
    public static void main(String[] args) {
        // 1 -> 4 , 2 -> 8 , 3 -> 12
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();
        System.out.println(number * 4);
    }
}
// 핵심은 자료형. 10의 9제곱까지 입력받아서 4를 곱하기 때문에 int 불가능.
