package Geometric;
/**
 * 1 = 1
 * 2 = 2 * 1   = 2
 * 3 = 3 * 2 * 1    =  6
 * 4 = 4 * 3 * 2 * 1  = 24
 * 10항까지의 시리즈는 4037913 이다. 
 * */
public class Factorial4037913 {
	public static void main(String[] args) {
		int S = 1;
		int F = 1;
		int N = 1;
		
		while(true) {
			N++;
			// 문제
			F *= N;
			//System.out.printf("F is : %d \n", F);
			S = S + F;
			if(N==10) {
				break;
			}
		}
		System.out.printf("S is : %d", S);
	//	System.out.printf("S is %d ", S); //4037913
	}
}
