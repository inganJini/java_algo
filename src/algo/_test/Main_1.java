package algo._test;

public class Main_1 {

    public int solution(int[][] flowers){
        int answer = 0;

        int bf = 0;
        int n = flowers.length;
        int min = 0;
        int now = 0;
        for (int i = 0; i < n; i++){
            int len = flowers[i][1] - flowers[i][0];

            if (i == 0){
                bf = 0;
            } else {
                bf = flowers[i-1][1]-1;
            }

            min = flowers[i][0];
            for (int j = 0; j < len; j++){
                now = min;
                //System.out.println(now);
                if (now > bf){
                    answer++;
                }
                min++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_1 T = new Main_1();
        int [][] test1 = {{2, 5},{3, 7}, {10, 11}};
        int [][] test2 = {{3, 4},{4, 5}, {6, 7}, {8, 10}};
        int [][] test3 = {{3, 10},{4, 5}, {7, 8}, {9, 12}};
        int [][] test4 = {{1, 2}, {3, 9}, {2, 6}, {7, 10}};
        System.out.println(T.solution(test4));
    }
}
