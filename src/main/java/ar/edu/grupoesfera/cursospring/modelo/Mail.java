package ar.edu.grupoesfera.cursospring.modelo;

public class Mail {

	private String nombreMail;
	private String asuntoMail;
	private String textoMail;
	private String emailMail;
	private String passwordMail;
	
	public Mail(){}
	
	//Getters y Setters
	public String getNombreMail() {
		return nombreMail;
	}

	public void setNombreMail(String nombreMail) {
		this.nombreMail = nombreMail;
	}

	public String getAsuntoMail() {
		return asuntoMail;
	}

	public void setAsuntoMail(String asuntoMail) {
		this.asuntoMail = asuntoMail;
	}

	public String getTextoMail() {
		return textoMail;
	}

	public void setTextoMail(String textoMail) {
		this.textoMail = textoMail;
	}

	public String getEmailMail() {
		return emailMail;
	}

	public void setEmailMail(String emailMail) {
		this.emailMail = emailMail;
	}

	public String getPasswordMail() {
		return passwordMail;
	}

	public void setPasswordMail(String passwordMail) {
		this.passwordMail = passwordMail;
	}
	
}
