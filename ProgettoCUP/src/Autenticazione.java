public class Autenticazione {
	private String nome;
	private String cognome;
	private String id;
	private String password;
	
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Autenticazione(String nome, String cognome, String id, String password) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.id = id;
		this.password = password;
	}
}
