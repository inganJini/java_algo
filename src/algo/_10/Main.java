/**
 * 10. 가장 짧은 문자거리
 * 설명
 * 
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 * 
 * 
 * 입력
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 
 * 문자열의 길이는 100을 넘지 않는다.
 * 
 * 
 * 출력
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 * 
 * 
 * 예시 입력 1 
 * teachermode e
 * 
 * 예시 출력 1
 * 1 0 1 2 1 0 1 2 2 1 0
 * 
 * TEST RESULT
 * 1 0 1 2 3 0 1 2 3 4 0
 * 1 0 1 2 1 0 1 2 3 1 0
 * 
 * 참고 key 위치 index
 * 0 1 0 0 0 5 0 0 0 0 10
 * 
 * 
 * 
 */

package algo._10;

import java.util.Scanner;

public class Main {

    public int[] Solution(String str, char key) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == key){
                p = 0;
                answer[i] = p;
            } else {
                answer[i] = ++p;
            }
        }
        p = 1000;
        for (int i = str.length()-1; i >= 0; i--){
            if (str.charAt(i) == key){
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        // 모든 케이스 만족하지 않음
//        String answer = "";
//        int len = str.length();
//        int lp = 0, rp = 0;
//        int[] result = new int[len];
//
//        for (int i = 0; i < len; i++){
//            if (str.charAt(i) == key){
//                lp = 0;
//                result[i] = lp;
//            } else {
//                result[i] = ++lp;
//            }
//        }
//
//        for (int j = len-1; j > 0; j--){
//            if (str.charAt(j) == key){
//                rp = 0;
//                result[j] = rp;
//            } else {
//                if (result[j] > rp){
//                    result[j] = ++rp;
//                }
//            }
//        }
//
//        for (int j = 0; j < result.length; j++){
//            answer += result[j]+" ";
//        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char key = sc.next().charAt(0);

        for (int x : T.Solution(input, key)){
            System.out.print(x + " ");
        }
        //System.out.println(T.Solution(input, key.charAt(0))+" ");
    }
}
