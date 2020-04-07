
public class Pazienteprova {
	private String nome;
	private String cognome;
	private String codicefiscale;
	private String pianoterapeutico;
	
	public Pazienteprova(String nome, String cognome, String codicefiscale, String pianoterapeutico) {
		this.nome=nome;
		this.cognome=cognome;
		this.codicefiscale=codicefiscale;
		this.pianoterapeutico=pianoterapeutico;
	}
	
	public Pazienteprova() {
		nome=null;
		cognome=null;
		codicefiscale=null;
		pianoterapeutico=null;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCodicefiscale() {
		return codicefiscale;
	}
	public void setCodicefiscale(String codicefiscale) {
		this.codicefiscale = codicefiscale;
	}
	public String getPianoterapeutico() {
		return pianoterapeutico;
	}
	public void setPianoterapeutico(String pianoterapeutico) {
		this.pianoterapeutico = pianoterapeutico;
	}
}
