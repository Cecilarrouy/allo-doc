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
	
	@Query("select p from Praticien p where p.specialitePrincipale = :specialite or p.specialiteSecondaire =:specialite")
	List<Praticien> findAllBySpecialite(@Param("specialite") String specialite);
	
	@Query("select p from Praticien p where p.specialitePrincipale = :nom or p.specialiteSecondaire =:nom or p.nom = :nom")
	List<Praticien> findAllBySpecialiteOuNom(@Param("nom") String nom);
	
	@Query("select p from Praticien p where p.nom = :nom and p.adresse.ville = :ville")
	List<Praticien> findAllBySpecialiteOuNomOuVille(@Param("nom") String nom, @Param("ville") String ville);
	
//	@Query("select p from Praticien p where p.specialitePrincipale = :specialite or specialiteSecondaire = :specialite and a.effectuee = :effectuee")
//	List<Praticien> findAllBySpecialiteAndByLieu(@Param("specialite") String specialite,@Param("lieu") String lieu);
	
}
