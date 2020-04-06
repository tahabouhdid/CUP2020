	//attributi
	public class Autenticazione_medico {
		private String Nome;
		private String Cognome;
		private String Email;
		private String Password;
		
		//costruttore
		public Autenticazione_medico (String Nome, String Cognome, String Email, String Password) {
			this.Nome = Nome;
			this.Cognome = Cognome;
			this.Email = Email;
			this.Password=Password;
		}
		
		//costruttore di copia
		public Autenticazione_medico () {
			Nome = null;
			Cognome = null;
			Email = null;
			Password = null;
		}

		//set e get
		public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			this.Nome = nome;
		}

		public String getCognome() {
			return Cognome;
		}

		public void setCognome(String cognome) {
			this.Cognome = cognome;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			this.Email = email;
		}

		public String getPassword() {
			return Password;
		}

		public void setPassword(String password) {
			this.Password = password;
		}
		
		/*public void autenticazione (String Email, String Password) {
			if (Email==this.Email && Password == this.Password)
				System.out.println("Accesso eseguito");
			else
				System.out.println("La tua email o password non corrispondono");
		}*/
		
}
