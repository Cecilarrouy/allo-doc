package sopra.monRdv.monrdv;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
	void contextLoads() {
			
	}

}
