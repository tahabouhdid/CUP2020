import java.util.Scanner;

public class Pazienti {
	//attributi
	private Paziente p[];
	//getters and setters
	public Paziente[] getP() {
		return p;
	}
	public void setP(Paziente[] p) {
		this.p = p;
	}
	//costruttore
	public Pazienti(Paziente[] p) {
		this.p = p;
	}
	public Pazienti(){
		
	}

	public void addPaziente(){
		Scanner input = new Scanner(System.in);
	
		System.out.println("Quanti pazienti vuoi inserire?");
		int i= input.nextInt();
	
		//for(int n=0; n<i; n++) {
			System.out.println("Nome: ");
			p[i].setNomeP("Marco");
			System.out.println("Cognome: ");
			p[i].setCognomeP("Rossi");
			System.out.println("ID: ");
			p[i].setId("MR2020");
		//}
		//input.close();
	}
}