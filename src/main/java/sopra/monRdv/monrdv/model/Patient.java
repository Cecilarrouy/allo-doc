package sopra.monRdv.monrdv.model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@DiscriminatorValue("Patient")
public class Patient extends Personne {
	
	private String numeroSS; 
	private String email; 
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dtNaissance;
	
	private ArrayList<RendezVous> rdvs = new ArrayList<RendezVous>(); 

	
	public Patient() {
		super();
	}

	
	public String getNumeroSS() {
		return numeroSS;
	}

	public void setNumeroSS(String numeroSS) {
		this.numeroSS = numeroSS;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtNaissance() {
		return dtNaissance;
	}

	public void setDtNaissance(Date dtNaissance) {
		this.dtNaissance = dtNaissance;
	}

	public ArrayList<RendezVous> getRdvs() {
		return rdvs;
	}

	public void setRdvs(ArrayList<RendezVous> rdvs) {
		this.rdvs = rdvs;
	} 
	
	
	
}
