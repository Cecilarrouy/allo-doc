package sopra.monRdv.monrdv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@DiscriminatorValue("Patient")
public class Patient extends Personne {
	
	@JsonView(Views.ViewCommon.class)
	private String numeroSS; 
	@JsonView(Views.ViewCommon.class)
	private String email; 
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dtNaissance;
	@OneToMany(mappedBy = "patient")
	private List<RendezVous> rdvs = new ArrayList<RendezVous>(); 

	
	public Patient() {
		super();
	}
	
	
	public Patient(String numeroSS, String email, Date dtNaissance, ArrayList<RendezVous> rdvs) {
		super();
		this.numeroSS = numeroSS;
		this.email = email;
		this.dtNaissance = dtNaissance;
		this.rdvs = rdvs;
	}



	public List<RendezVous> getRdvs() {
		return rdvs;
	}


	public void setRdvs(List<RendezVous> rdvs) {
		this.rdvs = rdvs;
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


	
	
}
