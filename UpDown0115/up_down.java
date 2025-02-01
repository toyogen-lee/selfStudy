package UpDown0115;

import java.util.Random;
import java.util.Scanner;

public class up_down {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int time = 10;
		
		while (true) {
			
			System.out.println("====UpDownGame====");
			System.out.println("[1]스타트 [2]스코어 [3]엔드게임");
			System.out.print("> ");
			int select = s.nextInt();
			
			int newTime;
			switch (select) {
			case 1:
				newTime = 0;
				
				int comnum = r.nextInt(99) + 1;
				while (true) {
					
					System.out.print((newTime + 1) + "회차 번호 입력 : ");
					int pernum = s.nextInt();
					
					if (pernum < 1 || pernum > 100) {
						System.out.println("입력값을 확인하세요.");
						continue;
					} else if (comnum > pernum) {
						System.out.println("Up");
						newTime++;
						continue;
					} else if (comnum < pernum) {
						System.out.println("Down");
						newTime++;
						continue;
					} else if (comnum == pernum) {
						System.out.println("정답");
						newTime++;
					}
					if (newTime < time) {
						time = newTime;
					}
					break;
				}
				break; //case1 done
				
			case 2:
				if (time == 10) {
					System.out.println("아직 최고 기록이 없습니다.");
				} else {
					System.out.println("현재 최고 기록은 " + time + "회 입니다.");
					break;
				} //case2 done
				
			case 3:
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			} //switch done
			
			if (select == 3) {
				System.out.println("게임 종료");
				break;
			}
		} //while done
	}

}
