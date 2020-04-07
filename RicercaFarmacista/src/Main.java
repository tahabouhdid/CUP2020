
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmacista prova=new Farmacista();
		prova.aggiuntaprova("Marco", "Rossi", "MR12345", "Assumere farmaco x ogni 3 giorni.");
		prova.aggiuntaprova("Stefano", "Verdi", "SV12345", "Assumere farmaco y ogni 6 ore.");
		prova.aggiuntaprova("Sara", "Neri", "SN12345", "Paziente sano, non assumere farmaci.");
		prova.ricerca();
	}

}
