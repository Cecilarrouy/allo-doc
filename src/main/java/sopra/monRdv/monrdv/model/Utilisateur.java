package sopra.monRdv.monrdv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

import sopra.monRdv.monrdv.model.Views;

@Entity
@Table
public class Utilisateur {
	
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id; 
	
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version; 	
	
	@JsonView(Views.ViewCommon.class)
	private String identifiant; 
	
	@JsonView(Views.ViewCommon.class)
	private String motDePasse;
	
	@OneToOne(mappedBy = "utilisateur_id")
	@JsonView(Views.ViewCommon.class)
	private Personne personne; 
	
	
	public Utilisateur() {
		super();
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	} 
	
}
