package sopra.monRdv.monrdv.model;

import java.util.Date;

public class RendezVous {

	private Long id; 
	private int version; 
	private Date dtRendezVous; 
	private String conclusion; 
	private Statut statut;
	
	private Patient patient;
	private Praticien praticien; 
	private MotifsConsultations motifsConsultations; 
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
