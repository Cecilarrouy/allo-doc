package sopra.monRdv.monrdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.monRdv.monrdv.model.Utilisateur;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
