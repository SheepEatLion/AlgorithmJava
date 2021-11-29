import java.util.ArrayList;

public class heap {
    public static class minHeap{

        private ArrayList<Integer> heap;

        // 생성자
        public minHeap() {
            heap = new ArrayList<>();
            heap.add(0);
        }

        // 삽입
        public void insert(int val) {
            heap.add(val);
            int p = heap.size() - 1;

            while(p > 1 && heap.get(p / 2) > heap.get(p)) {
                System.out.println("swap");
                int tmp = heap.get(p/2);
                heap.set(p/2, heap.get(p));
                heap.set(p, tmp);

                p = p / 2;
            }
        }

        // 삭제
        public int delete() {
            if(heap.size()-1 < 1){
                return 0;
            }

            int deleteItem = heap.get(1);

            heap.set(1, heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);

            int pos = 1;
            while((pos * 2) > heap.size()){
                int min = heap.get(pos * 2);
                int minPos = pos * 2;

                if( (pos * 2 + 1) < heap.size() && min > heap.get(pos * 2 + 1)){
                    min = heap.get(pos * 2 + 1);
                    minPos = pos * 2 + 1;
                }

                if(heap.get(pos) < min){
                    break;
                }

                int tmp = heap.get(pos);
                heap.set(pos, heap.get(minPos));
                heap.set(minPos, tmp);
                pos = minPos;
            }
            return deleteItem;
        }
    }

    public static void main(String[] args) {



    }
}
