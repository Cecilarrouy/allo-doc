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

import sopra.monRdv.monrdv.model.LieuDeConsultation;
import sopra.monRdv.monrdv.model.Views;
import sopra.monRdv.monrdv.repository.ILieuDeConsultationRepository;

@RestController
@RequestMapping("/lieu")
public class LieuDeConsultationRestController {

	@Autowired
	private ILieuDeConsultationRepository lieuRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewLieuDeConsultation.class)
	public List<LieuDeConsultation> list() {
		return lieuRepo.findAll();
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewLieuDeConsultation.class)
	public LieuDeConsultation get(@PathVariable Long id) {

		Optional<LieuDeConsultation> optLieu =lieuRepo.findById(id);

		if (!optLieu.isPresent()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find ressource");
		} else {
			return optLieu.get();
			
		}
		
	}
	
	@PostMapping("")
	public LieuDeConsultation create(@RequestBody LieuDeConsultation lieu) {
		lieu = lieuRepo.save(lieu);

		return lieu;
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewLieuDeConsultation.class)
	public LieuDeConsultation update(@RequestBody LieuDeConsultation creneau, @PathVariable Long id) {
		Optional<LieuDeConsultation> optLieu = lieuRepo.findById(id);

		if (!optLieu.isPresent()) {
			
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		return lieuRepo.save(creneau);
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable Long id) {
		lieuRepo.deleteById(id);
	}
	
	
}
