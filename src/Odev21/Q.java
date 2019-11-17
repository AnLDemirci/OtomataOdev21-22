package Odev21;

public class Q {

	private int Qvalues ;
	private int piece;
	private int[] way= new int[piece];
	
	public Q(int Qvalues, int piece) {
		this.Qvalues = Qvalues;
		this.piece = piece;
	}
	
	public int getValues() {
		return Qvalues;
	}
	
	public void setWay(int str[]) {
		way=str;
	}
	
	public int getWayValues(int a) {
		if(a<piece) {
			return way[a];
		}
		return -1;
	}	
}