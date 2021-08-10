import java.io.*;
public class b_210810_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j;
        String[] arr = new String[5];
        StringBuffer answer = new StringBuffer();
        int max = 0;
        for(i=0; i<5; i++){
            String input = br.readLine();
            if(max < input.length()){
                max = input.length();
            }
            arr[i] = input;
        }
        for(i=0; i<max; i++){ // col
            for(j=0; j<5; j++){ // row
                try{
                    answer.append(arr[j].charAt(i));
                }catch (Exception exception){
                    continue;
                }
            }
        }
        System.out.println(answer);
    }
}
