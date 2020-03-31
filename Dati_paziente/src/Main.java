import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	
	public Main(String[] args) throws Exception {
		
		String Nome;
		String Cognome;
		String ID;
		String Username;
		String Ruolo;
		String Password;
		
	Scanner a = new Scanner(System.in);
	BufferedWriter out = new BufferedWriter( new FileWriter("paziente.txt", true) );

	System.out.print("Inserisci il Nome: ");
	Nome = a.nextLine();
	System.out.print("Inserisci il Cognome: ");
	Cognome = a.nextLine();
	System.out.print("Inserisci l'ID: ");
	ID = a.nextLine();
	System.out.print("Inserisci l'Username: ");
	Username = a.nextLine();
	System.out.print("Inserisci il Ruolo: ");
	Ruolo = a.nextLine();
	System.out.print("Inserisci la Password: ");
	Password = a.nextLine();
	
	a.nextLine();
	
	try{
		out.write(Nome + ";" + Cognome + ";" + ID + ";" + Username + ";" + Ruolo + ";" + Password + ";");
		out.newLine();
		
	}catch (Exception e){
		System.out.println("Valore non corretto. Reinseriscilo ");
	}
	
	out.close();
	a.close();
}
	
}

