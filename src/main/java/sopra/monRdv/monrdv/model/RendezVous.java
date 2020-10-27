package sopra.monRdv.monrdv.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonView;

import sopra.monRdv.monrdv.model.Views;

@Entity
@Table
public class RendezVous {

	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version; 
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonView(Views.ViewCommon.class)
	private Date dtRendezVous;
	
	@JsonView(Views.ViewCommon.class)
	private String conclusion; 
	
	@Enumerated(EnumType.STRING)
	@JsonView(Views.ViewCommon.class)
	private Statut statut;
	
	@OneToOne (mappedBy = "patient_id")
	@JsonView(Views.ViewCommon.class)
	private Patient patient;
	
	@OneToOne (mappedBy = "praticien_id")
	@JsonView(Views.ViewCommon.class)
	private Praticien praticien; 
	
	@OneToOne (mappedBy = "motifsConsultations_id")
	@JsonView(Views.ViewCommon.class)
	private MotifsConsultations motifsConsultations; 
	
	@OneToOne (mappedBy = "creneauHoraire_id")
	@JsonView(Views.ViewCommon.class)
	private CreneauHoraire creneauHoraire; 

	
	public RendezVous() {
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

	public Date getDtRendezVous() {
		return dtRendezVous;
	}

	public void setDtRendezVous(Date dtRendezVous) {
		this.dtRendezVous = dtRendezVous;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

	public MotifsConsultations getMotifsConsultations() {
		return motifsConsultations;
	}

	public void setMotifsConsultations(MotifsConsultations motifsConsultations) {
		this.motifsConsultations = motifsConsultations;
	}

	public CreneauHoraire getCreneauHoraire() {
		return creneauHoraire;
	}

	public void setCreneauHoraire(CreneauHoraire creneauHoraire) {
		this.creneauHoraire = creneauHoraire;
	} 
			
}
