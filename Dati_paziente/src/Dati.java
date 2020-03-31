
public class Dati {
	//attributi
	private String Nome;
	private String Cognome;
	private String ID;
	private String Username;
	private String Ruolo;
	private String Password;

	//costruttore
	public Dati (String Nome, String Cognome, String ID, String Username, String Ruolo, String Password) {
		
		this.Nome=Nome;
		this.Cognome=Cognome;
		this.ID=ID;
		this.Username=Username;
		this.Ruolo=Ruolo;
		this.Password=Password;
	}
	
	//get e set
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getRuolo() {
		return Ruolo;
	}

	public void setRuolo(String ruolo) {
		Ruolo = ruolo;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}    
	
}
