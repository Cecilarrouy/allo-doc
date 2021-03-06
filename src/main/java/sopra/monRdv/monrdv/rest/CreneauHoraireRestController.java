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

import sopra.monRdv.monrdv.model.CreneauHoraire;
import sopra.monRdv.monrdv.model.Views;
import sopra.monRdv.monrdv.repository.ICreneauHoraireRepository;

@RestController
@RequestMapping("/creneau")
public class CreneauHoraireRestController {

	@Autowired
	private ICreneauHoraireRepository creneauRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewCreneauHoraire.class)
	public List<CreneauHoraire> list() {
		return creneauRepo.findAll();
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewCreneauHoraire.class)
	public CreneauHoraire get(@PathVariable Long id) {

		Optional<CreneauHoraire> optCreneau =creneauRepo.findById(id);

		if (!optCreneau.isPresent()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find ressource");
		} else {
			return optCreneau.get();
			
		}
		
	}
	
	@PostMapping("")
	public CreneauHoraire create(@RequestBody CreneauHoraire creneau) {
		creneau = creneauRepo.save(creneau);

		return creneau;
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewCreneauHoraire.class)
	public CreneauHoraire update(@RequestBody CreneauHoraire creneau, @PathVariable Long id) {
		Optional<CreneauHoraire> optCreneau = creneauRepo.findById(id);

		if (!optCreneau.isPresent()) {
			
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		return creneauRepo.save(creneau);
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable Long id) {
		creneauRepo.deleteById(id);
	}
	
	
}
