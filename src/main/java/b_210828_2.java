import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class b_210828_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sold = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < sold; i++){
            String book = br.readLine();
            if(!map.containsKey(book)){
                map.put(book, 1);
                if(max < 1){
                    max++;
                }
            }else{
                int value = map.get(book);
                map.put(book, value+1);
                if(max < value + 1){
                    max = value + 1;
                }
            }
        }
        for (String key: map.keySet()) {
            if(map.get(key) == max){
                list.add(key);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
