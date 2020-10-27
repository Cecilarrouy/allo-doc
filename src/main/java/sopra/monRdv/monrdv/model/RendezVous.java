package sopra.monRdv.monrdv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonView;

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
	
	@ManyToOne
	@JoinColumn(name="patient_id")
	@JsonView(Views.ViewRendezVousDetail.class)
	private List<Patient> patients = new ArrayList<Patient>();
	
	@OneToOne (mappedBy = "praticien_id")
	@JsonView(Views.ViewCommon.class)
	private Praticien praticien; 
	
	@OneToOne (mappedBy = "motifsConsultations_id")
	@JsonView(Views.ViewCommon.class)
	private MotifsConsultations motifsConsultations; 
	
	@OneToMany(mappedBy = "rendezVous")
	@JsonView(Views.ViewRendezVousDetail.class)
	private List<CreneauHoraire> creneaux = new ArrayList<CreneauHoraire>();
	
	public RendezVous() {
		super();
	}
	

	public List<CreneauHoraire> getCreneaux() {
		return creneaux;
	}


	public void setCreneaux(List<CreneauHoraire> creneaux) {
		this.creneaux = creneaux;
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

	
}
