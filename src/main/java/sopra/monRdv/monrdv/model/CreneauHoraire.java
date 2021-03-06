package sopra.monRdv.monrdv.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class CreneauHoraire {

	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id; 
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version; 
	@Temporal(TemporalType.TIMESTAMP)
	@JsonView(Views.ViewCommon.class)
	private Date dtDebut;
	
	@ManyToOne
	@JoinColumn(name = "rdv_id")
	@JsonView(Views.ViewCreneauHoraire.class)
	private RendezVous rdv;
	
	@ManyToOne
	@JoinColumn(name = "praticien_id")
	@JsonView(Views.ViewCreneauHoraire.class)
	private Praticien praticien;
	
	@ManyToOne
	@JoinColumn(name = "lieu_id")
	@JsonView(Views.ViewCreneauHoraire.class)
	private LieuDeConsultation lieu;

	
	public CreneauHoraire() {
		super();
	}

	


	public CreneauHoraire( Date dtDebut) {
		super();
		this.dtDebut = dtDebut;
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




	public RendezVous getRdv() {
		return rdv;
	}




	public void setRdv(RendezVous rdv) {
		this.rdv = rdv;
	}




	public Praticien getPraticien() {
		return praticien;
	}




	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}




	public LieuDeConsultation getLieu() {
		return lieu;
	}




	public void setLieu(LieuDeConsultation lieu) {
		this.lieu = lieu;
	}


	
			
}
