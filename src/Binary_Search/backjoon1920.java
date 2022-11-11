package Binary_Search;

import java.io.IOException;
import java.util.*;

public class backjoon1920 {
    public static int binarySearch(int[] arr, int findNum){
        int min = 0;
        int max = arr.length-1;
        int count = (min+max)/2;
        while(min<=max) {
            if (findNum < arr[count]) {
                max = count-1;
            }else if(findNum > arr[count]) {
                min = count+1;
            }else{
                return 1;
            }
            count = (min+max)/2;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        int [] arr = new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++){
            int findNum = scanner.nextInt();
            System.out.println(binarySearch(arr,findNum));
        }
    }

}
