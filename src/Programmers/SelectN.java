package Programmers;
import java.util.Scanner;

public class SelectN {
    // 문제 설명
    // 정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
    // numList 속 n의 배수가 아닌 수를 제거하고 n 배수만 담긴 배열을 return 하시오
    // ex ->  n=3, numList = [4, 5, 6, 7, 8, 9, 10, 11, 12] => [6, 9, 12]


    //    class Solution {
//        public int[] solution(int n, int[] numList) {
//            int[] answer = {};
//            return answer;
//        }
//    }
    public static int[] solution(int n, int[] numList) {
        int [] getList = numList;
        int[] answer = new int[100];

        for(int i=0;i < numList.length; i++){
            if(getList[i]%n==0)
                answer[i]=i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100]; // 배열의 크기
        int N = scanner.nextInt(); // 입력받을 수
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(" 배열의 원소는 다음과 같습니다. : "+arr[i]);
        }
//        System.out.println(solution(N,arr));
    }
}
