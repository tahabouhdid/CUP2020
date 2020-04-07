import java.util.Scanner;

public class Login {
	private Autenticazione accesso;
	private Medici m;
	private Pazienti p;
	
	public void login(Medici m, Pazienti p){
		Scanner input = new Scanner(System.in);
		
		//gestisco tutto con un semplice controllo
		System.out.println("Inserisci l'ID: ");
		accesso.setId(input.nextLine());
		System.out.println("Inserisci la password: ");
		accesso.setPassword(input.nextLine());
		
		if(accesso.getId() == m.getUsername())
		{
			System.out.println("Inserisca la password: ");
			if(accesso.getPassword() == m.getPassword)
			{
				/*System.out.println("-ACCESSO EFFETTUATO-");
				System.out.println("1. Gestisci prenotazioni");
				System.out.println("2. Visualizza lista pazienti");
				System.out.println("3. Visualizza prenotazioni");*/ //da integrare con le attività del team
			}
		}
		
		if(accesso.getId()==p.getUsername) {
			if(accesso.getId() == p.getUsername())
			{
				System.out.println("Inserisca la password: ");
				if(accesso.getPassword() == p.getPassword)
				{
					/*System.out.println("-ACCESSO EFFETTUATO-");
					System.out.println("1. Gestisci prenotazioni");
					System.out.println("2. Visualizza appuntamenti");
					System.out.println("3. Visualizza medici disponibili");*/ //da integrare con le attività del team
				}
			}
		}
	}
}
