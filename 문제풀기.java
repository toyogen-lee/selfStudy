package 기초알고리즘;

import java.util.Scanner;

public class 문제풀기 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("how many people? ");
		int people = s.nextInt();
		//4. 피자를 나눠먹을 사람의 수 n 이 주어질 때, 모든 사람이 피자를 한 조각 이상
				//먹기 위해 필요한 피자의 수를 출력하세요. 피자 1판 = 8조각
		int pizza = people / 8;
		if (people % 8 == 0) {
			System.out.println("pizza : " + pizza);
		} else {
			pizza += 1;
			System.out.println("pizza : " + pizza);
		}
				
				//5. 사용자로부터 정수를 입력받아 팩토리얼을 계산하는 프로그램을 작성하세요.
				System.out.println("정수를 입력하세요. ");
				int fac = s.nextInt();
				int f = 1;
				for (int i = 1; i <= fac; i++) {
					f *= i;
				}
				System.out.println(f);
				//6. 구구단 출력
				for (int i = 2; i <= 9; i++) {
					for (int j = 1; j <= 9; j++) {
						System.out.print(i + " * " + j + " = " + i * j + "  ");
					}
				}
				System.out.println();
				//7. 사용자로부터 문자열을 입력받아 그 문자열의 길이를 출력하는 프로그램을 작성하세요.
				//길이가 11 이상인 문자열은 "아이디는 10글자 이하로 작성해주세요." 출력
				System.out.print("String input ");
				String st = s.next();
				System.out.println(st.length());
				
				//8. 크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후,
				//배열에서 가장 큰 값을 작성하세요.
				
				//9. 크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후,
				//배열의 모든 요소의 평균과 합산을 출력하는 프로그램을 작성하세요.
				
				//10. 문자열 "Java Programming" 에서 'a' 의 개수를 세는 코드를 작성하세요.
				
				//11. 아메리카노 한잔에 5500원, money 가 변수로 주어질 때,
				//최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 출력하세요.
				
				//12. 길동이보다 키 큰 사람 수
				//int[] array = {149, 180, 192, 170};   int height = 167;
		
	}

}
