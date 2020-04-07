import java.util.Scanner;

public class Farmacista {
	private Scanner scan = new Scanner(System.in);
	private String nome;
	private static final int MAX=10;
	private Pazienteprova lista[];
	private int i=0;
	
	public Farmacista() {
		lista=new Pazienteprova[MAX];
	}
	
	public void aggiuntaprova(String nome,String cognome,String codicefiscale,String pianoterapeutico)
	{	
		lista[i]=new Pazienteprova(nome,cognome,codicefiscale,pianoterapeutico);
		i++;
	}
	
	public void ricerca()
	{
		System.out.println("Inserire il codice fiscale del paziente che si desidera ricercare: ");
		String codicefiscale=scan.next();
		for(int i=0;i<MAX;i++)
		{
			if(codicefiscale==lista[i].getCodicefiscale()){
				System.out.println("Il paziente "+lista[i].getNome()+" "+lista[i].getCognome()+" è stato trovato e necessita del seguente piano terapeutico: "+lista[i].getPianoterapeutico());
			}
			else if(codicefiscale!=lista[i].getCodicefiscale()){
				System.out.println("Il codice "+codicefiscale+" digitato non è stato trovato.");
			}
		}
	
}
}
