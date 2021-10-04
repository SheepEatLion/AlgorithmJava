import java.util.*;

public class p_211004 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        int[] answer = new int[prices.length];
        int timeCount;
        for(int i=0; i < prices.length - 1; i++){
            timeCount = 0;
            for(int k=i+1; k < prices.length; k++){
                timeCount++;
                if(prices[i] > prices[k]){
                    break;
                }
            }
            answer[i] = timeCount;
        }
        for(int j=0; j < answer.length; j++){
            System.out.println(answer[j]);
        }


        /*
        LinkedList<Integer> queue = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        int timeCount = 0;

        for(int v: prices){
            queue.offer(v);
        }

        while(!queue.isEmpty()) {
            if( queue.size() == 1){
                answer.add(0);
                break;
            }
            for (int i = 1; i < queue.size(); i++) {
                // now 시점을 기준으로 이후에 가격이 떨어지는지 확인
                if (queue.get(0) > queue.get(i)) {
                    timeCount++;
                    break;
                } else {
                    timeCount++;
                }
            }
            answer.add(timeCount);

            timeCount = 0;
            queue.poll();
        }
        int[] result = answer.stream().mapToInt(i -> i).toArray();
         */
    }
}
