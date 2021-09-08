import java.util.*;

public class b_210908_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int[] cow = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int cnt = 0;
        for(int i = 0; i < tc; i++){
            int num_cow = sc.nextInt();
            int loc_cow = sc.nextInt();
            if( cow[num_cow] == -1 ){
                cow[num_cow] = loc_cow;
            } else if( cow[num_cow] != loc_cow) {
                cow[num_cow] = loc_cow;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
