package math;

import java.util.Scanner;

/**
 * 정수들의 공약수(公約數, 영어: common divisor)는 동시에 그들 모두의 약수인 정수다. 
 * 적어도 하나가 0이 아닌 정수들의 
 * 최대공약수(最大公約數, 문화어: 련속나눔셈; 영어: greatest common divisor, 약자 GCD)는 
 * 공약수 가운데 가장 큰 하나다. 
 * 12, 18
 * --> 6 
 * 
 * 배수(公倍數)란 두 개 이상의 자연수의 공통인 배수를 말한다. 
 * 예를 들어 3과 4의 공배수는 3의 배수이기도 하고 4의 배수이기도 한 수이다. 
 * 두 수의 공배수 중에서 가장 작은 수를 최소공배수
 * Least Common Multi => LCM
 * */
public class CommonMulti {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("최대 공약수와 최소 공배수를 구할 두 수 를 입력하세요.");
		int num1 = 12,
				num2 = 18,
				lcm = 0,
				gcd = 0,
				mok = 0,
				nmg = 0,
				big = 0,
				small = 0;
			
		if(num1>num2) {
			big = num1;
			small = num2;
		} else {
			big = num2;
			small = num1;
		}
	//	mok = big / small;
//		System.out.println("목은 :"+mok);
		nmg = big % small;
		System.out.println("나머지는:"+nmg);
		
		while(nmg != 0) {
			if(nmg < small) {
		/* 6*/	mok = nmg;
		//		System.out.println(mok);
		/* 12*/	nmg = small;
//				System.out.println(nmg);
		/* 6*/	small = mok;
//				System.out.println(small);
			}    //12  % 6
			nmg = nmg % small;
//			System.out.println("나머지2"+nmg);
		}
		gcd = small;   //<- 최대공약수 
		lcm = (num1*num2)/gcd;    // lcm = (12 * 18)/ 6 <- 최소공배수
		System.out.printf("%d , %d ::: 최소 공배수: %d &최대공약수: %d 이다",num1,num2,lcm,gcd);
		
	}
}
