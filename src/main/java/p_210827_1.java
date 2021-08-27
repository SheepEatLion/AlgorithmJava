import java.util.ArrayList;

public class p_210827_1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int i;
        ArrayList<Integer> list = new ArrayList<>();
        int target = arr[0];
        list.add(target);
        for(i=1; i<arr.length-1; i++){
            if(target != arr[i]){
                target = arr[i];
                list.add(target);
            }
        }
        System.out.println(list);
    }
}
