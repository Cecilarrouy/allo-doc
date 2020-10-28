package sopra.monRdv.monrdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.monRdv.monrdv.model.Personne;

public interface IPersonneRepository  extends JpaRepository<Personne, Long>{

}
