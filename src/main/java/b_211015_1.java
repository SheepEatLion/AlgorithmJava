import java.util.Scanner;

public class b_211015_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[] arr = new int[W];
        for(int w = 0; w < W; w++){
            arr[w] = sc.nextInt();
        }

        int standard = 0;
        int left;
        int right;
        int save = 0;
        int leftRight;
        int i = 0;
        if(arr.length < 3){
            System.out.println(0);
        }else{
            while (i < arr.length - 2) {
                if (arr[i] > arr[i + 1]) {  // 현재 값보다 다음 값이 작은지 확인, 작다면 기준점으로 설정
                    standard = i + 1;     // 기준값 설정
                    left = i;
                    right = standard + 1;
                    if (arr.length - i > 3) {
                        for (int j = standard + 2; j < arr.length; j++) {
                            if (arr[j] >= arr[right]) {
                                right = j;
                            }
                        }
                    }
                    if (arr[left] < arr[right]) {
                        leftRight = left;
                    } else {
                        leftRight = right;
                    }
                    for (int k = left + 1; k < right; k++) {
                        if (arr[leftRight] - arr[k] <= 0) {
                            i = k;
                            break;
                        }
                        save += arr[leftRight] - arr[k];
                        i = right;
                    }
                } else {
                    i += 1;
                }
            }
            System.out.println(save);
        }
    }
}
