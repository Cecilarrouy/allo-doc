package sopra.monRdv.monrdv.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import sopra.monRdv.monrdv.model.Patient;
import sopra.monRdv.monrdv.model.Praticien;
import sopra.monRdv.monrdv.model.Views;
import sopra.monRdv.monrdv.repository.IPatientRepository;
import sopra.monRdv.monrdv.repository.IRendezVousRepository;

@RestController
@RequestMapping("/patient")
public class PatientRestController {

	@Autowired
	private IPatientRepository patientRepo; 
	
	@Autowired
	private IRendezVousRepository rdvRepo; 
	
	
	@GetMapping("")
	@JsonView(Views.ViewPatient.class)
	public List<Patient> findAll() {
		
		return patientRepo.findAll();
	}
	
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewPatient.class)
	public Patient find(@PathVariable Long id) {
		
		Optional<Patient> optPatient = patientRepo.findById(id);

		if (optPatient.isPresent()) {
			return optPatient.get();
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
		}
	}
	
	
	@PostMapping("")
	public Patient create(@RequestBody Patient patient) {
		
		return patientRepo.save(patient); 
	}
	
	
	@PutMapping("/{id}")
	public Patient update(@RequestBody Patient patient, @PathVariable Long id) {
				
		Optional<Patient> optPatient = patientRepo.findById(id);
		
		if (!optPatient.isPresent()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		
		patient = patientRepo.save(patient);
		
		return patient; 
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		patientRepo.deleteById(id);
	}
	

}
