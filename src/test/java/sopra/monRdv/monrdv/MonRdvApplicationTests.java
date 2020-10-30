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
import sopra.monRdv.monrdv.repository.IRendezVousRepository;
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
	private IRendezVousRepository rdvRepo; 
	
	@Autowired
	private IUtilisateurRepository utilisateurRepo; 
	
		
	@Test
	void contextLoads() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
		//Admin
		Administrateur admin = new Administrateur(); 
		admin = adminRepo.save(admin); 
		
		
		// Patients 
		
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
		
		//_______________________________________
		
		Patient brice = new Patient (); 
		brice = patientRepo.save(brice);
		
		brice.setCivilite(Civilite.M);
		brice.setNom("Lohrer");
		brice.setPrenom("Brice");
		brice.setTelephone("0612345678");
		brice = patientRepo.save(brice);
		
		brice.setAdresse(new Adresse("93 allée de Thouars", "", "33400", "Talence"));
		brice = patientRepo.save(brice);
		
		brice.setNumeroSS("194076425080");
		brice.setEmail("brice.lohrer@gmail.com");
		brice.setDtNaissance(sdf.parse("04/07/1994"));
		brice = patientRepo.save(brice);
		
		//_______________________________________
		
		Patient kevin = new Patient (); 
		kevin = patientRepo.save(kevin);
		
		kevin.setCivilite(Civilite.M);
		kevin.setNom("Bougis");
		kevin.setPrenom("Kevin");
		kevin.setTelephone("0612345678");
		kevin = patientRepo.save(kevin);
		
		kevin.setAdresse(new Adresse("5bis avenue Villemejan", "", "33600", "Pessac"));
		kevin = patientRepo.save(kevin);
		
		kevin.setNumeroSS("190073325080");
		kevin.setEmail("kevin.bougis@gmail.com");
		kevin.setDtNaissance(sdf.parse("02/07/1990"));
		kevin = patientRepo.save(kevin);
		
		//_______________________________________
		
		Patient manon = new Patient (); 
		manon = patientRepo.save(manon);
		
		manon.setCivilite(Civilite.MME);
		manon.setNom("Charles");
		manon.setPrenom("Manon");
		manon.setTelephone("0612345678");
		manon = patientRepo.save(manon);
		
		manon.setAdresse(new Adresse("5 avenue du stade", "", "33350", "Pujols"));
		manon = patientRepo.save(manon);
		
		manon.setNumeroSS("292083325080");
		manon.setEmail("charles.manon@yahoo.com");
		manon.setDtNaissance(sdf.parse("06/08/1992"));
		manon = patientRepo.save(manon);
		
		//_______________________________________
		
		Patient eric = new Patient (); 
		eric = patientRepo.save(eric);
		
		eric.setCivilite(Civilite.M);
		eric.setNom("Sultan");
		eric.setPrenom("Eric");
		eric.setTelephone("0612345678");
		eric = patientRepo.save(eric);
		
		eric.setAdresse(new Adresse("5 avenue Ariane", "", "33350", "Martignas"));
		eric = patientRepo.save(eric);
		
		eric.setNumeroSS("185019525080");
		eric.setEmail("charles.eric@yahoo.com");
		eric.setDtNaissance(sdf.parse("01/01/1985"));
		eric = patientRepo.save(eric);
		
		
		//Praticiens
		
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
		doc.setSpecialitePrincipale("Médecin généraliste");
		doc.setSpecialiteSecondaire("Homéopathe");
		doc.setEmail("lavielle.jean@doc.fr");
		doc = praticienRepo.save(doc);
		
		//_______________________________________
		
		Praticien doc2 = new Praticien (); 
		doc2 = praticienRepo.save(doc2);
		
		doc2.setCivilite(Civilite.M);
		doc2.setNom("Bernadeau");
		doc2.setPrenom("Denis");
		doc2.setTelephone("0556553622");
		doc2 = praticienRepo.save(doc2); 
		
		doc2.setAdresse(new Adresse("3 place Pey Berland", "", "33000", "Bordeaux"));
		doc2 = praticienRepo.save(doc2); 

		doc2.setNumActivite(235);
		doc2.setSpecialitePrincipale("Oncologue");
		doc2.setEmail("bernadeau.denis@doc.fr");
		doc2 = praticienRepo.save(doc2);
		
		//_______________________________________
		
		Praticien doc3 = new Praticien (); 
		doc3 = praticienRepo.save(doc3);
		
		doc3.setCivilite(Civilite.M);
		doc3.setNom("LATELADE");
		doc3.setPrenom("Jean-Pierre");
		doc3.setTelephone("0556553622");
		doc3 = praticienRepo.save(doc3); 
		
		doc3.setAdresse(new Adresse("3 rue du truc", "", "33000", "Bordeaux"));
		doc3 = praticienRepo.save(doc3); 

		doc3.setNumActivite(235);
		doc3.setSpecialitePrincipale("Chirurgien");
		doc3.setEmail("latelade.jean-pierre@doc.fr");
		doc3 = praticienRepo.save(doc3);
		
		//_______________________________________
		
		Praticien doc4 = new Praticien (); 
		doc4 = praticienRepo.save(doc4);
		
		doc4.setCivilite(Civilite.M);
		doc4.setNom("Danto");
		doc4.setPrenom("Maxime");
		doc4.setTelephone("0556553622");
		doc4 = praticienRepo.save(doc4); 
		
		doc4.setAdresse(new Adresse("3 avenue Gambetta", "", "33400", "Talence"));
		doc4 = praticienRepo.save(doc4); 

		doc4.setNumActivite(235);
		doc4.setSpecialitePrincipale("Ostéopathe");
		doc.setSpecialiteSecondaire("Kinésithérapeute");
		doc4.setEmail("danto.maxime@doc.fr");
		doc4 = praticienRepo.save(doc4);
		
		//Lieux Consult	
		
	
		LieuDeConsultation hopitalDoc = new LieuDeConsultation("Consultations Hôpital");
		hopitalDoc.setAdresse(new Adresse("10 rue Chanzy", "", "40100", "Dax"));
		hopitalDoc = lieuRepo.save(hopitalDoc);
								
		LieuDeConsultation cabinetDoc = new LieuDeConsultation("Consultations Cabinet");
		cabinetDoc.setAdresse(new Adresse("1 rue Chanzy", "", "40100", "Dax"));
		cabinetDoc = lieuRepo.save(cabinetDoc);
		
		LieuDeConsultation domicileDoc = new LieuDeConsultation("Visite à domicile");
		domicileDoc.setAdresse(new Adresse("20 rue Chanzy", "", "40100", "Dax"));
		domicileDoc = lieuRepo.save(domicileDoc);
		
		//_______________________________________
		
		LieuDeConsultation hopitalDoc2 = new LieuDeConsultation("Consultations Hôpital");
		hopitalDoc2.setAdresse(new Adresse("10 place Pey Berland", "", "33000", "Bordeaux"));
		
		hopitalDoc2 = lieuRepo.save(hopitalDoc2);
								
		LieuDeConsultation cabinetDoc2 = new LieuDeConsultation("Consultations Cabinet");
		cabinetDoc2.setAdresse(new Adresse("3 place Pey Berland", "", "33000", "Bordeaux"));
		cabinetDoc2 = lieuRepo.save(cabinetDoc2);
		
		//_______________________________________
		
		LieuDeConsultation hopitalDoc3 = new LieuDeConsultation("Consultations Hôpital");
		hopitalDoc3.setAdresse(new Adresse("30 rue du truc", "", "33000", "Bordeaux"));
		hopitalDoc3 = lieuRepo.save(hopitalDoc3);
								
		LieuDeConsultation cliniqueDoc3 = new LieuDeConsultation("Consultations Clinique");
		cliniqueDoc3.setAdresse(new Adresse("3 rue du truc", "", "33000", "Bordeaux"));
		cliniqueDoc3 = lieuRepo.save(cliniqueDoc3);
		
		//_______________________________________
		
		LieuDeConsultation cabinetDoc4 = new LieuDeConsultation("Consultations Cabinet");
		cabinetDoc4.setAdresse(new Adresse("3 avenue Gambetta", "", "33400", "Talence"));
		cabinetDoc4 = lieuRepo.save(cabinetDoc4);
		
		
		//Rdv
		
		RendezVous rdv1 = new RendezVous();
		rdv1 = rdvRepo.save(rdv1);
		
		rdv1.setStatut(Statut.PLANIFIE);
		rdv1 = rdvRepo.save(rdv1);
		
		//_______________________________________
		
		RendezVous rdv2 = new RendezVous();
		rdv2 = rdvRepo.save(rdv2);
		
		rdv2.setStatut(Statut.PLANIFIE);
		rdv2 = rdvRepo.save(rdv2);
		
		//_______________________________________
		
		RendezVous rdv3 = new RendezVous();
		rdv3 = rdvRepo.save(rdv3);
		
		rdv3.setStatut(Statut.PLANIFIE);
		rdv3 = rdvRepo.save(rdv3);
		
		//_______________________________________
		
		RendezVous rdv4 = new RendezVous();
		rdv4 = rdvRepo.save(rdv4);
		
		rdv4.setStatut(Statut.PLANIFIE);
		rdv4 = rdvRepo.save(rdv4);
		
		//_______________________________________
		
		RendezVous rdv5 = new RendezVous();
		rdv5 = rdvRepo.save(rdv5);
		
		rdv5.setStatut(Statut.PLANIFIE);
		rdv5 = rdvRepo.save(rdv5);
		
		//_______________________________________
		
		RendezVous rdv6 = new RendezVous();
		rdv6 = rdvRepo.save(rdv6);
		
		rdv6.setStatut(Statut.PLANIFIE);
		rdv6 = rdvRepo.save(rdv6);
		
		//_______________________________________
		
		RendezVous rdv7 = new RendezVous();
		rdv7 = rdvRepo.save(rdv7);
		
		rdv7.setStatut(Statut.ANNULE);
		rdv7 = rdvRepo.save(rdv7);
		
		//_______________________________________
		
		RendezVous rdv8 = new RendezVous();
		rdv8 = rdvRepo.save(rdv8);
		
		rdv8.setStatut(Statut.EFFECTUE);
		rdv8 = rdvRepo.save(rdv8);
		
		//_______________________________________
		
		RendezVous rdv9 = new RendezVous();
		rdv9 = rdvRepo.save(rdv9);
		
		rdv9.setStatut(Statut.EFFECTUE);
		rdv9 = rdvRepo.save(rdv9);
		
		//_______________________________________
		
		RendezVous rdv10 = new RendezVous();
		rdv10 = rdvRepo.save(rdv10);
		
		rdv10.setStatut(Statut.DEPLACE);
		rdv10 = rdvRepo.save(rdv10);
		
		
		//_______________________________________		
		
		//Utilisateurs
		
		Utilisateur utilisateur1 = new Utilisateur(); 
		utilisateur1 = utilisateurRepo.save(utilisateur1); 
		
		utilisateur1.setIdentifiant("identifiant1");
		utilisateur1.setMotDePasse("mdp1");
		utilisateur1 = utilisateurRepo.save(utilisateur1);
		
		//_______________________________________
		
		Utilisateur utilisateur2 = new Utilisateur(); 
		utilisateur2 = utilisateurRepo.save(utilisateur2); 
		
		utilisateur2.setIdentifiant("identifiant2");
		utilisateur2.setMotDePasse("mdp2");
		utilisateur2 = utilisateurRepo.save(utilisateur2);
		
		//_______________________________________
		
		Utilisateur utilisateur3 = new Utilisateur(); 
		utilisateur3 = utilisateurRepo.save(utilisateur3); 
		
		utilisateur3.setIdentifiant("identifiant3");
		utilisateur3.setMotDePasse("mdp3");
		utilisateur3 = utilisateurRepo.save(utilisateur3);
		
		
		//Creneaux 
		
		CreneauHoraire creneau1 = new CreneauHoraire(sdf.parse("10/03/2020"));
		CreneauHoraire creneau2 = new CreneauHoraire(sdf.parse("11/03/2020"));
		CreneauHoraire creneau3 = new CreneauHoraire(sdf.parse("12/03/2020"));
		
		creneau1 = creneauRepo.save(creneau1);
		creneau2 = creneauRepo.save(creneau2);
		creneau3 = creneauRepo.save(creneau3);
	
		
		//Motifs Consult
		
		MotifsConsultations motif1 = new MotifsConsultations();
		motif1 = motifsRepo.save(motif1);
		
		motif1.setNom("Consultation médecine générale");
		motif1.setNombreCreneau(1);
		motif1.setTarif("25 euros");
		motif1 = motifsRepo.save(motif1);
				
		//_______________________________________
		
		MotifsConsultations motif2 = new MotifsConsultations();
		motif2 = motifsRepo.save(motif2);
		
		motif2.setNom("Consultation nourrison");
		motif2.setNombreCreneau(3);
		motif2.setTarif("35 euros");
		motif2 = motifsRepo.save(motif2);
		
		//_______________________________________
		
		MotifsConsultations motif3 = new MotifsConsultations();
		motif3 = motifsRepo.save(motif3);
		
		motif3.setNom("Consultation homéopathie");
		motif3.setNombreCreneau(2);
		motif3.setTarif("45 euros");
		motif3 = motifsRepo.save(motif3);
	
		//_______________________________________
		
		//Liens Personne_Utilisateur
		
		cecile.setUtilisateur(utilisateur1);
		cecile = patientRepo.save(cecile);
		
		doc.setUtilisateur(utilisateur2);
		doc = praticienRepo.save(doc); 
		
		admin.setUtilisateur(utilisateur3);
		admin = adminRepo.save(admin); 
		
		
		//Lien Motif_Praticien
		
		motif1.setPraticien(doc);
		motif1 = motifsRepo.save(motif1);
		
		
		motif2.setPraticien(doc);
		motif2 = motifsRepo.save(motif2);
		
		
		motif3.setPraticien(doc);
		motif3 = motifsRepo.save(motif3);
		
		
		//Lien Rdv
		
		rdv1.setPatient(cecile);
		rdv1.setPraticien(doc);
		rdv1.setMotifsConsultations(motif1);
		rdv1 = rdvRepo.save(rdv1);
		
		//_______________________________________
		
		rdv3.setPatient(kevin);
		rdv3.setPraticien(doc);
		rdv3.setMotifsConsultations(motif1);
		rdv3 = rdvRepo.save(rdv3);
		
		rdv4.setPatient(cecile);
		rdv4.setPraticien(doc);
		rdv4.setMotifsConsultations(motif1);
		rdv4 = rdvRepo.save(rdv4);
		
		//_______________________________________
		
		rdv5.setPatient(manon);
		rdv5.setPraticien(doc);
		rdv5.setMotifsConsultations(motif2);
		rdv5 = rdvRepo.save(rdv5);
		
		//_______________________________________
		
		rdv6.setPatient(eric);
		rdv6.setPraticien(doc);
		rdv6.setMotifsConsultations(motif3);
		rdv6 = rdvRepo.save(rdv6);
		
		
		//Lien Creneau
		
		creneau1.setPraticien(doc);
		creneau1.setLieu(cabinetDoc);
		creneau1.setRdv(rdv1);
		creneau1 = creneauRepo.save(creneau1);
		
				
		
		//Lien Praticien et Lieu de Consultation
		
		hopitalDoc.setPraticien(doc);
		hopitalDoc = lieuRepo.save(hopitalDoc);
		
		cabinetDoc.setPraticien(doc);
		cabinetDoc = lieuRepo.save(cabinetDoc);
		
		domicileDoc.setPraticien(doc);
		domicileDoc = lieuRepo.save(domicileDoc);
		
		//_______________________________________
		
		hopitalDoc2.setPraticien(doc2);
		hopitalDoc2 = lieuRepo.save(hopitalDoc2);
		
		cabinetDoc2.setPraticien(doc2);
		cabinetDoc2 = lieuRepo.save(cabinetDoc2);
		
		//_______________________________________
		
		hopitalDoc3.setPraticien(doc3);
		hopitalDoc3 = lieuRepo.save(hopitalDoc3);
		
		cliniqueDoc3.setPraticien(doc2);
		cliniqueDoc3 = lieuRepo.save(cliniqueDoc3);
		
		//_______________________________________
		
		cabinetDoc4.setPraticien(doc4);
		cabinetDoc4 = lieuRepo.save(cabinetDoc4);
		
				
	}

}
