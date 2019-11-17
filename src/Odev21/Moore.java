package Odev21;

public class Moore {

	private static String input[];
	private static String results[];
	private static int Qs[][];
	private static  String inputString[];
	private static int n3;

	private static int qPiece;

	public Moore(int qPiece, String[] input, String[] results, int[][] Qs, String[] inputString,int n3) {
		this.qPiece = qPiece;
		this.input = input;
		this.results = results;
		this.Qs = Qs;
		this.inputString = inputString;
		this.n3=n3;
		asd();
	}

	public void asd() {
		
		
		int n;
		
		Q[] q= new Q[qPiece];
		
		for (int i = 0; i < q.length; i++) {
			n=qPiece;
			Q q1 = new Q(Integer.valueOf(Qs[i][n]),input.length);
			q1.setWay(Qs[i]);
			
			q[i]=q1;
		}
		
		int j=0,n1;
		
		for (int i = 0; i < n3; i++) {
			System.out.print(q[j].getValues()+"    ");
			
			for(n1=0;n1<input.length;n1++) {
				if(inputString[i].equals(input[n1])) {
					break;
				}
			}
			j=q[j].getWayValues(n1);
			
			if(j==-1) {
				break;
			}
		}
	}
}
