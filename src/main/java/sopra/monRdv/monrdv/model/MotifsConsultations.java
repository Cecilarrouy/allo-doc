package sopra.monRdv.monrdv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class MotifsConsultations {

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
	private int nombreCreneau; 
	@JsonView(Views.ViewCommon.class)
	private String tarif;
	
	@ManyToOne
	@JoinColumn(name = "praticien_id")
	@JsonView(Views.ViewMotifsConsultations.class)
	private Praticien praticien; 
	
	@OneToOne (mappedBy = "motifsConsultations")
	@JsonView(Views.ViewMotifsConsultations.class)
	private RendezVous rendezVous; 

	
	public MotifsConsultations() {
		super();
	}
	
	

	public MotifsConsultations( String nom, int nombreCreneau, String tarif) {
		super();
	
		this.nom = nom;
		this.nombreCreneau = nombreCreneau;
		this.tarif = tarif;
	
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
