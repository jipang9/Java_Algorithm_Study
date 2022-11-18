package Function;

import java.util.Scanner;

public class baeckjoon1064 {

    private static int checkNum(int n) {
        int han = 0;
        if(n<100) {
            return n;
        }
        else{
            han=99;
            for(int k = 100; k<=n; k++){
                int first = k/100;
                int second = (k/10)%10;
                int third = k%10;

                if(first-second == second-third){
                    han++;
                }
            }
        }
        return han;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(checkNum(sc.nextInt()));
    }
}
