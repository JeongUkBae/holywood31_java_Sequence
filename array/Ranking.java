package array;

import java.util.Random;
import java.util.Scanner;

public class Ranking {
	public static void main(String[] args) {
		String[] res = {};
		Random random = new Random();
		int[][] scores = new int [4][5];
	//	int[][] scores = {r};
		
		String[] vivace = {"은지","지우","창준","현일","서우"};
		String[] royal = {"창하","수호","은영","정욱",""};
		String[] atlas = {"동준","종혁","이레","지은",""};
		String[] nm = {"정우","기호","태혁","승하",""};

		String[][] teams = {vivace,royal,atlas,nm};
		String[][] tt = new String[4][5];
		/*		System.out.println("팀명을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String teamname = scanner.next();
		
		String[][][] select = {};
		switch(teamname) {
			case "vivace" : select = vivace; break;
			case "royal" : select = royal; break;
			case "atlas" : select = atlas; break;
			case "nm" : select = nm; break;
		}*/
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
			scores[i][j] = random.nextInt(40)+60;
			tt[i][j] = teams[i][j];
				System.out.printf(" %s - %d ,\n",teams[i][j],scores[i][j]);
			}
			System.out.printf("");
		}
		
		
/*		for(int i=0; i<teams.length; i++) {
			for(int j=0; j<scores.length; j++) {
				System.out.printf("%s %s \n",teams[i][j],scores[i][j]);
			}
		}
//		System.out.printf(teams[0][1], scores[2][1]);
		
		
		
	//	for(int i=0; i<5; i++) {
/*			for(int j=0; j<5; j++) {
			scores[i][j] = random.nextInt(100);
			System.out.println(scores[i][j]+"");
			}*/
		//	System.out.println(r[i]);
		//	}  
		
/*		System.out.printf("%s \n의 1등: %s | %s"
				+ "\n2등 : %s | %s"
				+ "\n3등 : %s | %s"
				+ "\n4등 : %s | %s");
	*/	
		
		
	}
}
