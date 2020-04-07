import java.util.ArrayList;
import java.io.IOException;

public class Textfile {
	public static ArrayList <Pazienti> paziente = new ArrayList<Pazienti>();
	public void scriviFile(ArrayList paziente) { 

		String path = "",s; 
		try { 
			File file = new File(path); 
			FileWriter fw = new FileWriter(file); 

			for(int i=0; i<paziente.size(); i++) { 
				s = toString(); 

				fw.write(s); 
			} 

			fw.flush(); 

			fw.close(); 

		} catch (IOException e) { 

			System.err.println(e); 

		} 
		public void selezionePaziente() {
			System.out.println("Inserire l'ID di un paziente: ");
			Scanner kb= new Scanner(System.in);
			controllo=kb.nextInt();
			for(int i=0; i<num_MAX2; i++)
				if(controllo==pazienti[i].getID())
					System.out.println("Paziente: "+pazienti[i].getNome()+".");
}
		public void eliminaPaziente(int ID, String nome, String cognome) {
				studenti[i++]=null;
		}
	} 
			
	}
