package math;

import java.util.Scanner;

/**
 *  합성수를 소수의 곱으로 나타내는 방법을 말한다.
 *  20=2×2×5
 * */
public class Factorization {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("소인수분해할 수를 입력하세요.");
		int target = scanner.nextInt();
		int count = 0; 
		int a = 2;
		
		int[] res = new int[count];  // 동적으로 생성함 
		
		// 다이나믹 : 동적
		// 스태틱 : 정적
		//int b = 3;
		//int c = a % b;
		//int[] d = new int[b];
		
		
		if(target <2) {
			return; // 유효성체크
		 
		while(true) {
			if(target%a==0) {
				
			} else {
				a++;
			}
			
		}
		
		System.out.println(res[i]);
		}
		
		//System.out.println(res[i]+"");
		
	}
}
