package sopra.monRdv.monrdv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class Administrateur extends Personne {

	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;


	public Administrateur() {
		super();
	}


	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	} 
	
	
	// toString

	@Override
	public String toString() {
		return "Administrateur [id=" + id + "]";
	}
	
	
	
}
