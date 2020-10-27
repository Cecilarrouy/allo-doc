package sopra.monRdv.monrdv;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sopra.monRdv.monrdv.model.Administrateur;
import sopra.monRdv.monrdv.model.Adresse;
import sopra.monRdv.monrdv.model.Civilite;
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
		
		
		//Utilisateur
		Utilisateur utilisateur1 = new Utilisateur(); 
		utilisateur1 = utilisateurRepo.save(utilisateur1); 
		
		utilisateur1.setIdentifiant("identifiant1");
		utilisateur1.setMotDePasse("mdp1");
		utilisateur1 = utilisateurRepo.save(utilisateur1);
		
		
		//Creneaux 
		
		//Lieux Consult
		
		//Motifs Consult
		
		//Rdv
		
	}

}
