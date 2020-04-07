
public class Medico {
	private String nome;
	private String cognome;
	private Paziente pazienti[];
	private boolean disponibilita;
	private String username;
	private String password;
	

	//costruttore di default 
	public Medico() {
		this.nome = null;
		this.cognome = null;
		this.disponibilita = false;
	}

	//getters and setters
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
	public Paziente[] getPazienti() {
		return pazienti;
	}
	public void setPazienti(Paziente[] pazienti) {
		this.pazienti = pazienti;
	}
	public boolean isDisponibilita() {
		return disponibilita;
	}
	public void setDisponibilita(boolean disponibilita) {
		this.disponibilita = disponibilita;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//costruttore
	public Medico(String nome, String cognome, Paziente[] pazienti, boolean disponibilita, String username,
			String password) {
		this.nome = nome;
		this.cognome = cognome;
		this.pazienti = pazienti;
		this.disponibilita = disponibilita;
		this.username = username;
		this.password = password;
	}
	
	
}