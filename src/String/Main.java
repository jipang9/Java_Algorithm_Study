package String;

import java.util.Scanner;

public class Main {
    // NUMBER : 7
    // 설명 : 앞에서 읽을 때나, 뒤에서 읽을 때, 같은 문자열을 회문 문자열이라 칭한다.
    // 입력된 문자열이 회문 문자열이면 "yes" 아니면 "No"를 출력히는 프로그램을 작성하고, 단 회문을 검사할 때, 대소문자를 구분하지 않는다.
    /**
     * 회문 문자열
     public String solution(String input) {
     String answer = "YES";
     input = input.toUpperCase();
     for (int i = 0; i < input.length() / 2; i++) {
     if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
     return "NO";}}return answer;}

     public static void main(String[] args) {
     Main T = new Main();
     Scanner sc = new Scanner(System.in);
     String input = sc.next();
     System.out.println(T.solution(input));
     }
     */

    // NUMBER : 8
    // 설명 : 앞서 설명한 앞, 뒤 읽었을 때 같은 문자열을 회문 문자열  = 팰린드롬이라 한다.
    // 위 방식과 동일하나 replaceAll()을 이용해다는 점
    /**
     * replaceAll을 이용한 유요한 팰린드롬*
     public String solution(String s){
     String answer= "NO";
     s=s.toUpperCase().replaceAll("[^A-Z]","");
     String tmp = new StringBuilder(s).reverse().toString();
     if(s.equals(tmp))answer="YES";
     return answer;
     }

     public static void main(String[] args) {
     Main T = new Main();
     Scanner scanner = new Scanner(System.in);
     String str = scanner.nextLine();
     System.out.println(T.solution(str));
     }
     */

    // NUMBER : 9
    // 설명 : 문자와 숫자가 섞여있는 문자열이 주어지면, 그 중 숫자만 추출해서 순서대로 자연수를 만들어서 출력하기
    // ex) g0en2T0s8eSoft -> 0, 2, 0, 8 == 208
    //   <접근방식>
    // 나는 어떻게 접근할 것인가? -> 문자열 입력받고, 문자열의 길이만큼 반복을 통해 숫자와 문자를 필터->
    // 그리고 숫자를 배열에 저장-> 배열 반환?  (그럼 숫자와 문자를 어떻게 필터할건데? -> '아스키코드' 이용)
    /**
     * 내가 작성한 solution*
     public int solution(String s){

     int answer = 0;
     for(int i =0; i<s.length(); i++){
     char a = s.charAt(i);

     if((int)a >57 || (int)a <47)
     // 이렇게 if문을 사용하지 않고도 isDigit()메소드 사용 가능함
     continue;
     else
     // 이 부분이 핵심이 될 듯? -> 기존에 생각 했던 부분은 그냥 문자를 계속 더해주는 것... -> (실패)
     answer = answer*10+((int)a-48);
     }
     return answer;
     }
     public static void main(String[] args){
     Main T = new Main();
     Scanner scanner=new Scanner(System.in);
     String s = scanner.nextLine();
     System.out.println(T.solution(s));
     }
     */
    /**
     *isDigit()메소드로 if문을 교체할 수 있다. 이 메소드는 입력값이 숫자인지 아닌지 여부를 T or F로 판단하는 메소드*
     여기서 answer는 int가 아니라 String으로 와야한다.
     for(char x : s.toCharArray()){
     if(Character.isDigit(x)) answer+=x;
     }return Integer.answer;
     */
    /**
     * 향상된 for문을 이용하면 더욱 간결하게 가능*
     for(char i : s.toCharArray()){
     .. 조건식
     }
     */

    //NUMBER : 10
    // 설명 : 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성
    // ex) teachermode e -> 1 0 1 2 1 0 1 2 2 1 0
    // <접근방식> 고민해보기 정방향 -> 역방향 순으로 반복문을 통해 해당 요소가 있는지 확인하고, 값을 기준으로 최소거리를 저장하면 됐었음.
    // 본 강의에서는 Math.min()을 이용해 기존에 있던 배열의 요소와 새로운 값을 비교해 더 작은 값을 넣는 방식 (더 간단함)
    // 나는 이 부분을 직접 조건식을 통해 해결하려고 했었음
    /**
     * 내가 작성한 solution*
     * public int[] solution(String s,char t){
     * int p = 1000;
     * int[] answer= new int[s.length()];
     * for(int i=0; i<s.length(); i++){
     * if(s.charAt(i)==t){
     * p=0;
     * answer[i]=p;
     * }else
     * p++;
     * answer[i]=p;
     * }
     * p=1000;
     * for(int i=s.length()-1; i>=0; i--){
     * if(s.charAt(i)==t)p=0;
     * else{
     * p++;
     * answer[i]=Math.min(answer[i],p);
     * }
     * }
     * return answer;
     * }
     * public static void main(String[] args){
     * Main T = new Main();
     * Scanner scanner=new Scanner(System.in);
     * String s = scanner.next();
     * char t = scanner.next().charAt(0);
     * for(int x: T.solution(s, t)){
     * System.out.print(x+" ");
     * }
     * }
     */

    //NUMBER : 11
    // 설명 : 알파벳 대문자로 이루어진 문자열을 입력받아 -> 같은 문자가 연속으로 반복되는 경우 반복 문자 바로 오른쪽에 반복 횟수를 표기
    // ex) KKHSSSSSSSF -> K2H1S7F1 이런방식으로 -> 이렇게 하는 줄 알았는데, 1개인 부분은 1은 안찍고 그냥 알파벳만 찍음
    // 고민해보기
    // 우선 반복문 탐색(String 길이) -> 문자열 앞, 뒤 요소 비교하고 같으면 count 증가, 다르면 해당 문자열 요소와 count 저장
    // 근데 이렇게 하면 StringboundaryException 발생 -> 당연함 요소가 없는데 어떻게 비교하냐? (이 부분에서 고민 많이 함)
    // -> 해결책 : 그냥 빈 여백 하나 추가..?
    /**
     * 내가 작성한 solution*
    public String solution(String a) {
        String s = a + " ";
        String answer = "";
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                answer = answer + s.charAt(i);
                if (count > 1) {
                    answer = answer + Integer.toString(count);
                    count = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(T.solution(input));

    }
     */

    // NUMBER : 12
    // 설명 : 알파벳 한 문자마다 # or *이 7개로 구성되어 있다 -> 입력된 # or * 일곱자리의 이진수(#->1, *->0)으로 변환 ->
    // 이렇게 바뀐 이진수를 다시 10진수로 변환  -> 이 10진수를 아스키 코드로 변환 -> 그리고 출력
    // ex) 4 #****###**#####**#####**##**  -> COOL
    // 로직 순서 -> 입력받은 문자열을 이진수로 변환 -> 이 이진수를 쪼갬과 동시에 10진수로 변환하고, 그 요소를 배열에 저장
    // -> 배열의 인덱스엔 10진수가 저장되어있으니까 이 배열을 순회하면서 10진수를 아스키코드로 변환 -> 출력 끝!
    // 고민해보기 <접근방식>
    // 로직을 위의 설명처럼 구성했음. 과연 더욱 효율적인 방법이 있을까?
    /**
     * 내가 구현한 solution*
    public void solution(int num, String p){
        String a = "";
        String answer = "";
        int []arr = new int[num];
        for(int i=0; i<p.length(); i++){
            if(p.charAt(i)=='#'){
                a=a+'1';
            }else{
                a=a+'0';
            }
        }
        for(int i=0; i<num; i++){
            String b=a.substring(i*7,((i*7)+7));
            int c = Integer.parseInt(b,2);
            arr[i]=c;
        }
        for(int i=0; i<num; i++){
            char ch = (char) arr[i];
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String password = scanner.next();
        T.solution(num,password);
    }
     */
    /**
     * 해설강의 -> 너무 코드가 간결하다 내가 작성한 로직에 비해*
    public String solution(int n, String s){
        String answer="";
        for(int i=0; i<n; i++){
            String tmp=s.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp,2);
            answer += (char)num;
            s=s.substring(7);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String password = scanner.next();
        System.out.println(T.solution(num,password));
    }
     */
}
