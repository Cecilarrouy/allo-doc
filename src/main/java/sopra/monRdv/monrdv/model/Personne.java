package sopra.monRdv.monrdv.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

import sopra.monRdv.monrdv.model.*;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "disc", discriminatorType = DiscriminatorType.STRING, length = 15)
public abstract class Personne {
	
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id; 
	
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version; 
	
	@JsonView(Views.ViewCommon.class)
	private String nom; 
	
	@JsonView(Views.ViewCommon.class)
	private String prenom; 
	
	@JsonView(Views.ViewCommon.class)
	private String telephone;
	
	@Enumerated(EnumType.STRING)
	private Civilite civilite;	
	
	@Embedded
	@JsonView(Views.ViewCommon.class)
	private Adresse adresse; 
	
	@OneToOne
	@JoinColumn(name = "utilisateur_id")
	//@JsonView(Views.ViewCommon.class)
	private Utilisateur utilisateur; 

	
	public Personne() {
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", version=" + version + ", nom=" + nom + ", prenom=" + prenom + ", telephone="
				+ telephone + ", civilite=" + civilite + ", adresse=" + adresse + ", utilisateur=" + utilisateur + "]";
	} 
	
	

}
