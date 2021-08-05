import java.util.*;

public class kakao2021_1 {
    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }
    public static int solution(String s) {
        int i;
        boolean flag = false;
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; // 문자배열

        HashMap<String, String> map = new HashMap<>(); // 해쉬맵 정의
        for (i = 0; i < arr.length; i++){
            map.put(arr[i], Integer.toString(i)); // 해쉬맵 초기화
        }
        do {
            for (i = 0; i < arr.length; i++) {
                if (s.contains(arr[i])) {
                    s = s.replace(arr[i], map.get(arr[i]));
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
        } while (flag);
        return Integer.parseInt(s);
    }
}
/*
public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
 */
