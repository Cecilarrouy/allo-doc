package sopra.monRdv.monrdv.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class LieuDeConsultation {

	@Id
	@GeneratedValue
	private Long id; 
	@Version
	private int version; 
	@JsonView(Views.ViewCommon.class)
	private String nom;
	@Embedded
	@JsonView(Views.ViewCommon.class)
	private Adresse adresse; 
	
	@OneToMany(mappedBy = "lieu")
	@JsonView(Views.ViewLieuDeConsultation.class)
	private List<CreneauHoraire> creneaux = new ArrayList<CreneauHoraire>(); 



	
	public LieuDeConsultation() {
		super();
	}
	
	
	
	public LieuDeConsultation(Long id, int version, String nom, Adresse adresse) {
		super();
		this.id = id;
		this.version = version;
		this.nom = nom;
		this.adresse = adresse;
		
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
