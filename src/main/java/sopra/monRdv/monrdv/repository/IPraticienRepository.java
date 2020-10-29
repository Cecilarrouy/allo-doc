package sopra.monRdv.monrdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.monRdv.monrdv.model.Praticien;

public interface IPraticienRepository extends JpaRepository<Praticien, Long>{

	@Query("select p from Praticien p where p.nom = :nom")
	List<Praticien> findAllByNom(@Param("nom") String nom);
	
	@Query("select p from Praticien p where p.prenom = :prenom")
	List<Praticien> findAllByPrenom(@Param("prenom") String prenom);
	
	@Query("select p from Praticien p where p.prenom = :prenom")
	List<Praticien> findAllByNomComplet(@Param("prenom") String prenom);
	
	@Query("select p from Praticien p where p.adresse.ville = :ville")
	List<Praticien> findAllByVille(@Param("ville") String ville);
	
	
	
}
