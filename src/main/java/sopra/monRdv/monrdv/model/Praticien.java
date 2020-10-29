package sopra.monRdv.monrdv.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonView;

import sopra.monRdv.monrdv.model.*;

@Entity
@DiscriminatorValue("Praticien")
public class Praticien extends Personne {
	
	@JsonView(Views.ViewCommon.class)
	private int numActivite; 
	
	@JsonView(Views.ViewCommon.class)
	private String specialitePrincipale; 
	
	@JsonView(Views.ViewCommon.class)
	private String specialiteSecondaire;
	
	@JsonView(Views.ViewCommon.class)
	private String email;
	
	@OneToMany(mappedBy = "praticien")
	@JsonView(Views.ViewPraticien.class)
	private List<MotifsConsultations> motifs = new ArrayList <MotifsConsultations>();
	
	@OneToMany(mappedBy = "praticien")
	@JsonView(Views.ViewPraticien.class)
	private List<RendezVous> rdvs = new ArrayList<RendezVous>(); 
	
	@OneToMany(mappedBy = "praticien")
	@JsonView(Views.ViewPraticien.class)
	private List<CreneauHoraire> creneaux = new ArrayList<CreneauHoraire>(); 
	
	@OneToMany(mappedBy = "praticien")
	@JsonView(Views.ViewPraticien.class)
	private List<LieuDeConsultation> lieuDeConsultation = new ArrayList<LieuDeConsultation>(); 

	
	public Praticien() {
		super();
	}


	public int getNumActivite() {
		return numActivite;
	}

	public void setNumActivite(int numActivite) {
		this.numActivite = numActivite;
	}

	public String getSpecialitePrincipale() {
		return specialitePrincipale;
	}

	public void setSpecialitePrincipale(String specialitePrincipale) {
		this.specialitePrincipale = specialitePrincipale;
	}

	public String getSpecialiteSecondaire() {
		return specialiteSecondaire;
	}

	public void setSpecialiteSecondaire(String specialiteSecondaire) {
		this.specialiteSecondaire = specialiteSecondaire;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public List<MotifsConsultations> getMotifs() {
		return motifs;
	}


	public void setMotifs(ArrayList<MotifsConsultations> motifs) {
		this.motifs = motifs;
	}


	public List<RendezVous> getRdvs() {
		return rdvs;
	}


	public void setRdvs(ArrayList<RendezVous> rdvs) {
		this.rdvs = rdvs;
	}


	public List<CreneauHoraire> getCreneaux() {
		return creneaux;
	}


	public void setCreneaux(ArrayList<CreneauHoraire> creneaux) {
		this.creneaux = creneaux;
	}


	public List<LieuDeConsultation> getLieuDeConsultation() {
		return lieuDeConsultation;
	}


	public void setLieuDeConsultation(ArrayList<LieuDeConsultation> lieuDeConsultation) {
		this.lieuDeConsultation = lieuDeConsultation;
	} 
	
	
		
}
