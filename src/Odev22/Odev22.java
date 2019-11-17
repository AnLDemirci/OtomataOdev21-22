package Odev22;

import java.util.Scanner;

public class Odev22 {

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
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int qSayisi, inputSayisi;
		String input;
		
		System.out.print("Ýnput :: ");
		input=scan.nextLine();
		
		System.out.print("Qsayisi :: ");
		qSayisi=scan.nextInt();
		
		inputSayisi=calculateEntry(input);
		
		
		int[][] q= new int [qSayisi][inputSayisi];
		
		
		for(int i=0;i<qSayisi;i++) {
			for (int j = 0; j < inputSayisi; j++) {
				System.out.println("q"+i+" in "+j+". yolunun sonucu ::");
				q[i][j]=scan.nextInt();
			}
		}
		scan.nextLine();
		String inputText;
		System.out.print("Ýnput Text :: ");
		inputText=scan.nextLine();
		
		char[] ch= inputText.toCharArray();
		
		int n,k=0;
		for (int i = 0; i < ch.length; i++) {
			n=Integer.valueOf(ch[i])-48;
			//System.out.println("n=>"+n);
			if(n<inputSayisi) {
				k=q[k][n];
				System.out.println("Q"+k);
			}
		}
	}
}
