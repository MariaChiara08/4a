/**
 * 
 * @author MariaChiara
 * @version 4.0
 *
 */
public class Fattoriale {

	/**
	 * costruttoree
	 */
	public Fattoriale() {
		
	}
	
	public int fattoriale(int n) {
		int fatt=1;
		for(int i=1;i<n;i++) { 
			fatt=fatt*i;
		}
		return fatt;
	}
	
	public static void main(String[] args) {

		Fattoriale f=new Fattoriale();		
		System.out.println(f.fattoriale(4));
		
	}
	
}
