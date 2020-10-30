package sopra.monRdv.monrdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.monRdv.monrdv.model.MotifsConsultations;

public interface IMotifsConsultationsRepository extends JpaRepository<MotifsConsultations, Long>{

	@Query("select m from MotifsConsultations m where m.praticien.id = :id")
	List<MotifsConsultations> findAllByPraticien(@Param("id") Long id);
	
}
