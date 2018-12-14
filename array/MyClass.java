package array;

import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		String[] res = {};
		
		
		String[] class1 = new String[20];
		String[] vivace = {"은지","지우","창준","현일","서우"};
		String[] royal = {"창하","수호","은영","정욱",""};
		String[] atlas = {"동준","종혁","이레","지은",""};
		String[] nm = {"정우","기호","태혁","승하",""};

	
		
		for(int i=0; i<res.length; i++) {
			res[i] = vivace[vivace.length];
			res[i] = royal[royal.length];
			res[i] = atlas[atlas.length];
			res[i] = nm[nm.length];
			System.out.println(res[i]);
		}
/*		for(int i=0; i<res.length; i++) {
			res[i] = vivace[0];
			res[i] = royal[0];
			res[i] = atlas[0];
			res[i] = nm[0];
			
			System.out.print(res[i]+"\t");
		}
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("팀명을 입력하세요.");
//		String team = scanner.next();
		
	/*	switch(team) {
		case "vivace" : res = vivace; break;
		case "royal" : res = royal; break;
		case "atlas" : res = atlas; break;
		case "nm" : res = nm; break;
		} */
		
		
/*		for(int i=0; i<res.length;i++) {
			res[i] = vivace[0];
			res[i] = royal[0];
			res[i] = atlas[0];
			res[i] = nm[0];
			System.out.print(res[i]+"\t");
		}
		

		*/
	}
}
