import java.util.Scanner;

public class Medici {
	//attributi
	private Medico m[];
	//getters and setters
	public Medico[] getM() {
		return m;
	}
	public void setM(Medico[] m) {
		this.m = m;
	}
	//costruttore
	public Medici(Medico[] m) {
		this.m = m;
	}
	public Medici() {
		
	}
	
	public void addMedico() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quanti medici vuoi inserire?");
		int i= input.nextInt();
		
		for(int n=0; n<i; i++){
			System.out.println("Nome: ");
			m[i].setNome(input.nextLine());
			System.out.println("Cognome: ");
			m[i].setCognome(input.nextLine());
		}
		input.close();
	}
	
}
