package 끝말잇기0201;

import java.util.Scanner;

class player {
	String word;
	String array[] = new String[10];
}

class method {
	
	static void step3(String a, String b) {
		player user = new player();
		user.array[1] = a;
		user.array[2] = b;
		
		char c3, c4;
		c3 = user.array[1].charAt(user.array[1].length() - 1);
		c4 = user.array[2].charAt(0);
		
		if(c3 == c4) {
			System.out.println("success");
		} else {
			System.out.println("fail");
		}
	}
	
	static void step2() {
		Scanner s = new Scanner(System.in);
		player user1 = new player();
		player user2 = new player();
		
		System.out.print("first word ");
		user1.word = s.next();
		System.out.print("second word ");
		user2.word = s.next();
		
		char c1, c2;
		c1 = user1.word.charAt(user1.word.length() - 1);
		c2 = user2.word.charAt(0);
		
		if(c1 == c2) {
			System.out.println("success");
		} else {
			System.out.println("fail");
		}
		
		s.close();
	} //step2 done
	
	static void run(int sw) {
		Scanner s = new Scanner(System.in);
		
		if(sw == 1) {
			System.out.println("첫 번째 단어를 입력해주세요 ");
			String a = s.next();
			System.out.println("두 번째 단어를 입력해주세요 ");
			String b = s.next();
			
			step3(a, b);
		}
		else if(sw == 2) {
			step2();
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
		
		s.close();
	} //run done
} //method done


public class ClassAndStringArrayEx extends method{

	public static void main(String[] args) {
		System.out.println("StartProgram");
		System.out.println("selectProcess.");
		System.out.println("<1> step3  <2> step2");
		
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		run(a);
		s.close();

	}

}
