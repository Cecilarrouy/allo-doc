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

import sopra.monRdv.monrdv.model.MotifsConsultations;
import sopra.monRdv.monrdv.model.Views;
import sopra.monRdv.monrdv.repository.IMotifsConsultationsRepository;

@RestController
@RequestMapping("/motifs")
@CrossOrigin("*")
public class MotifsConsultationsRestController {
	
	@Autowired
	private IMotifsConsultationsRepository motifsRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewMotifsConsultations.class)
	public List<MotifsConsultations> list() {
		return motifsRepo.findAll();
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewMotifsConsultations.class)
	public MotifsConsultations get(@PathVariable Long id) {

		Optional<MotifsConsultations> optMotif =motifsRepo.findById(id);

		if (!optMotif.isPresent()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find ressource");
		} else {
			return optMotif.get();
			
		}
		
	}
	
	@PostMapping("")
	public MotifsConsultations create(@RequestBody MotifsConsultations motif) {
		motif = motifsRepo.save(motif);

		return motif;
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewMotifsConsultations.class)
	public MotifsConsultations update(@RequestBody MotifsConsultations motif, @PathVariable Long id) {
		Optional<MotifsConsultations> optMotif = motifsRepo.findById(id);

		if (!optMotif.isPresent()) {
			
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		return motifsRepo.save(motif);
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable Long id) {
		motifsRepo.deleteById(id);
	}
	

}
