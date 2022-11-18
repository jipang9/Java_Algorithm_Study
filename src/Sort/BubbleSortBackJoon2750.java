package Sort;

import java.util.Scanner;

public class BubbleSortBackJoon2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 입력받을 수의 개수
        int [] arr = new int[N];  // 개수에 맞춰서 배열 길이 선언
        for(int i=0; i<N; i++){  // 반복문 루프를 통해 배열에 요소 저장.
          arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i =0; i<N;i++){
            for(int k=0; k<N-i-1; k++){
                if(arr[k]>arr[k+1]){
                    temp = arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
