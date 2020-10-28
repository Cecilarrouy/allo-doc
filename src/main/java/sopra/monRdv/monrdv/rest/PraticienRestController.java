package sopra.monRdv.monrdv.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
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

import sopra.monRdv.monrdv.model.Praticien;
import sopra.monRdv.monrdv.model.Views;
import sopra.monRdv.monrdv.repository.ICreneauHoraireRepository;
import sopra.monRdv.monrdv.repository.IMotifsConsultationsRepository;
import sopra.monRdv.monrdv.repository.IPraticienRepository;
import sopra.monRdv.monrdv.repository.IRendezVousRepository;

@RestController
@RequestMapping("/praticien")
public class PraticienRestController {

	@Autowired
	private IPraticienRepository praticienRepo; 
	
	@Autowired
	private ICreneauHoraireRepository creneauRepo; 
	
	@Autowired
	private IMotifsConsultationsRepository motifsRepo; 
	
	@Autowired
	private IRendezVousRepository rdvRepo; 
	
	@GetMapping("")
	@JsonView(Views.ViewPraticien.class)
	public List<Praticien> findAll() {
		
		return praticienRepo.findAll();
	}
	
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewPraticien.class)
	public Praticien find(@PathVariable Long id) {
		
		Optional<Praticien> optPraticien = praticienRepo.findById(id);

		if (optPraticien.isPresent()) {
			return optPraticien.get();
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
		}
	}
	
	
	@PostMapping("")
	public Praticien create(@RequestBody Praticien praticien) {
		
		return praticienRepo.save(praticien); 
	}
	
	
	@PutMapping("/{id}")
	public Praticien update(@RequestBody Praticien praticien, @PathVariable Long id) {
				
		Optional<Praticien> optPraticien = praticienRepo.findById(id);
		
		if (!optPraticien.isPresent()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		
		praticien = praticienRepo.save(praticien);
		
		return praticien; 
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		praticienRepo.deleteById(id);
	}
	
	
	
}
