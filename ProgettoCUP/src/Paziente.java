public class Paziente {
	//attributi
	private String id;
	private String nomeP;
	private String cognomeP; 
	
	//getters and setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomeP() {
		return nomeP;
	}
	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}
	public String getCognomeP() {
		return cognomeP;
	}
	public void setCognomeP(String cognomeP) {
		this.cognomeP = cognomeP;
	}
	
	//constructor
	public Paziente(String id, String username, String password, String nomeP, String cognomeP) {
		this.id = id;
		this.nomeP = nomeP;
		this.cognomeP = cognomeP;
	}
}