import java.io.*;
import java.util.*;
public class b_210810_1 {
    public static void main(String[] args) throws IOException{
        int i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // tc 개수 입력받기
        for(i=0; i<tc; i++){
            String answer = "";
            String str = br.readLine(); // 문자열 입력받기
            answer += str.charAt(0);
            answer += str.charAt(str.length()-1);
            System.out.println(answer);
        }
    }
}
