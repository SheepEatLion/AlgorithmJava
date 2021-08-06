import java.util.*;

public class b_210806_2 {
    public static void main(String[] args) {
        int i, k, answer = 0;
        char[] match = {'a', 'e', 'i', 'o', 'u'};
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (k = 0; k < input.length(); k++) {
            for (i = 0; i < match.length; i++) {
                if (input.charAt(k) == match[i]) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
