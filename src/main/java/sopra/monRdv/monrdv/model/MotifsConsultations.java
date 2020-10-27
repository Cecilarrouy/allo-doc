package sopra.monRdv.monrdv.model;

public class MotifsConsultations {

	private Long id; 
	private int version; 
	private String nom; 
	private int nombreCreneau; 
	private String tarif;
	
	private Praticien praticien; 
	private RendezVous rendezVous; 

	
	public MotifsConsultations() {
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
