package algo._test;

public class Main_2 {

    public int solution (int num, int[] mark){
        int answer = -1;
        int now = 0;

        for (int i = 0; i < num; i++){

            //if (i > mark.length-1) {
                answer = mark[answer];
            //}
//            else {
//                answer = mark[i];
//            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main_2 T = new Main_2();
        int testnum1 = 3;
        int [] testarray1 = {1,2,3,1};
        int testnum2 = 5;
        int [] testarray2 = {1,2,3,1};

        System.out.println(T.solution(testnum2, testarray2));
    }
}