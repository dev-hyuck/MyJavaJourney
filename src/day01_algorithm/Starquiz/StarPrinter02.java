package day01_algorithm.Starquiz;

// 별찍기 문제 -- 2
// 문제 : 첫쨰 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 n개를 찍는 문제
// 하지만 , 오른쪽을 기준으로 정렬한 별 (예제 참고)을 출력하시오
// 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
// 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

// 코드 설명 바깥 for문 : 줄 번호 i ( 1~ N)

// 예제 입력 1 : 5
// 예제 출력 1 :
//    *
//   **
//  ***
// ****
//*****
import java.util.Scanner;

public class StarPrinter02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 숫자를 입력하세요 : ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
