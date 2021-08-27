
public class p_210819_1 {

    public p_210819_1() {
        //System.out.println(solution([[100,90,98,88,65],[50,45,99,85,77],[47,88,95,80,67],[61,57,100,80,65],[24,90,94,75,65]]));
    }
    public String solution(int[][] scores) {
        int i, j, k, self_score, max_cnt, min_cnt, avg;
        int students = scores.length;
        int[] sum = new int[students];
        boolean flag;

        String answer = "";
        // 열을 기준으로 평균을 구한다.
        // n열에서 n행의 값이 해당 열에서의 유일한 최고값이거나 최저값이면 제외하고 평균을 구한다.
        // i = col; j = row;
        for(i=0; i<students; i++){
            self_score = scores[i][i];
            max_cnt = 0;
            min_cnt = 0;
            sum[i] = 0;
            flag = false;
            avg = 0;
            for(j=0; j<students; j++){
                if(scores[j][i] >= self_score){
                    max_cnt++;
                }
                if(scores[j][i] <= self_score){
                    min_cnt++;
                }
                sum[i] += scores[j][i];
            }
            if(max_cnt == 1 || min_cnt == 1){
                sum[i] -= scores[i][i];
                flag = true;
            }
            if(flag){
                avg = sum[i] / (students - 1);
            }else{
                avg = sum[i] / students;
            }
            // 학점으로 변경
            if(avg >= 90){
                answer += "A";
            }else if(avg >= 80){
                answer += "B";
            }else if(avg >= 70){
                answer += "C";
            }else if(avg >= 50){
                answer += "D";
            }else{
                answer += "F";
            }
        }
        return answer;
    }
}
