import java.io.*;

public class b_210808_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int i;
        char ch;
        String answer = "";
        for(i=0; i<str.length(); i++){
            ch = str.charAt(i);
            if(95 < (int)ch){ // 97보다 작다면 대문자, 크다면 소문자
                answer = answer.concat(Character.toString(ch).toUpperCase());
            }else{
                answer = answer.concat(Character.toString(ch).toLowerCase());
            }
        }
        System.out.println(answer);
    }
}
