import java.util.*;

public class b_210806_1 {
    public static void main(String[] args) {
        int i, sum=0;
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] arr = input.split(",");
        for (i=0; i<arr.length; i++){
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}
