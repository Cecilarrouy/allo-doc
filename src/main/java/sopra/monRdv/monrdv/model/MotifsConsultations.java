package sopra.monRdv.monrdv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class MotifsConsultations {

	@Id
	@GeneratedValue
	private Long id; 
	@Version
	private int version; 
	@JsonView(Views.ViewCommon.class)
	private String nom; 
	@JsonView(Views.ViewCommon.class)
	private int nombreCreneau; 
	@JsonView(Views.ViewCommon.class)
	private String tarif;
	
	@ManyToOne
	@JsonView(Views.ViewCommon.class)
	private Praticien praticien; 
	@OneToOne
	@JsonView(Views.ViewCommon.class)
	private RendezVous rendezVous; 

	
	public MotifsConsultations() {
		super();
	}
	
	

	public MotifsConsultations(Long id, int version, String nom, int nombreCreneau, String tarif, Praticien praticien,
			RendezVous rendezVous) {
		super();
		this.id = id;
		this.version = version;
		this.nom = nom;
		this.nombreCreneau = nombreCreneau;
		this.tarif = tarif;
		this.praticien = praticien;
		this.rendezVous = rendezVous;
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

	public int getNombreCreneau() {
		return nombreCreneau;
	}

	public void setNombreCreneau(int nombreCreneau) {
		this.nombreCreneau = nombreCreneau;
	}

	public String getTarif() {
		return tarif;
	}

	public void setTarif(String tarif) {
		this.tarif = tarif;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

	public RendezVous getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(RendezVous rendezVous) {
		this.rendezVous = rendezVous;
	} 
			
}
