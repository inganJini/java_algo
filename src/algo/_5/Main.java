/**
 * 5. 특정 문자 뒤집기
 * 설명
 *
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 *
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 *
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *
 *
 * 예시 입력 1
 * a#b!GE*T@S
 *
 * 예시 출력 1
 * S#T!EG*b@a
 *
 *
 * 아래코드 통과안됨
 * 2pointer 로 해결해야함
 *
 */

package algo._5;

import java.util.Scanner;

public class Main {

    public String Solution(String str) {
        String answer = "";
        int lp = 0;
        int rp = str.length()-1;
        char[] x = str.toCharArray();
        //String[] result = new String[rp];

        while(lp < rp) {
            if (!Character.isAlphabetic(x[lp])) lp++;
            else if (!Character.isAlphabetic(x[rp])) rp--;
            else {
                char tmp = x[lp];
                x[lp] = x[rp];
                x[rp] = tmp;
                lp++;
                rp--;
            }
        }

        answer = String.valueOf(x);


        // int len = str.length();
        // String[] result = new String[len];
        // String[] sArr = str.split("");

        // case 1 -> 통과되지 않음  -> 2 pointer로 해결해야함
        //for (int i = 0; i < len; i++){
        //    if (sArr[i].matches("[a-z|A-Z]")){
        //        result[len-i-1] = sArr[i];
        //    } else {
        //        result[i] = sArr[i];
        //    }
        //}
        //
        //for (int j = 0; j < len; j++){
        //    answer += result[j];
        //}

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(T.Solution(input));
    }

}
