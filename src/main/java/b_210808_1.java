import java.util.*;

public class b_210808_1 {
    public static void main(String[] args) {
        boolean[] cups = {true, false, false}; // 시작할때는 왼쪽 컵에 공이 들어있음.
        int i;
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        for(i=0; i<input.length(); i++){
            if(input.charAt(i) == 'A' && !cups[2]){
                // A 이벤트 동작
                cups[0] = !cups[0];
                cups[1] = !cups[1];
            }else if(input.charAt(i) == 'B' && !cups[0]){
                // b 이벤트 동작
                cups[1] = !cups[1];
                cups[2] = !cups[2];
            }else if(input.charAt(i) == 'C' && !cups[1]){
                cups[0] = !cups[0];
                cups[2] = !cups[2];
            }
        }
        for(i=0; i<3; i++){
            if(cups[i]){
                System.out.println(i+1);
                break;
            }
        }
    }
}
