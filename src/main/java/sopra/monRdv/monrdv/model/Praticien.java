package sopra.monRdv.monrdv.model;

import java.util.ArrayList;

public class Praticien extends Personne {
		
	private int numActivite; 
	private String specialitePrincipale; 
	private String specialiteSecondaire; 
	private String email;
	
	private ArrayList <MotifsConsultations> motifs = new ArrayList <MotifsConsultations>(); 
	private ArrayList<RendezVous> rdvs = new ArrayList<RendezVous>(); 
	private ArrayList<LieuDeConsultation> lieux = new ArrayList<LieuDeConsultation>(); 
	private ArrayList<CreneauHoraire> creneaux = new ArrayList<CreneauHoraire>(); 

	
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


	public ArrayList<MotifsConsultations> getMotifs() {
		return motifs;
	}


	public void setMotifs(ArrayList<MotifsConsultations> motifs) {
		this.motifs = motifs;
	}


	public ArrayList<RendezVous> getRdvs() {
		return rdvs;
	}


	public void setRdvs(ArrayList<RendezVous> rdvs) {
		this.rdvs = rdvs;
	}


	public ArrayList<LieuDeConsultation> getLieux() {
		return lieux;
	}


	public void setLieux(ArrayList<LieuDeConsultation> lieux) {
		this.lieux = lieux;
	}


	public ArrayList<CreneauHoraire> getCreneaux() {
		return creneaux;
	}


	public void setCreneaux(ArrayList<CreneauHoraire> creneaux) {
		this.creneaux = creneaux;
	} 
		
}
