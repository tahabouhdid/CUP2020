import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	
	public Main(String[] args) throws Exception {
		
		String Nome;
		String Cognome;
		String Email;
		String Password;
		
	Scanner a = new Scanner(System.in);
	BufferedWriter out = new BufferedWriter( new FileWriter("Autenticazione.txt", true) );

	System.out.print("Inserisci il Nome: ");
	Nome = a.nextLine();
	System.out.print("Inserisci il Cognome: ");
	Cognome = a.nextLine();
	System.out.print("Inserisci l'Email: ");
	Email = a.nextLine();
	System.out.print("Inserisci la Password: ");
	Password = a.nextLine();
	
	a.nextLine();
	
	try{
		out.write(Nome + ";" + Cognome + ";" + ";" + Email + ";" + Password + ";");
		out.newLine();
		
	}catch (Exception e){
		System.out.println("Errore");
	}
	
	out.close();
	a.close();
}
	
}

