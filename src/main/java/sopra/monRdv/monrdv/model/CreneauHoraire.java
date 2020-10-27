package sopra.monRdv.monrdv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "creneau")
public class CreneauHoraire {

	@Id
	@GeneratedValue
	private Long id; 
	@Version
	private int version; 
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "startdate")
	private Date dtDebut;
	
	private List<RendezVous> rendezVouss = new ArrayList<RendezVous>(); 
	private List<Praticien> praticiens = new ArrayList<Praticien>(); 
	private List<LieuDeConsultation> lieuDeConsultations = new ArrayList<LieuDeConsultation>();

	
	public CreneauHoraire() {
		super();
	}

	
	public List<RendezVous> getrendezVouss() {
		return rendezVouss;
	}

	public void setRendezVous(List<RendezVous> rendezVouss) {
		this.rendezVouss = rendezVouss;
	}

	public void addRendezVous(RendezVous rendezVous) {
		this.rendezVouss.add(rendezVous);
	}
	
	public List<Praticien> getpraticiens() {
		return praticiens;
	}

	public void setPraticien(List<Praticien> praticiens) {
		this.praticiens = praticiens;
	}

	public void addPraticien(Praticien praticien) {
		this.praticiens.add(praticien);
	}
	
	public List<LieuDeConsultation> getlieuDeConsultations() {
		return lieuDeConsultations;
	}

	public void setLieuDeConsultation(List<LieuDeConsultation> lieuDeConsultations) {
		this.lieuDeConsultations = lieuDeConsultations;
	}

	public void addLieuDeConsultation(LieuDeConsultation lieuDeConsultation) {
		this.lieuDeConsultations.add(lieuDeConsultation);
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

	public Date getDtDebut() {
		return dtDebut;
	}

	public void setDtDebut(Date dtDebut) {
		this.dtDebut = dtDebut;
	}

	public RendezVous getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(RendezVous rendezVous) {
		this.rendezVous = rendezVous;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	} 
			
}
