package math;
import java.util.Random;
/**
 * <문제>
 * 3개 반의 학생의 몸무게를 측정하였다.
 * - 각 반의 학생의 수는 30명이다.
 * - 각 반의 학생 몸무게의 최대, 최소값을 구하시오.
 * 단, 몸무게 40 ~ 100 사이에서만 랜덤으로 생성시키시오.
 * */

public class MaxMin {
	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[30];
		int max = 40, min = 100;
		
		
		for (int i=0; i<a.length; i++) {
			a[i] = random.nextInt(61)+40;
			
			System.out.println(a[i]);
			if(a[i]>max) {
				max = a[i];
			} 
			if(a[i]<min) {
				min = a[i];
			}
		}
		
		System.out.printf("최대 몸무게 %d \n최소 몸무게 %d \n",max,min);
		
	}
}
