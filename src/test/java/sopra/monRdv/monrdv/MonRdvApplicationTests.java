package sopra.monRdv.monrdv;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sopra.monRdv.monrdv.model.Adresse;
import sopra.monRdv.monrdv.model.LieuDeConsultation;
import sopra.monRdv.monrdv.model.MotifsConsultations;
import sopra.monRdv.monrdv.model.RendezVous;
import sopra.monRdv.monrdv.model.Statut;
import sopra.monRdv.monrdv.model.Administrateur;
import sopra.monRdv.monrdv.model.Adresse;
import sopra.monRdv.monrdv.model.Civilite;
import sopra.monRdv.monrdv.model.CreneauHoraire;
import sopra.monRdv.monrdv.model.Patient;
import sopra.monRdv.monrdv.model.Praticien;
import sopra.monRdv.monrdv.model.Utilisateur;
import sopra.monRdv.monrdv.repository.IAdministrateurRepository;
import sopra.monRdv.monrdv.repository.ICreneauHoraireRepository;
import sopra.monRdv.monrdv.repository.ILieuDeConsultationRepository;
import sopra.monRdv.monrdv.repository.IMotifsConsultationsRepository;
import sopra.monRdv.monrdv.repository.IPatientRepository;
import sopra.monRdv.monrdv.repository.IPraticienRepository;
import sopra.monRdv.monrdv.repository.IRendezVousRepostiroy;
import sopra.monRdv.monrdv.repository.IUtilisateurRepository;


@SpringBootTest
class MonRdvApplicationTests {

	@Autowired
	private IAdministrateurRepository adminRepo; 
	
	@Autowired
	private ICreneauHoraireRepository creneauRepo; 
	
	@Autowired
	private ILieuDeConsultationRepository lieuRepo; 
	
	@Autowired
	private IMotifsConsultationsRepository motifsRepo; 
	
	@Autowired
	private IPatientRepository patientRepo; 
	
	@Autowired
	private IPraticienRepository praticienRepo; 
	
	@Autowired
	private IRendezVousRepostiroy rdvRepo; 
	
	@Autowired
	private IUtilisateurRepository utilisateurRepo; 
	
		
	@Test
	void contextLoads() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
		//Admin
		Administrateur admin = new Administrateur(); 
		admin = adminRepo.save(admin); 
		
		
		//Lieux Consult
		LieuDeConsultation hopital = new LieuDeConsultation("Hopital");
		hopital.setAdresse(new Adresse("15 rue des Lilas", null, "33600", "Pessac"));
								
		LieuDeConsultation cabinet = new LieuDeConsultation("Cabinet");
		cabinet.setAdresse(new Adresse("avenue du truc ", null, "33400", "Talence"));
		
		LieuDeConsultation domicile = new LieuDeConsultation("Domicile");
		domicile.setAdresse(new Adresse("avenue du truc ", null, "33400", "Talence"));
		
		hopital = lieuRepo.save(hopital);
		cabinet = lieuRepo.save(cabinet);
		domicile = lieuRepo.save(domicile);

		
		// Patient 
		Patient cecile = new Patient (); 
		cecile = patientRepo.save(cecile);
		
		cecile.setCivilite(Civilite.MLLE);
		cecile.setNom("Larrouy");
		cecile.setPrenom("Cécile");
		cecile.setTelephone("0608050400");
		cecile = patientRepo.save(cecile);
		
		cecile.setAdresse(new Adresse("93 Boulevard Georges V", "Résidence Zola", "33400", "Talence"));
		cecile = patientRepo.save(cecile);
		
		cecile.setNumeroSS("294044025080");
		cecile.setEmail("cecile.larrouy@outlook.fr");
		cecile.setDtNaissance(sdf.parse("23/04/1994"));
		cecile = patientRepo.save(cecile);
		
		
		//Praticien
		Praticien doc = new Praticien (); 
		doc = praticienRepo.save(doc);
		
		doc.setCivilite(Civilite.M);
		doc.setNom("LAVIELLE");
		doc.setPrenom("Jean");
		doc.setTelephone("0558553622");
		doc = praticienRepo.save(doc); 
		
		doc.setAdresse(new Adresse("1 rue Chanzy", "", "40100", "Dax"));
		doc = praticienRepo.save(doc); 

		doc.setNumActivite(235);
		doc.setSpecialitePrincipale("Médecein généraliste");
		doc.setSpecialiteSecondaire("Homéopathie");
		doc.setEmail("lavielle.jean@doc.fr");
		doc = praticienRepo.save(doc);
		
				
		//Rdv;
		RendezVous rendezVous1 = new RendezVous(sdf.parse("10/03/2020"),"Bon état de santé");
		rendezVous1.setStatut(Statut.PLANIFIE);
		RendezVous rendezVous2 = new RendezVous(sdf.parse("12/03/2020"),"Bon état de santé");
		rendezVous2.setStatut(Statut.ANNULE);
		
		rendezVous1 = rdvRepo.save(rendezVous1);
		rendezVous2 = rdvRepo.save(rendezVous2);
		
		
		//Utilisateur
		Utilisateur utilisateur1 = new Utilisateur(); 
		utilisateur1 = utilisateurRepo.save(utilisateur1); 
		
		utilisateur1.setIdentifiant("identifiant1");
		utilisateur1.setMotDePasse("mdp1");
		utilisateur1 = utilisateurRepo.save(utilisateur1);
		
		
		//Creneaux 
		CreneauHoraire creneau1 = new CreneauHoraire(sdf.parse("10/03/2020"));
		CreneauHoraire creneau2 = new CreneauHoraire(sdf.parse("11/03/2020"));
		CreneauHoraire creneau3 = new CreneauHoraire(sdf.parse("12/03/2020"));
		
		creneau1 = creneauRepo.save(creneau1);
		creneau2 = creneauRepo.save(creneau2);
		creneau3 = creneauRepo.save(creneau3);
	
		
		//Motifs Consult
		MotifsConsultations motif1 = new MotifsConsultations("covid", 3, "25 euros");
		MotifsConsultations motif2 = new MotifsConsultations("fievre", 1, "25 euros");
		MotifsConsultations motif3 = new MotifsConsultations("gastro", 1, "25 euros");
		
		motif1 = motifsRepo.save(motif1);
		motif2 = motifsRepo.save(motif2);
		motif3 = motifsRepo.save(motif3);
	
		
		//Lien Personne_Utilisateur
		cecile.setUtilisateur(utilisateur1);
		cecile = patientRepo.save(cecile);
		
		//Lien Rdv
		rendezVous1.setPatient(cecile);
		rendezVous1.setPraticien(doc);
		rendezVous1.setMotifsConsultations(motif1);
		rendezVous1 = rdvRepo.save(rendezVous1);
		
		creneau1.setRdv(rendezVous1);
		creneau1 = creneauRepo.save(creneau1);
		
		//Lien Creneau
		creneau1.setPraticien(doc);
		creneau1.setLieu(cabinet);
		
		creneau1 = creneauRepo.save(creneau1);
		
		//Lien Motif_Praticien
		motif1.setPraticien(doc);
		
		motif1 = motifsRepo.save(motif1);
		
	}

}
