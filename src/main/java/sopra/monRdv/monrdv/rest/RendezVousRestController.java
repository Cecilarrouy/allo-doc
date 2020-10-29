package sopra.monRdv.monrdv.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.fasterxml.jackson.annotation.JsonView;

import sopra.monRdv.monrdv.model.RendezVous;
import sopra.monRdv.monrdv.model.Views;
import sopra.monRdv.monrdv.repository.ICreneauHoraireRepository;
import sopra.monRdv.monrdv.repository.IMotifsConsultationsRepository;
import sopra.monRdv.monrdv.repository.IPatientRepository;
import sopra.monRdv.monrdv.repository.IPraticienRepository;
import sopra.monRdv.monrdv.repository.IRendezVousRepository;

@RestController
@RequestMapping("/rdv")
@CrossOrigin("*")
public class RendezVousRestController {

	@Autowired
	private IRendezVousRepository rdvRepo; 
	
	@Autowired
	private IPatientRepository patientRepo; 
	
	@Autowired
	private IPraticienRepository praticienRepo; 
	
	@Autowired
	private ICreneauHoraireRepository creneauRepo; 
	
	@Autowired
	private IMotifsConsultationsRepository motifsRepo; 
	
	
	@GetMapping("")
	@JsonView(Views.ViewRendezVous.class)
	public List<RendezVous> findAll() {
		
		return rdvRepo.findAll();
	}
	
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewRendezVous.class)
	public RendezVous find(@PathVariable Long id) {
		
		Optional<RendezVous> optRdv = rdvRepo.findById(id);

		if (optRdv.isPresent()) {
			return optRdv.get();
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
		}
	}
	
	@PostMapping("")
	public RendezVous create(@RequestBody RendezVous rdv) {
		
		return rdvRepo.save(rdv); 
	}
	
	
	@PutMapping("/{id}")
	public RendezVous update(@RequestBody RendezVous rdv, @PathVariable Long id) {
			
	Optional<RendezVous> optRdv = rdvRepo.findById(id);
	
	if (!optRdv.isPresent()) {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	}
	
	rdv = rdvRepo.save(rdv);
	
	return rdv; 
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		rdvRepo.deleteById(id);
	}	
}
