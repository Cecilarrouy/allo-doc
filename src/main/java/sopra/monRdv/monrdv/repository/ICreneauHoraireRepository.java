package sopra.monRdv.monrdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import sopra.monRdv.monrdv.model.CreneauHoraire;
import sopra.monRdv.monrdv.model.LieuDeConsultation;

public interface ICreneauHoraireRepository  extends JpaRepository<CreneauHoraire, Long>{
	
	//affichage des creneaux horaires par praticien et par lieu de consultation
//			@Query("select cre from CreneauHoraire cre where cre.praticien = :praticien and cre.lieu = :lieu")
//			List<CreneauHoraire> findCreneauHoraireByPraticienAndLieu(@Param("phase") CreneauHoraire creneauHoraire, @Param("lieu") LieuDeConsultation lieu );			
			
}
