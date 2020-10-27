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
public class CreneauHoraire {

	@Id
	@GeneratedValue
	private Long id; 
	@Version
	private int version; 
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "startdate")
	private Date dtDebut;
	
	private List<RendezVous> rdvs = new ArrayList<RendezVous>(); 
	private List<Praticien> praticiens = new ArrayList<Praticien>(); 
	private List<LieuDeConsultation> lieux = new ArrayList<LieuDeConsultation>();

	
	public CreneauHoraire() {
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


	public Date getDtDebut() {
		return dtDebut;
	}


	public void setDtDebut(Date dtDebut) {
		this.dtDebut = dtDebut;
	}


	public List<RendezVous> getRdvs() {
		return rdvs;
	}


	public void setRdvs(List<RendezVous> rdvs) {
		this.rdvs = rdvs;
	}


	public List<Praticien> getPraticiens() {
		return praticiens;
	}


	public void setPraticiens(List<Praticien> praticiens) {
		this.praticiens = praticiens;
	}


	public List<LieuDeConsultation> getLieux() {
		return lieux;
	}


	public void setLieux(List<LieuDeConsultation> lieux) {
		this.lieux = lieux;
	}
			
}
