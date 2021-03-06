package sopra.monRdv.monrdv.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class LieuDeConsultation {

	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id; 
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version; 
	@JsonView(Views.ViewCommon.class)
	private String nom;
	@Embedded
	@JsonView(Views.ViewCommon.class)
	private Adresse adresse; 
	
	@OneToMany(mappedBy = "lieu")
	@JsonView(Views.ViewLieuDeConsultation.class)
	private List<CreneauHoraire> creneaux = new ArrayList<CreneauHoraire>(); 
	
	@ManyToOne
	@JoinColumn(name = "praticien_id")
	@JsonView(Views.ViewLieuDeConsultation.class)
	private Praticien praticien;



	
	public Praticien getPraticien() {
		return praticien;
	}



	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}



	public LieuDeConsultation() {
		super();
	}
	
	
	
	public LieuDeConsultation(String nom) {
		super();
		this.nom = nom;
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


	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}



	
}
