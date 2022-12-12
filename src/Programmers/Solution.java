package Programmers;
public class Solution {
    /** 문제 : 2차원으로 만들기
     설명 : 매개변수로 주어진 정수 배열과 매개변수가 주어지는데, 주어진 매개변수를 이용해 새로운 2차원 배열로 변경하시오
     ex) [1, 2, 3, 4, 5, 6, 7, 8], 2 => [[1, 2], [3, 4], [5, 6], [7, 8]]
     <생각>
     먼저 어떻게 2차원 배열의 행,열을 할당할 수 있을까에 대한 고민 -> 직접 배열을 그려서 잘라보며 접근할 수 있도록 생각했음
     */
    /**
     * 2차원으로 만들기 문제에 대한 SOLUTION*
     public int[][] solution(int[] num_list,int n){
     int[][] answer =new int[num_list.length/n][n];
     for(int i=0; i<num_list.length; i++){
     answer[i/n][i%n]=num_list[i];
     }
     return answer;
     }
     */
    //
    /**
     * 문제 : 캐릭터의 좌표*
     */
    /**
     * 캐릭터의 좌표에 대한 SOLUTION*
    public int[] solution(String[] key, int[] board) {
        int answer[] = {0,0};
        int x = board[0]/2;
        int y = board[1]/2;
        for(int i=0; i< key.length; i++){
            if(key[i].contains("left")|| key[i].contains("right")){

                if(key[i].equals("right")){
                    answer[0]++;
                }else{
                    answer[0]--;
                }
            }else{
                if(key[i].equals("up")){
                    answer[1]++;
                }else{
                    answer[i]--;
                }
            }
        }
        if(answer[0]>x){
            answer[0]=x;
        }else if(answer[0]< -(x)){
            answer[0]= -(x);
        }else{
            ;
        }
        if(answer[1]>y){
            answer[1]=y;
        }else if(answer[1]< -(y)){
            answer[1] = -(y);
        }else{
            ;
        }
        return answer;


//        public int[] solution(String[] keyinput, int[] board) {
//            // 최종 좌표가 들어갈 변수 answer
//            int[] answer = {0,0};
//            int col = ( (board[0]-1) / 2);
//            int row = ( (board[1]-1) / 2);
//
//            // board는 [x,y]의 형태로 주어짐, 길이2 최대인덱스 1
//            // board에 주어진 좌표는 0,0을 제외하고 상하좌우 균등분배를 해 주어야 한다.
//            // 배열 내 인덱스 데이터는 음수가 가능하지만 인덱스는 음수여선 안된다.
//            // 시작점은 0,0부터 시작. (board의 값에 -1씩 해줘야한다 유추가능.)
//            // 균등분배 후 이동좌표를 초과하면 최대좌표를 리턴한다.
//            for(int i = 0; i <keyinput.length; i++){
//                switch(keyinput[i]){
//                    case "left":
//                        answer[0] = answer[0]-1;
//                        break;
//                    case "right":
//                        answer[0] = answer[0]+1;
//                        break;
//                    case "up":
//                        answer[1] = answer[1]+1;
//                        break;
//                    case "down":
//                        answer[1] = answer[1]-1;
//                }
//                if(Math.abs(answer[0]) > Math.abs(col)){
//                    if(answer[0] < 0 ){
//                        answer[0] = answer[0] + 1;
//                    } else {
//                        answer[0] = answer[0] - 1;
//                    }
//                } else if (Math.abs(answer[1]) > Math.abs(row)){
//                    if(answer[1] < 0 ){
//                        answer[1] = answer[1] + 1;
//                    } else {
//                        answer[1] = answer[1] - 1;
//                    }
//                }
//            }
//            return answer;
//        }
    }
*/
    //
    /**
     * 문제 : 영어가 싫어요
     설명 : 영어로 표기되어있는 숫자를 수로 바꾸려고 하는데, 문자열이 매개변수로 주어지고, numbers를 정수로바꿔서 return 하도록 함수를 작성하시오
     ex) "onetwothreefourfivesixseveneightnine" -> 123456789
     <생각>
     어떻게 문자열을 자를까 생각을 했는데, 도저히 떠오르지가 않아서 인터넷에 검색해보니 replace를 사용했다..
     */
    /**
     * 영어가 싫어요 문제에 대한 SOLUTION*
    public long solution(String numbers) {
        long answer = 0;
        numbers.replace("zero","0");
        numbers.replace("one","1");
        numbers.replace("two","2");
        numbers.replace("three","3");
        numbers.replace("four","4");
        numbers.replace("five","5");
        numbers.replace("six","6");
        numbers.replace("seven","7");
        numbers.replace("eight","8");
        numbers.replace("nine","9");
        answer = Long.parseLong(numbers);
        return answer;
    }
     */
    //
    public static void main(String[] args) {
        /**
         * 2차원으로 만들기 문제 main *
         int [] arr = {1,2,3,4,5,6,7,8};
         int num = 2;
         Solution solution = new Solution();
         solution.solution(arr,num);
         */
        /**
         * 캐릭터 좌표 문제 main*
        String[] key = {"left", "left", "left", "left", "left", "up"};
        int[] board = {9, 9};
        Solution solution = new Solution();
        solution.solution(key, board);
        for (int i = 0; i < solution.solution(key, board).length; i++) {
            System.out.println(solution.solution(key, board)[i]);
        }
         */
        /**
         * 영어가 싫어요 문제 main*
        String numbers = "onetwothreefourfivesixseveneightnine";
        Solution solution = new Solution();
        solution.solution(numbers);
         */
    }


}
