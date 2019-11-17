package Odev21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odev21 {
	
	
	public static int calculateEntry(String str) {

		char[] ch = new char[str.length()];

		int count = 0;

		ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ',') {
				count++;
			}
		}
		return count;
	}
	
	public static String[] asd(String str, String[] arry) {
		
		int count=0,k=0;
		
		char[] ch1=str.toCharArray();
		
		for (int i = 0; i < ch1.length; i++) {
			if(ch1[i]==',') {
				char[] ch = new char[count];
				for (int j = 0; j < ch.length; j++) {
					ch[j]=ch1[i-count];
					count--;
				}
				arry[k]=String.valueOf(ch);
				k++;
			}
			else {
				count++;
			}
		}
		
		
		return arry;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input, results;

		int QPiece, inputPiece;
		
		String inputString;
		
		System.out.println("Results :: ");
		results = scan.nextLine();
		
		System.out.println("Ýnput String :: ");
		inputString = scan.nextLine();

		System.out.println("input giriniz :: ");
		input = scan.nextLine();

		System.out.println("Q sayisini giriniz :: ");
		QPiece = scan.nextInt();
		


		inputPiece= calculateEntry(input);
		
		
		int[][] Qs = new int[QPiece][inputPiece+1];
		
		for (int i = 0; i < QPiece; i++) {
			for (int j = 0; j < inputPiece; j++) {
				System.out.println("Q"+i+" "+ j+ " yol ne :: ");
				Qs[i][j] = scan.nextInt();
			}
			System.out.println("Q"+i+" degeri :: ");
			Qs[i][inputPiece] = scan.nextInt();
		}
		
		

		
		String[] inputD = new String[input.length()];
		inputD=asd(input,inputD);
		String[] resultsD = new String[results.length()];
		resultsD=asd(results,resultsD);
		String[] inputStringD = new String[inputString.length()];
		inputStringD=asd(inputString,inputStringD);
		
		
		
		Moore m1 = new Moore(QPiece,inputD,resultsD,Qs,inputStringD,inputString.length());
		
		
	}

}