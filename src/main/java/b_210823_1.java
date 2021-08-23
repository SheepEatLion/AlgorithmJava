import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class b_210823_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());
        int i;

        Stack<String> stack = new Stack<>();
        for(i=1; i<=tc; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());

            while(stk.hasMoreTokens()){
                stack.push(stk.nextToken());
            }

            bw.write("Case #" + i + ": ");
            while(!stack.isEmpty()){
                bw.write(stack.pop()+ " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
